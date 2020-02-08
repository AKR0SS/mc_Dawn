package mc_Dawn.main.modules;

import java.util.ArrayList;

import mc_Dawn.main.modules.misc.*;
import mc_Dawn.main.modules.movement.*;
import mc_Dawn.main.modules.player.*;
import mc_Dawn.main.modules.render.*;

public class ModuleManager {
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public ModuleManager() {
		// COMBAT
		
		// MOVEMENT
		modules.add(new Sprint()); //Key: Z
		modules.add(new Step()); //Key: C
		modules.add(new Fly());
		
		// PLAYER
		modules.add(new FreeCam());
		
		// RENDER
		modules.add(new Fullbright()); //Key: X
		modules.add(new ChestESP());
		
		// MISC
		modules.add(new ClickGUI()); //Key: Insert
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	public Module getModuleByName(String name) {
		return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
}
