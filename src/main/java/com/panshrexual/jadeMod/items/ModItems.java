package com.panshrexual.jadeMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModItems {
    public static final emeraldJade EMERALD_JADE = new emeraldJade();
    public static final CreativeTabs jadeTab = (new CreativeTabs("tabJade") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(EMERALD_JADE);
        }
    });
}
