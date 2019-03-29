package com.arglb.SpellsNRituals.blocks;

import com.arglb.SpellsNRituals.registryHandler;
import com.arglb.SpellsNRituals.spellsNRituals;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class incenseBurner extends Block{
    public ItemBlock iBlock;

    public incenseBurner(Material material, String blockName)
    {
        super(material);
        setUnlocalizedName("grinder");
        setCreativeTab(CreativeTabs.DECORATIONS);
        blockParticleGravity = 1.0F;
        slipperiness = 0.6F;
        lightOpacity = 20; // cast a light shadow
        setTickRandomly(false);
        useNeighborBrightness = false;
        this.setUnlocalizedName(blockName);
        this.setRegistryName(blockName);
        this.iBlock = new ItemBlock(this);
        this.iBlock.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.iBlock.setRegistryName(blockName);
        this.setTickRandomly(true);
    }


    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    @Override
    public boolean isFullCube(IBlockState state){return false;}
    @Override
    public Item getItemDropped(
            IBlockState state,
            Random rand,
            int fortune)
    {
        return Item.getItemFromBlock(registryHandler.incenseburner);
    }
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand){
        worldIn.spawnParticle(EnumParticleTypes.CLOUD, pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() +0.5, 0.0D, 0.0D, 0.0D);
    }

}
