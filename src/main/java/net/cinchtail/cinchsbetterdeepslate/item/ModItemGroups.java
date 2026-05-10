package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModItemGroups {
    public static final CreativeModeTab CINCHSBETTERDEEPSLATE_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "cinchsbetterdeepslate_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SCULK_INLAID_DEEPSLATE))
                    .title(Component.translatable("itemgroup.cinchsbetterdeepslate"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.SCULK_INLAID_DEEPSLATE);
                        output.accept(ModBlocks.DEEPSLATE_BRICK_PILLAR);
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILES);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL);
                        output.accept(ModBlocks.DEEPSLATE_STAIRS);
                        output.accept(ModBlocks.DEEPSLATE_SLAB);
                        output.accept(ModBlocks.DEEPSLATE_WALL);
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
                    }).build());

    public static void registerItemGroups() {
        CinchsBetterDeepslate.LOGGER.info("Registering Creative Mode Tabs for " + CinchsBetterDeepslate.MOD_ID);
    }
}