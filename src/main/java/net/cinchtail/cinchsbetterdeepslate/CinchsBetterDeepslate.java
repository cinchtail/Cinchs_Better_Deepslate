package net.cinchtail.cinchsbetterdeepslate;

import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.cinchtail.cinchsbetterdeepslate.item.ModCreativeModeTabs;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.LoggerFactory;

@Mod(CinchsBetterDeepslate.MOD_ID)
public class CinchsBetterDeepslate {
    public static final String MOD_ID = "cinchsbetterdeepslate";
    public static final Logger LOGGER = LoggerFactory.getLogger(CinchsBetterDeepslate.class);

    public CinchsBetterDeepslate(@NotNull IEventBus bus) {
        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ModItems.ITEMS.register(bus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(bus);
    }
}