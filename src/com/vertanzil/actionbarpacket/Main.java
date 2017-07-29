package com.vertanzil.actionbarpacket;
import com.vertanzil.actionbarpacket.commands.commands_test;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private commands_test commands_test;

    public void onEnable() {
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info("Action bar packet");
        PluginManager pm = this.getServer().getPluginManager();
        this.RegisterCommands();
    }
    @Override
    public void onDisable() {
        getLogger().info("Action bar packet");
    }
    public void RegisterCommands(){
        commands_test = new commands_test(this);
        getCommand("test").setExecutor((CommandExecutor) this.commands_test);
    }
}
