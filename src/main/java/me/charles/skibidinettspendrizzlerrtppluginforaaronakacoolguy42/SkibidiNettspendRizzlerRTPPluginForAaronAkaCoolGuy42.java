package me.charles.skibidinettspendrizzlerrtppluginforaaronakacoolguy42;

import me.charles.skibidinettspendrizzlerrtppluginforaaronakacoolguy42.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkibidiNettspendRizzlerRTPPluginForAaronAkaCoolGuy42 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
//        log that the plugin has been enabled
        getLogger().info("SkibidiNettspendRizzlerRTPPluginForAaronAkaCoolGuy42 has been enabled");
        getLogger().info("This plugin was made by Charles");
//        register the join listener
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("SkibidiNettspendRizzlerRTPPluginForAaronAkaCoolGuy42 has been disabled");
    }
}
