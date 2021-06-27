package org.mplugins.mmenu.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.mplugins.mmenu.menu.Menu;

public class InventoryListener implements Listener
{
    @EventHandler
    public void onClick(InventoryClickEvent event)
    {
        Inventory inventory = event.getClickedInventory();

        if (inventory == null)
            return;

        InventoryHolder inventoryHolder = inventory.getHolder();

        if (!(inventoryHolder instanceof Menu))
            return;

        Menu menu = (Menu) inventoryHolder;
        event.setCancelled(true);
        menu.handleClickAction(event);
    }
}
