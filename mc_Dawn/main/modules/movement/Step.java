package mc_Dawn.main.modules.movement;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import de.Hero.settings.Setting;
import mc_Dawn.main.Dawn;
import mc_Dawn.main.event.EventTarget;
import mc_Dawn.main.event.events.EventUpdate;
import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;

public class Step extends Module {
	String mode = Dawn.instance.settingsManager.getSettingByName("Step Height").getValString();
	
	public Step() {
		super("Step", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	@Override
	public void setup() {
		ArrayList<String> options = new ArrayList<>();
		
		Dawn.instance.settingsManager.rSetting(new Setting("Step Height", this, 1, .5, 4, false));
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
