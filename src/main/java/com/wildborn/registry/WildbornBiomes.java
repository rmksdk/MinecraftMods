package com.wildborn.registry;

import com.wildborn.WildbornMod;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class WildbornBiomes {
    public static final RegistryKey<Biome> ASHEN_WASTES = RegistryKey.of(RegistryKeys.BIOME, new Identifier(WildbornMod.MOD_ID, "ashen_wastes"));

    public static void registerBiomes() {
        WildbornMod.LOGGER.info("Registering biomes for " + WildbornMod.MOD_ID);
    }
}