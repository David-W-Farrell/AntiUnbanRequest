package me.plugins.antiunbanrequests.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AntiUnbanRequestListener implements Listener {

    @EventHandler
    public void onPlayerChatEvent(AsyncPlayerChatEvent e) {

        if (e.getMessage().equalsIgnoreCase("Unban Vyrewatch")) { //checks to see if the user string is equal to the prohibited phrase
            Player player = e.getPlayer();

            if (!(player.hasPermission("unbanRequest.bypass"))) { //checks if the player has a permissions bypass

                System.out.println(player.getName() + " Asked for an unban"); //notes the infraction in console
                player.sendMessage("Death it is."); // sends a death message to the player
                player.setHealth(0); //kills player

            }

        }

    }

}
