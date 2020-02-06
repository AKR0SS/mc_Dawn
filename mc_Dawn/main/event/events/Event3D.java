package mc_Dawn.main.event.events;

import mc_Dawn.main.event.Event;

public class Event3D extends Event {
	private float partialTicks;
	
	public Event3D(float partialTicks) {
		this.partialTicks = partialTicks;
	}
	
	public float getPartialTicks() {
		return partialTicks;
	}
}
