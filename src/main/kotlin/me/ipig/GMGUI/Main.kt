package me.ipig.GMGUI


import me.ipig.GMGUI.commands.gmgui
import me.ipig.GMGUI.listeners.MenuClickListener
import org.bukkit.plugin.java.JavaPlugin


class GMGUI : JavaPlugin() {

    override fun onEnable() {
        getCommand("gmgui").setExecutor(gmgui())
        server.pluginManager.registerEvents(MenuClickListener(), this)
    }

}
