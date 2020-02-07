package mc_Dawn.main.modules.render;

import org.lwjgl.input.Keyboard;

import mc_Dawn.main.event.EventTarget;
import mc_Dawn.main.event.events.EventUpdate;
import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;

public class Fullbright extends Module {
	private float oldBrightness;
	
	public Fullbright() {
		super("Fullbright", Keyboard.KEY_NONE, Category.RENDER);
	}
	
	@Override
	public void onEnable() {
		super.onEnable();
		
		oldBrightness = mc.gameSettings.gammaSetting;
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		mc.gameSettings.gammaSetting = 10F;
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.gameSettings.gammaSetting = oldBrightness;
	}
}
