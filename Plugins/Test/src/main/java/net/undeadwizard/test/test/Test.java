package net.undeadwizard.test.test;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
       getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"Hello World!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"Bye World!");
    }
}
