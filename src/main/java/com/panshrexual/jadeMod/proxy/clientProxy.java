package com.panshrexual.jadeMod.proxy;

import com.panshrexual.jadeMod.JadeMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class clientProxy implements IProxy
{

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        // DEBUG
        System.out.println("on Client side");

    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        // DEBUG
        System.out.println("on Client side");

    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        // DEBUG
        System.out.println("on Client side");
    }

    @Override
    public EntityPlayer getPlayerEntityFromContext(MessageContext ctx)
    {
        return (ctx.side.isClient() ? Minecraft.getMinecraft().player : JadeMod.proxy.getPlayerEntityFromContext(ctx));
    }

    @Override
    public void serverStarting(FMLServerStartingEvent event)
    {
        // This will never get called on client side
    }
}