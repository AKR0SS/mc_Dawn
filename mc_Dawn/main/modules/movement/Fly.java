package mc_Dawn.main.modules.movement;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import de.Hero.settings.Setting;
import mc_Dawn.main.Dawn;
import mc_Dawn.main.event.EventTarget;
import mc_Dawn.main.event.events.EventUpdate;
import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;
import net.minecraft.client.network.NetHandlerPlayClient;

public class Fly extends Module {
	String mode = Dawn.instance.settingsManager.getSettingByName("Fly Mode").getValString();
	
	public Fly() {
		super("Fly", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	
	
	@Override
	public void setup() {
		ArrayList<String> options = new ArrayList<>();
		
		options.add("Vanilla");
		options.add("Sever");
		
		Dawn.instance.settingsManager.rSetting(new Setting("Fly Mode", this, "Server", options));
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		
		this.setDisplayName("Fly §7Vanilla");
		
		if(mode.equalsIgnoreCase("Servers")) {
			double y;
			double y1;
			mc.player.motionY = 0;
			if(mc.player.ticksExisted % 3 == 0) {
				y = mc.player.posY - 1.0E-10D;
				
				//CPacketPlayerPosition
			}
			y1 = mc.player.posY + 1.0E-10D;
			mc.player.setPosition(mc.player.posX, y1, mc.player.posZ);
		}
		
		if (mode.equalsIgnoreCase("Vanilla")) 
			mc.player.capabilities.isFlying = true;
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		if(mode.equalsIgnoreCase("Vanilla"))
			mc.player.capabilities.isFlying = false;
	}
}
