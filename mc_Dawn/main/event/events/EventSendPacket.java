package mc_Dawn.main.event.events;

import mc_Dawn.main.event.Event;
import net.minecraft.network.Packet;

public class EventSendPacket extends Event {
	public boolean cancel = false;
	public Packet packet;
	public EventSendPacket(Packet p) {
		packet = p;
	}
}