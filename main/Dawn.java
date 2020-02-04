package mc_Dawn.main;

import org.lwjgl.opengl.Display;

public class Dawn {
	public String Title = "1.12.2 Dawn Client",
				  Version = "0.1",
				  Author = "AKROSS";
	
	public static Dawn instance = new Dawn();
	
	public void startClient() {
		System.out.println("\n" + "[" + Title + "] Starting . . . . . . ." + 
				   		   "\n" + "v" + Version + 
				   		   "\n" + "Created by " + Author);

		Display.setTitle(Title + " v" + Version);
	}
}
