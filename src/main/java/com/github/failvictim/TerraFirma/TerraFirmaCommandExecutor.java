package com.github.failvictim.TerraFirma;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TerraFirmaCommandExecutor implements CommandExecutor {
	private final TerraFirma plugin;
	
	public TerraFirmaCommandExecutor(TerraFirma plugin) { //Not sure when the plugin variable is used but I think it is needed for bukkit
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("TerraFirma")) {
			
			if (args.length != 0) {
				
				switch (args[0].toLowerCase()) { //Add each command to this statement as a case
				default:
					return false; //The called command does not exist/has been missplet
				}
				
			} else {
				sender.sendMessage("No command entered"); //No command being called | Possibly put a help chain here instead
			}
		}
		return false; //TerraFirma not the plugin being used or missplet
	}
	
}
