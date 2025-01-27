package me.charles.skibidinettspendrizzlerrtppluginforaaronakacoolguy42.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        // check if it's the player's first join
        if (!e.getPlayer().hasPlayedBefore()) {

                // get the "world" and ensure it's not null
                World world = Bukkit.getWorld("world");
                if (world == null) {
                    Bukkit.getLogger().severe("world 'world' does not exist... ??? what the sigma");
                    return;
                }

                // generate random coordinates within the range [-3000, 3000]
                int x = (int) (Math.random() * 6001) - 3000;
                int z = (int) (Math.random() * 6001) - 3000;

                // find a safe location to teleport
                Location safeLocation = world.getHighestBlockAt(x, z).getLocation().add(0.5, 1, 0.5);

//                if its in water, find a new location
                while (safeLocation.getBlock().isLiquid()) {
                    x = (int) (Math.random() * 6001) - 3000;
                    z = (int) (Math.random() * 6001) - 3000;
                    safeLocation = world.getHighestBlockAt(x, z).getLocation().add(0.5, 1, 0.5);
                }
                e.getPlayer().teleport(safeLocation);

                // set their spawn point to where they were teleported
                e.getPlayer().setBedSpawnLocation(safeLocation, true);
        }
    }
}
