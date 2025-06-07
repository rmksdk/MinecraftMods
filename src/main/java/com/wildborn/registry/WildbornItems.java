package com.wildborn.registry;

import com.wildborn.WildbornMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WildbornItems {
    public static final Item BLIGHT_RESIN = registerItem("blight_resin", new Item(new FabricItemSettings()));

    public static void registerModItems() {
        WildbornMod.LOGGER.info("Registering items for " + WildbornMod.MOD_ID);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WildbornMod.MOD_ID, name), item);
    }
}