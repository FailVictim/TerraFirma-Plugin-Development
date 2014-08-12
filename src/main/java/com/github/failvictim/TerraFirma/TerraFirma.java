package com.github.failvictim.TerraFirma;

import org.bukkit.plugin.java.JavaPlugin;

public class TerraFirma extends JavaPlugin{
	
	@Override
	public void onEnable() {
		this.getCommand("TerraFirma").setExecutor(new TerraFirmaCommandExecutor(this));
			//TODO All this Jazz
		}
	
	public void onDisable() {
		//TODO All this Jazz
	}
		
}
