package me.techy.iced.cmds;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class NightCmd implements Listener,CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String alias, String[] args) {
		if ((s instanceof Player)) {
			Player p = (Player) s;
			if (p.hasPermission("iced.staff.time")) {
		        for (final World w : Bukkit.getWorlds()) {
		            w.setTime(14000);
		        }
				p.sendMessage("�eIl tempo � stato impostato a notte.");
			} else {
				p.sendMessage("�cNon possiedi i permessi necessari per effettuare questo comando.");
			}
		} else {
			s.sendMessage("�cQuesto comando non � stato ideato per funzionare su Console.");
		}
		return true;
	}
}
