package me.temo.uwukittytame

import org.bukkit.ChatColor
import org.bukkit.entity.Cat
import org.bukkit.entity.Ocelot
import org.bukkit.entity.Parrot
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityTameEvent
import org.bukkit.plugin.java.JavaPlugin

class UwUKittyTame : JavaPlugin(), Listener {
    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
        saveDefaultConfig()
        println("скажите мя!!!")
    }

    override fun onDisable() {
        println("бб")
    }

    @EventHandler
    fun onEntityTame(kormlenie: EntityTameEvent) {
        val player = kormlenie.owner as Player
        run {
            if (config.getString("locale") == "ru") {
                if (kormlenie.entity is Cat) {
                    player.sendMessage("теперь вы стали Уву! кошачья партия гордится тобой. UwU")
                    println(ChatColor.LIGHT_PURPLE.toString() + "СамыйНяшниМаглин >> " + ChatColor.WHITE + player.name + " приручил котика!!!!!")
                } else if (kormlenie.entity is Ocelot) {
                    player.sendMessage("ваша душа наполняется силой Уву.")
                    println(ChatColor.LIGHT_PURPLE.toString() + "СамыйНяшниМаглин >> " + ChatColor.WHITE + player.name + " покормил оцелотика!!!!")
                } else if (kormlenie.entity is Parrot) {
                    player.sendMessage("эта пчирикалка теперь только ваша.")
                    println(ChatColor.LIGHT_PURPLE.toString() + "СамыйНяшниМаглин >> " + ChatColor.WHITE + player.name + " сделал ручную пчирикалку!!!!")
                }
            } else if (config.getString("locale") == "en") {
                if (kormlenie.entity is Cat) {
                    player.sendMessage("now u are becomes a really UwU")
                    println(ChatColor.LIGHT_PURPLE.toString() + "UwUKittyTame >> " + ChatColor.WHITE + player.name + " tame a cat!!!!!")
                } else if (kormlenie.entity is Ocelot) {
                    player.sendMessage("feeling the ocelot fills you UwU.")
                    println(ChatColor.LIGHT_PURPLE.toString() + "UwUKittyTame >> " + ChatColor.WHITE + player.name + " feed an ocelot!!!!")
                } else if (kormlenie.entity is Parrot) {
                    player.sendMessage("now that birb only yours.")
                    println(ChatColor.LIGHT_PURPLE.toString() + "UwUKittyTame >> " + ChatColor.WHITE + player.name + " made +1 parrot in parrot collection!!!")
                }
            } else if (config.getString("locale") == "es") {
                if (kormlenie.entity is Cat) {
                    player.sendMessage("el gatooo.. T^T")
                    println(ChatColor.LIGHT_PURPLE.toString() + "UwUKittyTame >> " + ChatColor.WHITE + player.name + " domesticado un gato~")
                } else if (kormlenie.entity is Ocelot) {
                    player.sendMessage("puedes sentir el amor de un ocelote. <3")
                    println(ChatColor.LIGHT_PURPLE.toString() + "UwUKittyTame >> " + ChatColor.WHITE + player.name + " de sentir el amor de un ocelote <3")
                } else if (kormlenie.entity is Parrot) {
                    player.sendMessage("uuh Tu loro habla taka-taka? 0_0")
                    println(ChatColor.LIGHT_PURPLE.toString() + "UwUKittyTame >> " + ChatColor.WHITE + player.name + " domesticado un pajaro!!!")
                }
            }
        }
    }
}

//я хочу есть. я хочу пиццу. серьёзно, я очень хочу кушать.. (❀❛ ֊ ❛„)