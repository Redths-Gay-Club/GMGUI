package me.ipig.GMGUI.utils

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

class GUIUtils {
    companion object {
        fun openGUI(p: Player) {
            val gui: Inventory = Bukkit.createInventory(p,9, "GameMode GUI" )
            val creative = ItemStack(Material.IRON_SWORD)
            val survival = ItemStack(Material.GRASS)
            val spectator = ItemStack(Material.EYE_OF_ENDER)
            val adventure = ItemStack(Material.PAPER)
            setMeta(survival, "§2Survival", gui)
            setMeta(creative, "§2Creative", gui)
            setMeta(adventure, "§2Adventure" , gui)
            setMeta(spectator, "§2Spectator", gui)
            p.openInventory(gui)
        }
        fun setMeta(item: ItemStack, mode: String, gui: Inventory) {
            val meta = item.itemMeta
            meta.displayName = "${mode} Mode"
            item.itemMeta = meta
            gui.addItem(item)
        }
    }
}