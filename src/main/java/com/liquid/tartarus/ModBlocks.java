package com.liquid.tartarus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    // Creates the registry for blocks under your mod ID
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Tartarus.MODID);

    // Registering the Stygian Bronze Block
    public static final DeferredBlock<Block> STYGIAN_BRONZE = BLOCKS.register("stygian_bronze",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(-1.0F, 3600000.0F)
                    .noLootTable()));

    // Registering the Abyssal Pit portal block
    public static final DeferredBlock<Block> ABYSSAL_PIT = BLOCKS.register("abyssal_pit",
            () -> new Block(BlockBehaviour.Properties.of()
                    .noCollission() // Players fall right through it
                    .strength(-1.0F, 3600000.0F) // Makes it indestructible like Bedrock
                    .noLootTable()));

    // This method tells the main mod class to load these blocks
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
