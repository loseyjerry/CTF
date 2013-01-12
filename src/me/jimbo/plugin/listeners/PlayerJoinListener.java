package me.jimbo.plugin.listeners;

import me.jimbo.plugin.CTF;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

	private CTF plugin;
	
	public PlayerJoinListener (CTF plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e) {
		int redsize = CTF.RedPlayers.size();
		int bluesize = CTF.AllPlayers.size();
		if (!CTF.AllPlayers.contains(e.getPlayer()) && !CTF.RedPlayers.contains(e.getPlayer())){
			if(redsize > bluesize){
				CTF.AllPlayers.add(e.getPlayer());
			}else if(bluesize > redsize){
				CTF.RedPlayers.add(e.getPlayer());
			} else {
				CTF.AllPlayers.add(e.getPlayer());
			}
			CTF.PlayerClasses.put(e.getPlayer(), "soldier");
		}
		Player player = e.getPlayer();
		Location location = player.getLocation();
		double x = plugin.getConfig().getDouble("Staging Area.X");
		double y = plugin.getConfig().getDouble("Staging Area.Y");
		double z = plugin.getConfig().getDouble("Staging Area.Z");
		
		location.setX(x);
		location.setY(y);
		location.setZ(z);
		player.teleport(location);
		player.getInventory().clear();
		plugin.resetInv(player);
	}

}
