package net.cinchtail.cinchsbetterdeepslate;

import com.mojang.logging.LogUtils;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.cinchtail.cinchsbetterdeepslate.item.ModCreativeModeTabs;
import net.cinchtail.cinchsbetterdeepslate.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CinchsBetterDeepslate.MOD_ID)
public class CinchsBetterDeepslate {
    public static final String MOD_ID = "cinchsbetterdeepslate";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CinchsBetterDeepslate() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}