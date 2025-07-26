package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CINCHSBETTERDEEPSLATE_TAB = FabricItemGroupBuilder.build(
            new Identifier(CinchsBetterDeepslate.MOD_ID, "cinchsbetterdeepslate_tab"), () -> new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE));
}