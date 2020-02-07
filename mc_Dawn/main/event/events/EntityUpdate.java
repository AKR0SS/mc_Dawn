package mc_Dawn.main.event.events;

import mc_Dawn.main.event.Event;
import net.minecraft.client.entity.EntityPlayerSP;

public class EntityUpdate extends Event {
private final EntityPlayerSP player;
	
	public EntityUpdate(EntityPlayerSP player) {
		this.player = player;
	}
	
	public EntityPlayerSP getPlayer() {
		return player;
	}
}
