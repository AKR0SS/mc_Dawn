package mc_Dawn.main.modules;

import mc_Dawn.main.Dawn;
import net.minecraft.client.Minecraft;

public class Module {
	protected Minecraft mc = Minecraft.getMinecraft();
	
	private String name, displayName;
	private int key;
	private boolean toggled;
	private Category category;
	
	public Module(String name, int key, Category category) {
		this.name = name;
		this.key = key;
		this.category = category;
		toggled = false;
		
		setup();
	}
	
	public void onEnable() { Dawn.instance.eventManager.register(this);}
    public void onDisable() { Dawn.instance.eventManager.unregister(this);}
    
    public void onUpdate() {}
    public void onRender() {}
    
    public void onToggle() {}
    public void toggle() {
        toggled = !toggled;
        onToggle();
        if(toggled)
            onEnable();
        else
            onDisable();
    }
    public boolean isToggled() {
    	return toggled;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    
    public String getDisplayName() {
        return displayName == null ? name : displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    public void setup() {}
}