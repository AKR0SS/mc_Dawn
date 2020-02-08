package mc_Dawn.main.modules;

import java.util.ArrayList;

import mc_Dawn.main.modules.misc.*;
import mc_Dawn.main.modules.movement.*;
import mc_Dawn.main.modules.player.*;
import mc_Dawn.main.modules.render.*;

public class ModuleManager {
	private static ArrayList<Module> modules = new ArrayList<Module>();
	
	public ModuleManager() {
		// COMBAT
		
		// MOVEMENT
		addModule(new Sprint());
		addModule(new Step());
		addModule(new Fly());
		
		// PLAYER
		addModule(new FreeCam());
		
		// RENDER
		addModule(new Fullbright());
		addModule(new ChestESP());
		
		// MISC
		addModule(new ClickGUI()); //Key: Insert
	}
	
	public static void addModule(Module m) {
		modules.add(m);
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public static void onUpdate() {
		for(Module m: modules) {
			m.onUpdate();
		}
	}
	public static void onRender() {
		for(Module m: modules) {
			m.onRender();
		}
	}
	
	public static void onKeyPressed(int k) {
		for(Module m: modules) {
			if(m.getKey() == k) {
				m.toggle();
			}
		}
	}
	
	public Module getModuleByName(String name) {
		return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
}
