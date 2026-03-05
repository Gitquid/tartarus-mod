package com.liquid.tartarus;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Creates registry for items under your mod ID
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tartarus.MODID);

    // Registering Charon's Obol
    public static final DeferredItem<Item> CHARONS_OBOL = ITEMS.register("charons_obol",
            () -> new Item(new Item.Properties()));

    // Registering Stygian Seeker (Locator Item)
    public static final DeferredItem<Item> STYGIAN_SEEKER = ITEMS.register("stygian_seeker",
            () -> new Item(new Item.Properties().stacksTo(1)));

    // Registering Stygian Bronze as a holdable item for Creative Mode
    public static final DeferredItem<Item> STYGIAN_BRONZE_ITEM = ITEMS.register("stygian_bronze",
            () -> new BlockItem(ModBlocks.STYGIAN_BRONZE.get(), new Item.Properties()));

    // This method tells main mod class to load se items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
