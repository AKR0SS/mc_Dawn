package mc_Dawn.main.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.multiplayer.WorldClient;

public final class Dawn_Minecraft {
	public static final String VERSION = "1.12.2";
	
	private static final Minecraft mc = Minecraft.getMinecraft();
	
	public static EntityPlayerSP getPlayer() {
		return mc.player;
	}
	
	public static WorldClient getWorld() {
		return mc.world;
	}
}
