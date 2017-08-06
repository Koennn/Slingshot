package me.koenn.slingshot.items;

import me.koenn.slingshot.Slingshot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * <p>
 * Copyright (C) Koenn - All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential Written by Koen Willemse, August 2017
 */
public class ItemBase extends Item implements ItemModelProvider {

    protected final String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public void registerItemModel(Item item) {
        Slingshot.proxy.registerItemRenderer(item, 0, this.name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
