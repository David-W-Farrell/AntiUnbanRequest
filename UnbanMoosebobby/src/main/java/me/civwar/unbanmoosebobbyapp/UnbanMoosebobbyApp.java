package me.civwar.unbanmoosebobbyapp;

import me.civwar.unbanmoosebobbyapp.Listener.MooseListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class UnbanMoosebobbyApp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(new MooseListener(), this); // registers listener so that its active, allows the plugin to monitor for events

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
