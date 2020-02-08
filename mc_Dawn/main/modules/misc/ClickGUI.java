package mc_Dawn.main.modules.misc;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import de.Hero.settings.Setting;
import mc_Dawn.main.Dawn;
import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;

public class ClickGUI extends Module {
	public ClickGUI() {
		super("ClickGUI", Keyboard.KEY_INSERT, Category.MISC);
	}
	
	@Override
	public void setup() {
		ArrayList<String> options = new ArrayList<>();
		
		options.add("New");
		options.add("JellyLike");
		
		Dawn.instance.settingsManager.rSetting(new Setting("Design", this, "New", options));
		
		Dawn.instance.settingsManager.rSetting(new Setting("GuiRed", this, 110, 0, 255, true));
		Dawn.instance.settingsManager.rSetting(new Setting("GuiGreen", this, 255, 0, 255, true));
		Dawn.instance.settingsManager.rSetting(new Setting("GuiBlue", this, 190, 0, 255, true));
	}
	
	@Override
	public void onEnable() {
		super.onEnable();
		
		mc.displayGuiScreen(Dawn.instance.clickGui);
		toggle();
	}
}
