package mc_Dawn.main.modules;

import java.util.ArrayList;

public class ModuleManager {
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public ModuleManager() {
		// COMBAT
		
		// MOVEMENT
		
		// PLAYER
		
		// RENDER
		
		// MISC
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	public Module getModuleByName(String name) {
		return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
}
