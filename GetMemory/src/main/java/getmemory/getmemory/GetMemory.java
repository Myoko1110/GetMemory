package getmemory.getmemory;

import getmemory.getmemory.Commands.message;
import org.bukkit.plugin.java.JavaPlugin;

public final class GetMemory extends JavaPlugin {

    private static  JavaPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.onEnable();

        getCommand("jvm").setExecutor(new message());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
    public static JavaPlugin getPlugin(){
        return plugin;
    }
}
