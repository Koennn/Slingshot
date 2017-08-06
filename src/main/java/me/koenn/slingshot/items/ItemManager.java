package me.koenn.slingshot.items;

import me.koenn.slingshot.Slingshot;
import me.koenn.slingshot.util.Logger;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Copyright (C) Koenn - All Rights Reserved
 */
@GameRegistry.ObjectHolder(Slingshot.MODID)
public class ItemManager {

    public static ItemBase SLINGSHOT = new ItemBase("slingshot");

    @Mod.EventBusSubscriber(modid = Slingshot.MODID)
    public static class RegistrationHandler {

        public static final Set<Item> ITEMS = new HashSet<>();

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            Logger.info("Initializing items...");

            final Item[] items = {SLINGSHOT};

            final IForgeRegistry<Item> registry = event.getRegistry();

            for (final Item item : items) {
                registry.register(item);
                ITEMS.add(item);
            }
        }
    }
}
