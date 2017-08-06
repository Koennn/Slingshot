package me.koenn.slingshot.items;

import me.koenn.slingshot.Slingshot;
import me.koenn.slingshot.util.Logger;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
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
    public static class ModelHandler {
        @SubscribeEvent
        public static void registerAllModels(ModelRegistryEvent event) {
            final Item[] items = {SLINGSHOT};

            for (Item item : items) {
                if (item instanceof ItemModelProvider) {
                    ((ItemModelProvider) item).registerItemModel(item);
                }
            }
        }
    }

    @Mod.EventBusSubscriber(modid = Slingshot.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            Logger.info("Initializing items...");

            final Item[] items = {SLINGSHOT};

            IForgeRegistry<Item> registry = event.getRegistry();

            for (final Item item : items) {
                registry.register(item);
            }
        }
    }
}
