package net.cinchtail.cinchsbetterdeepslate.block;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.util.ModBlockSetType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.DEEPSLATE;
import static net.minecraft.world.level.block.Blocks.POLISHED_BLACKSTONE_BUTTON;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CinchsBetterDeepslate.MOD_ID);

    public static final DeferredBlock<Block> SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            () -> new SculkInlaidDeepslateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_DEEPSLATE).strength(2.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "sculk_inlaid_deepslate")))));

    public static final DeferredBlock<Block> DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(2.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_brick_pillar")))));

    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate")))));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate_stairs")))));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate_slab")))));
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate_wall")))));

    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_bricks")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_brick_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_brick_slab")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_brick_wall")))));

    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_TILES).requiresCorrectToolForDrops()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tiles")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tile_stairs")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tile_slab")))));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tile_wall")))));

    public static final DeferredBlock<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(DEEPSLATE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(3.0F, 6.0F)
                            .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_stairs")))));
    public static final DeferredBlock<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_slab")))));
    public static final DeferredBlock<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE)
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "deepslate_wall")))));

    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            () -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sound(SoundType.POLISHED_DEEPSLATE)
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "polished_deepslate_pressure_plate")))));
    public static final DeferredBlock<ButtonBlock> POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            () -> new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20,
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_BLACKSTONE_BUTTON).strength(0.5F).noCollission()
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, "polished_deepslate_button")))));


    public static class ModItems {
        public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(CinchsBetterDeepslate.MOD_ID);
    }
    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> blockReg = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(blockReg.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, name)))));
        return blockReg;
    }
}