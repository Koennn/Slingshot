package me.koenn.slingshot;

import me.koenn.slingshot.items.ItemManager;
import me.koenn.slingshot.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * <p>
 * Copyright (C) Koenn - All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential Written by Koen Willemse, August 2017
 */
@Mod(modid = Slingshot.MODID, name = Slingshot.MODNAME, version = Slingshot.VERSION)
public class Slingshot {

    public static final String MODID = "slingshot";
    public static final String MODNAME = "Slingshot";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(value = MODID)
    public static Slingshot instance;

    @SidedProxy(serverSide = "me.koenn.slingshot.proxy.CommonProxy", clientSide = "me.koenn.slingshot.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
