package me.koenn.slingshot.proxy;

import me.koenn.slingshot.Slingshot;
import me.koenn.slingshot.util.Logger;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * <p>
 * Copyright (C) Koenn - All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential Written by Koen Willemse, August 2017
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        Logger.info("Registering item models...");
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Slingshot.MODID + ":" + id, "inventory"));
    }
}
