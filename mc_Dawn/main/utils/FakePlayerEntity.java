package mc_Dawn.main.utils;

import mc_Dawn.main.compatibility.Dawn_Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.player.EntityPlayer;

public class FakePlayerEntity extends EntityOtherPlayerMP {
	public FakePlayerEntity() {
		super(Dawn_Minecraft.getWorld(), Dawn_Minecraft.getPlayer().getGameProfile());
		copyLocationAndAnglesFrom(Dawn_Minecraft.getPlayer());
		
		//Inventory Fix
		inventory.copyInventory(Dawn_Minecraft.getPlayer().inventory);
		getDataManager().set(EntityPlayer.PLAYER_MODEL_FLAG, Dawn_Minecraft.getPlayer().getDataManager().get(EntityPlayer.PLAYER_MODEL_FLAG));
			
			// fix rotation
			rotationYawHead = Dawn_Minecraft.getPlayer().rotationYawHead;
			renderYawOffset = Dawn_Minecraft.getPlayer().renderYawOffset;
			
			// spawn
			Dawn_Minecraft.getWorld().addEntityToWorld(getEntityId(), this);
		}
		
	public void resetPlayerPosition() {
			Dawn_Minecraft.getPlayer().setPositionAndRotation(posX, posY, posZ, rotationYaw, rotationPitch);
	}
		
	public void despawn(){
			Dawn_Minecraft.getWorld().removeEntityFromWorld(getEntityId());
	}
}