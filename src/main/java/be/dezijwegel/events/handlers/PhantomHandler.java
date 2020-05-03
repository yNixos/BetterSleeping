package be.dezijwegel.events.handlers;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class PhantomHandler implements Listener {

    @EventHandler
    public void onPhantomSpawn(EntitySpawnEvent spawnEvent)
    {
        if (spawnEvent.getEntityType() == EntityType.PHANTOM)
            spawnEvent.setCancelled(true);
    }

}
