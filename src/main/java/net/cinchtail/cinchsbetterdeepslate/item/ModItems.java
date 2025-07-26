package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.item.custom.ModAxeItem;
import net.cinchtail.cinchsbetterdeepslate.item.custom.ModHoeItem;
import net.cinchtail.cinchsbetterdeepslate.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DEEPSLATE_SWORD = registerItem("deepslate_sword",
            new SwordItem(ModToolMaterial.DEEPSLATE,3, -2.4F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item DEEPSLATE_PICKAXE = registerItem("deepslate_pickaxe",
            new ModPickaxeItem(ModToolMaterial.DEEPSLATE,1, -2.8F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item DEEPSLATE_AXE = registerItem("deepslate_axe",
            new ModAxeItem(ModToolMaterial.DEEPSLATE,7, -3.2F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item DEEPSLATE_SHOVEL = registerItem("deepslate_shovel",
            new ShovelItem(ModToolMaterial.DEEPSLATE,1.5F, -3F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item DEEPSLATE_HOE = registerItem("deepslate_hoe",
            new ModHoeItem(ModToolMaterial.DEEPSLATE,-1, -2F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));

    public static final Item BLACKSTONE_SWORD = registerItem("blackstone_sword",
            new SwordItem(ModToolMaterial.BLACKSTONE,3, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item BLACKSTONE_PICKAXE = registerItem("blackstone_pickaxe",
            new ModPickaxeItem(ModToolMaterial.BLACKSTONE,1, -2.8F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item BLACKSTONE_AXE = registerItem("blackstone_axe",
            new ModAxeItem(ModToolMaterial.BLACKSTONE,7, -3.2F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item BLACKSTONE_SHOVEL = registerItem("blackstone_shovel",
            new ShovelItem(ModToolMaterial.BLACKSTONE,1.5F, -3F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));
    public static final Item BLACKSTONE_HOE = registerItem("blackstone_hoe",
            new ModHoeItem(ModToolMaterial.BLACKSTONE,-1, -2F,
                    new FabricItemSettings().group(ModItemGroups.CINCHSBETTERDEEPSLATE_TAB)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CinchsBetterDeepslate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CinchsBetterDeepslate.LOGGER.debug("Registering Mod Items for " + CinchsBetterDeepslate.MOD_ID);
    }
}