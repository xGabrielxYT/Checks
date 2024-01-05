package me.HikeTeam;

import org.bukkit.plugin.java.JavaPlugin;

public final class PetaSprawdzanie extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Eventy(), this);
        getCommand("sprawdz").setExecutor(new SprawdzCommand());
        getCommand("przyznajesie").setExecutor(new PrzyznanieCommand());
        getCommand("sprawdzanie").setExecutor(new SprawdzanieCommand());
        getCommand("sprawdzanie").setTabCompleter(new tabCompleterA());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    //                              World world = participant.getWorld();
    //                            Location spawnLocation = new Location(world, 126, 58, -241); SPAWN
    //
}
