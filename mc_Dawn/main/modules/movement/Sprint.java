package mc_Dawn.main.modules.movement;

import org.lwjgl.input.Keyboard;

import mc_Dawn.main.event.EventTarget;
import mc_Dawn.main.event.events.EventUpdate;
import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;

public class Sprint extends Module {
	public Sprint() {
		super("Sprint", Keyboard.KEY_Z, Category.MOVEMENT);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		if(!mc.player.isCollidedHorizontally && mc.player.moveForward > 0)
			mc.player.setSprinting(true);
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.player.setSprinting(false);
	}
}