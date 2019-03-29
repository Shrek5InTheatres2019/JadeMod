package com.panshrexual.jadeMod;

import com.panshrexual.jadeMod.proxy.IProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = JadeMod.MODID, version = JadeMod.VERSION, name="Jade Mod")
public class JadeMod {
    public static final String VERSION = "0.1";
    public static final String MODID = "jademod";
    public static Logger logger = LogManager.getLogger(MODID);
    public static JadeMod instance;
    @SidedProxy(clientSide="com.panshrexual.jadeMod.proxy.clientProxy", serverSide="com.panshrexual.jadeMod.proxy.serverProxy")
    public static IProxy proxy;
    public JadeMod(){
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
