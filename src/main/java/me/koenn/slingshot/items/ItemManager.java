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

/**
 * <p>
 * Copyright (C) Koenn - All Rights Reserved
 */
@GameRegistry.ObjectHolder(Slingshot.MODID)
public final class ItemManager {

    public static ItemSlingshot SLINGSHOT = new ItemSlingshot("slingshot");
    public static ItemRock ROCK = new ItemRock("rock");


    @Mod.EventBusSubscriber(modid = Slingshot.MODID)
    public static class ModelHandler {
        @SubscribeEvent
        public static void registerAllModels(ModelRegistryEvent event) {
            final Item[] items = {SLINGSHOT, ROCK};

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

            final Item[] items = {SLINGSHOT, ROCK};

            IForgeRegistry<Item> registry = event.getRegistry();

            for (final Item item : items) {
                registry.register(item);
            }
        }
    }
}
