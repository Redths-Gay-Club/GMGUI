package me.ipig.GMGUI.listeners

import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class MenuClickListener: Listener {
    @EventHandler
    fun onMenuClick(event: InventoryClickEvent) {
        val p = event.inventory.holder as Player
        event.isCancelled = true
        p.gameMode = when (event.currentItem?.itemMeta?.displayName) {
            "§2Survival Mode" -> GameMode.SURVIVAL
            "§2Creative Mode" -> GameMode.CREATIVE
            "§2Adventure Mode" -> GameMode.ADVENTURE
            "§2Spectator Mode" -> GameMode.SPECTATOR
            else -> {
                event.isCancelled = false
                return
            }
        }
        /*
        Credit to Redth
        */
    }
}