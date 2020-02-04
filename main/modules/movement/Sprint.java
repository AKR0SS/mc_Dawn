package mc_Dawn.main.modules.movement;

import org.lwjgl.input.Keyboard;

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
}
