package me.jimbo.plugin.util;

import me.jimbo.plugin.CTF;

public class DatabaseLogging {
	
	@SuppressWarnings("unused")
	private CTF plugin;
	
	public DatabaseLogging (CTF plugin) {
		this.plugin = plugin;
	}
	
	// ### addKills ### //
	// onPlayerDeathEvent
	// Player player = event.getKiller();
	// CTF.addKills.put(player, CTF.addKills.get(Player)+1);
	
	// ### addDeaths ### //
	// onPlayerDeathEvent
	// Player player = event.getEntity();
	// CTF.addDeaths.put(player, CTF.addKills.get(Player)+1);
	
	// ### addWin ### //
	// onRoundEnd 
	// if(BlueTeam == winner)
	// {
	//	CTF.addWin.put(BlueTeam.getPlayer(), 1); // Would be much different.  Need to loop through the ArrayList of the team.
	// }
	
	// ### addLoss ### //
	// onRoundEnd 
	// if(BlueTeam != winner)
	// {
	//	CTF.addLoss.put(BlueTeam.getPlayer(), 1); // Would be much different.  Need to loop through the ArrayList of the team.
	// }
	
	// ### timePlayed ### //
	// onPlayerQuitEvent 
	// Player player = event.getPlayer();
	// int time = MainTimer.getTime();
	// CTF.timePlayed.put(player, time); // Would be simply adding the totaly # of seconds played.  This is fine for the database, just remember to parse when retrieving.
	
}
