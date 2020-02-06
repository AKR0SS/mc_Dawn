package de.Hero.clickgui.util;

import java.awt.Color;

import mc_Dawn.main.Dawn;

/**
 *  Made by HeroCode
 *  it's free to use
 *  but you have to credit me
 *
 *  @author HeroCode
 */
public class ColorUtil {
	
	public static Color getClickGUIColor(){
		return new Color((int)Dawn.instance.settingsManager.getSettingByName("GuiRed").getValDouble(), (int)Dawn.instance.settingsManager.getSettingByName("GuiGreen").getValDouble(), (int)Dawn.instance.settingsManager.getSettingByName("GuiBlue").getValDouble());
	}
}
