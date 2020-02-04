package mc_Dawn.main.modules;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SPacketChat;

public class Module {
	protected Minecraft mc = Minecraft.getMinecraft();
	
	private String name;
	private int key;
	private boolean toggled;
	private Category category;
	
	public Module(String nm, int i, Category c) {
		name = nm;
		key = i;
		category = c;
		toggled = false;
	}
	
	public void toggle() {
		toggled = !toggled;
		
		if(toggled) {
			onEnable();
		} else {
			onDisable();
		}
	}
	
	public void onEnable() {}
	public void onDisable() {}
	public void onUpdate() {}
	public void onRender() {}

	public Minecraft getMc() {
		return mc;
	}

	public void setMc(Minecraft mc) {
		this.mc = mc;
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

	public boolean isToggled() {
		return toggled;
	}

	public void setToggled(boolean toggled) {
		this.toggled = toggled;
	}

	public boolean onSendChatMessage(String s){
		  return true;
	}
	
	 public boolean onRecieveChatMessage(SPacketChat packet){
		  return true;
	}
}