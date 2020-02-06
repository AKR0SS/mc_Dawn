package mc_Dawn.main.event.events;

import mc_Dawn.main.event.Event;

public class EventKey extends Event {
	private int key;
	
	public EventKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
}
