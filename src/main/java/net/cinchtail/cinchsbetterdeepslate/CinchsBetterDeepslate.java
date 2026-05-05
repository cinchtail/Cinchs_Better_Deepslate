package net.cinchtail.cinchsbetterdeepslate;

import com.mojang.logging.LogUtils;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(CinchsBetterDeepslate.MOD_ID)
public class CinchsBetterDeepslate {
    public static final String MOD_ID = "cinchsbetterdeepslate";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CinchsBetterDeepslate() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);

    }
    public static int index = 0;
    public static final CreativeModeTab CINCHSBETTERDEEPSLATE_TAB = new CreativeModeTab("cinchsbetterdeepslate_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SCULK_INLAID_DEEPSLATE.get());
        }

        @Override
        public void fillItemList(@NotNull NonNullList<ItemStack> items) {
            super.fillItemList(items);
            index = 0;
            items.set(index, new ItemStack(ModBlocks.SCULK_INLAID_DEEPSLATE.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.DEEPSLATE_BRICK_PILLAR.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILES.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.DEEPSLATE_STAIRS.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.DEEPSLATE_SLAB.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.DEEPSLATE_WALL.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get()));
            index++;
            items.set(index, new ItemStack(ModBlocks.POLISHED_DEEPSLATE_BUTTON.get()));
            index++;
        }
    };
}