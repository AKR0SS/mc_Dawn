package mc_Dawn.main.modules.render;

import mc_Dawn.main.Dawn;
import mc_Dawn.main.modules.Module;
import mc_Dawn.main.modules.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;

public class GuiIngameHook extends GuiIngame{
	public GuiIngameHook(Minecraft mcIn) {
		super(mcIn);
	}
	
	public void renderGameOverlay(float partialTicks) {
		mc.fontRendererObj.drawStringWithShadow("Dawn Client", 900, 4, 0xFFCCFF);
	
		super.renderGameOverlay(partialTicks);
		
		ScaledResolution scaledresolution = new ScaledResolution(this.mc);
		FontRenderer frontrednerer = this.getFontRenderer();
		GlStateManager.enableBlend();
		
		int count = 0;
		
		for(Module m: Dawn.instance.moduleManager.getModules()) {
			if(m.isToggled()) {
				mc.fontRendererObj.drawString(m.getName(), 4, 6 + (count*10), 0xFFCCFF);
			}
		}
	}
}
