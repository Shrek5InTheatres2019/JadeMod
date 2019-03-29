package com.arglb.SpellsNRituals;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;



@Mod(modid = spellsNRituals.MODID, version = spellsNRituals.VERSION)
public class spellsNRituals {
    public static final String VERSION = "0.1";
    public static final String MODID = "spellsnrituals";
    public static Logger logger = LogManager.getLogger(MODID);
    public static spellsNRituals instance;
    @SidedProxy(clientSide="com.arglb.SpellsNRituals.client.clientProxy", serverSide="com.arglb.SpellsNRituals.server.serverProxy")
    public static IProxy proxy;
    public spellsNRituals(){
        MinecraftForge.EVENT_BUS.register(new registryHandler());
        instance = this;
    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
        logger.info("test");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}
