package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashSet;
import java.util.Set;

public class ModItemGroups {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CinchsBetterDeepslate.MOD_ID);

    public static String CINCHSBETTERDEEPSLATE_TAB_TITLE = "itemgroup.cinchsbetterdeepslate";

    public static final DeferredHolder<CreativeModeTab,
            CreativeModeTab> CINCHSBETTERDEEPSLATE_TAB = CREATIVE_MODE_TABS.register("cinchsbetterdeepslate_tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.displayItems((itemDisplay, output) -> {
            Set<Item> addedItems = new HashSet<>();

            ModBlocks.BLOCKS.getEntries()
                    .stream()
                    .map((block) -> block.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);
        });
        builder.icon(() -> new ItemStack(ModBlocks.SCULK_INLAID_DEEPSLATE.get()));
        builder.title(Component.translatable(CINCHSBETTERDEEPSLATE_TAB_TITLE));
        return builder.build();
    });
}