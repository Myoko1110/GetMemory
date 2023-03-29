package getmemory.getmemory.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class message implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("jvm")) {
            Runtime runtime = Runtime.getRuntime();
            long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
            long memoryUsed_GB = memoryUsed / 1048576;
            long freeMemory = runtime.maxMemory() - memoryUsed;
            long freeMemory_GB = freeMemory / 1048576;
            sender.sendMessage("Memory used: " + memoryUsed_GB + " MB.");
            sender.sendMessage("Free memory: " + freeMemory_GB + " MB.");
            return true;
        }
        return false;
    }
}
