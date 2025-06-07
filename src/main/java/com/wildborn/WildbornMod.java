package com.wildborn;

import com.wildborn.registry.WildbornBiomes;
import com.wildborn.registry.WildbornEntities;
import com.wildborn.registry.WildbornItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildbornMod implements ModInitializer {
    public static final String MOD_ID = "wildborn";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("🌿 Wildborn Expansion initialized.");
        WildbornItems.registerModItems();
        WildbornBiomes.registerBiomes();
        WildbornEntities.registerEntities();
    }
}