package me.ipig.GMGUI.commands

import me.ipig.GMGUI.utils.GUIUtils.Companion.openGUI
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

class gmgui:CommandExecutor {
    override fun onCommand(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>?): Boolean {
        if (sender is Player) {
            if (sender.isOp) {
                openGUI(sender)
            }
        }


        return true

    }
}