package mc_Dawn.main.modules.movement;

import org.lwjgl.input.Keyboard;

import mc_Dawn.main.event.EventTarget;
import mc_Dawn.main.event.events.EventUpdate;
import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;

public class Step extends Module {
	public Step() {
		super("Step", Keyboard.KEY_C, Category.MOVEMENT);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		mc.player.stepHeight = 2F;
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.player.stepHeight = .5F;
	}
}
