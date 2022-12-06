package it.gioxox;

import org.bukkit.plugin.java.JavaPlugin;
public class GioxoxPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Plugin abilitato");
    }
    @Override
    public void onDisable() {
        System.out.println("Plugin disabilitato");
    }

}