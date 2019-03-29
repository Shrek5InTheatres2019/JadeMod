package com.panshrexual.jadeMod;

import com.panshrexual.jadeMod.items.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class registryHandler {
    private static final ModItems modItems = new ModItems();
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().register(ModItems.EMERALD_JADE);
    }
}
