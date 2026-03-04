package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemGroups {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            CinchsBetterDeepslate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CINCHSBETTERDEEPSLATE_TAB = CREATIVE_MODE_TABS.register("cinchsbetterdeepslate_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SCULK_INLAID_DEEPSLATE.get()))
                    .title(Component.translatable("itemgroup.cinchsbetterdeepslate"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.SCULK_INLAID_DEEPSLATE.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILES.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get());
                        output.accept(ModBlocks.DEEPSLATE_STAIRS.get());
                        output.accept(ModBlocks.DEEPSLATE_SLAB.get());
                        output.accept(ModBlocks.DEEPSLATE_WALL.get());
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_BUTTON.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}