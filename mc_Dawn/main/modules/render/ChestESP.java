package mc_Dawn.main.modules.render;

import org.lwjgl.input.Keyboard;

import mc_Dawn.main.modules.Category;
import mc_Dawn.main.modules.Module;
import mc_Dawn.main.utils.RenderUtil;
import net.minecraft.tileentity.TileEntityChest;

public class ChestESP extends Module {
	public ChestESP() {
		super("ChestESP", Keyboard.KEY_NONE, Category.RENDER);
	}
	
	public void onRender() {
		if(this.isToggled()) {
			for(Object o: mc.world.loadedTileEntityList) {
				RenderUtil.blockESPBox(((TileEntityChest)o).getPos());
			}
		}
	}
}
