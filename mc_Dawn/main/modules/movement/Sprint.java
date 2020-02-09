package mc_Dawn.main.modules.movement;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.network.NetHandlerHandshakeMemory;
import mc_Dawn.main.event.EventTarget;
import mc_Dawn.main.event.events.EventUpdate;
import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;

public class Sprint extends Module {
	public Sprint() {
		super("Sprint", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		//ClientPlayerEntity player = mc.player;	
			//bypass

		/*
		* if isSneaking,
		*	 collidedHorizontally,
		*	 isInWater
		*
		* 	 return;
		*/

		if(!((mc.player.moveForward) > 0))
			mc.player.setSprinting(true);
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.player.setSprinting(false);
	}
}