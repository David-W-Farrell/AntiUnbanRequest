package me.plugins.antiunbanrequests;

import me.plugins.antiunbanrequests.Listener.AntiUnbanRequestListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiUnbanRequestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(new AntiUnbanRequestListener(), this); // registers listener so that its active, allows the plugin to monitor for events

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
