package org.mplugins.mmenu;

import org.bukkit.plugin.java.JavaPlugin;
import org.mplugins.mmenu.listeners.InventoryListener;

public final class MMenu
{
    public static void register(JavaPlugin plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(new InventoryListener(), plugin);
    }
}
