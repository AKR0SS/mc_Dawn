package mc_Dawn.main.event.events;

import mc_Dawn.main.event.Event;
import net.minecraft.client.entity.EntityPlayerSP;

public final class PlayerMoveEvent extends Event {
	private final EntityPlayerSP player;
	
	public PlayerMoveEvent(EntityPlayerSP player)
	{
		this.player = player;
	}
	
	public EntityPlayerSP getPlayer()
	{
		return player;
	}
}
