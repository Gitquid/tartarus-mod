package com.liquid.tartarus;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tartarus.MODID);

    public static final Supplier<CreativeModeTab> TARTARUS_TAB = CREATIVE_MODE_TABS.register("tartarus_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.tartarus_tab")) // Uses the name from our en_us.json
                    .icon(() -> new ItemStack(ModItems.CHARONS_OBOL.get())) // Sets the tab icon
                    .displayItems((parameters, output) -> {
                        // This determines the exact order items appear in the tab
                        output.accept(ModItems.CHARONS_OBOL.get());
                        output.accept(ModItems.STYGIAN_SEEKER.get());
                        output.accept(ModBlocks.STYGIAN_BRONZE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
