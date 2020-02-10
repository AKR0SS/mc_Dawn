package mc_Dawn.main;

import org.lwjgl.opengl.Display;

import de.Hero.clickgui.ClickGUI;
import de.Hero.settings.SettingsManager;
import mc_Dawn.main.event.EventManager;
import mc_Dawn.main.event.EventTarget;
import mc_Dawn.main.event.events.EventKey;
import mc_Dawn.main.modules.ModuleManager;

public class Dawn {
	public String Title = "1.12.2 Dawn Client",
				  Version = "0.1",
				  Author = "AKROSS";
	
	public static Dawn instance = new Dawn();
	
	public SettingsManager settingsManager;
	public EventManager eventManager;
	public ModuleManager moduleManager;
	public ClickGUI clickGui;
	
	public void startClient() {
		settingsManager = new SettingsManager();
		eventManager = new EventManager();
		moduleManager = new ModuleManager();
		clickGui = new ClickGUI();
		
		System.out.println("\n" + "[" + Title + "] Starting . . . . . . ." + 
				   		   "\n" + "v" + Version + 
				   		   "\n" + "Created by " + Author);
		
		Display.setTitle(Title + " v" + Version);
		
		eventManager.register(this);
	}
	
	public void stopClient() {
		eventManager.unregister(this);
	}
	
	@EventTarget
	public void onKey(EventKey event) {
		moduleManager.getModules().stream().filter(module -> module.getKey() == event.getKey()).forEach(module -> module.toggle());
	}
}