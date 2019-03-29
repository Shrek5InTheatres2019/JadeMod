package com.arglb.SpellsNRituals;

import com.arglb.SpellsNRituals.blocks.incenseBurner;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = spellsNRituals.MODID)
public class registryHandler {
    public static incenseBurner incenseburner = new incenseBurner(Material.ROCK, "incenseburner");
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event){
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(incenseburner);
        spellsNRituals.logger.info("Registered Blocks");
    }
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event){
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(incenseburner.iBlock);
        spellsNRituals.logger.info("Registered Items");
    }

    @SubscribeEvent
    public void registerRenders(ModelRegistryEvent event) {
        registerRender(incenseburner.iBlock);
    }

    private void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
