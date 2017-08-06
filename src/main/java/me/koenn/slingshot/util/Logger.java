package me.koenn.slingshot.util;

import me.koenn.slingshot.Slingshot;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * <p>
 * Copyright (C) Koenn - All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential Written by Koen Willemse, November 2016
 */
public class Logger {

    public static void log(Level level, Object message) {
        FMLLog.log.info(Slingshot.MODID + ": " + message);
    }

    public static void info(Object message) {
        log(Level.INFO, message);
    }

    public static void severe(Object message) {
        log(Level.ERROR, message);
    }

    public static void debug(Object message) {
        log(Level.DEBUG, message);
    }
}
