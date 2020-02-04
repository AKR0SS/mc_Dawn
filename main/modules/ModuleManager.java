package mc_Dawn.main.modules;

import java.util.ArrayList;

import mc_Dawn.main.modules.movement.*;
import mc_Dawn.main.modules.render.Fullbright;

public class ModuleManager {
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public ModuleManager() {
		// COMBAT
		
		// MOVEMENT
		modules.add(new Sprint()); //Key: Z
		modules.add(new Step()); //Key: C
		
		// PLAYER
		
		// RENDER
		modules.add(new Fullbright()); //Key: X
		
		// MISC
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	public Module getModuleByName(String name) {
		return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
}
