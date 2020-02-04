package mc_Dawn.main;

import org.lwjgl.opengl.Display;

import mc_Dawn.main.event.EventManager;

public class Dawn {
	public String Title = "1.12.2 Dawn Client",
				  Version = "0.1",
				  Author = "AKROSS";
	
	public EventManager eventManager;
	
	public void startClient() {
		eventManager = new EventManager();
	}
}
