package com.panshrexual.jadeMod.items;

import com.panshrexual.jadeMod.JadeMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class emeraldJade extends Item {
    public emeraldJade(){
        //this.setCreativeTab(ModItems.jadeTab);
        this.setUnlocalizedName("emerald_jade");
        this.setRegistryName("emerald_jade");
        //ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(JadeMod.MODID + ":model/item/emerald_jade"));
    }
}
