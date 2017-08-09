package me.koenn.slingshot.entities;

import me.koenn.slingshot.Slingshot;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * <p>
 * Copyright (C) Koenn - All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential Written by Koen Willemse, August 2017
 */
public final class EntityManager {

    private static int entityID = 0;

    public static void registerEntities() {
        registerEntity(EntityRock.class, "rock", 64, 20, false);
    }

    private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
        ResourceLocation registryName = new ResourceLocation(Slingshot.MODID, entityName);
        EntityRegistry.registerModEntity(registryName, entityClass, registryName.toString(), entityID++, Slingshot.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
    }
}
