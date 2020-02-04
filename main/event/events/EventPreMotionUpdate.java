package mc_Dawn.main.event.events;

import mc_Dawn.main.event.Event;

public class EventPreMotionUpdate extends Event {
	private float yaw, pitch;
	private boolean ground;
	
	public EventPreMotionUpdate(float yaw, float pitch, boolean ground) {
		this.yaw = yaw;
		this.pitch = pitch;
		this.ground = ground;
	}
	
	public float getYaw() {
		return yaw;
	}
	public void setYaw(float yaw) {
		this.yaw = yaw;
	}
	
	public float getPitch() {
		return pitch;
	}
	public void setPitch(float pitch) {
		this.pitch = pitch;
	}
	
	public boolean getGround() {
		return ground;
	}
	public void setGround(boolean ground) {
		this.ground = ground;
	}
}
