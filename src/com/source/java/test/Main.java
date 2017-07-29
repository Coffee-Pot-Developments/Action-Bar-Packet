package com.source.java.test;
import com.source.java.test.commands.Commands_test;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private com.source.java.test.commands.Commands_test Commands_test;

    public void onEnable() {
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info("Blank Plugin Enabled");
        PluginManager pm = this.getServer().getPluginManager();
        this.RegisterCommands();
    }
    @Override
    public void onDisable() {
        getLogger().info("Blank Plugin Disabled");
    }
    public void RegisterCommands(){
        Commands_test = new Commands_test(this);
        //Then we need to register the command and the executre to the class where our code is going to be executed from.
        getCommand("test").setExecutor((CommandExecutor) this.Commands_test);
    }



}
