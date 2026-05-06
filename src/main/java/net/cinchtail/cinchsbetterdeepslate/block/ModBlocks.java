package net.cinchtail.cinchsbetterdeepslate.block;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.util.ModBlockSetType;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            new SculkInlaidDeepslateBlock(Block.Settings.copy(Blocks.CHISELED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).requiresTool()));

    public static final Block DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            new PillarBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(2.5F, 3.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS).requiresTool()));

    public static final Block MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            new Block(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            new StairsBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.getDefaultState(),Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F).requiresTool()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            new SlabBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            new WallBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            new Block(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).requiresTool().strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).requiresTool()
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).requiresTool()
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            new Block(Block.Settings.copy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_TILES).requiresTool().strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES).requiresTool()
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES).requiresTool()
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),
                    Block.Settings.copy(Blocks.STONE).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE).requiresTool()
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE).requiresTool()
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20, AbstractBlock.Settings.create().noCollision()
                    .strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    Block.Settings.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).requiresTool().sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CinchsBetterDeepslate.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        CinchsBetterDeepslate.LOGGER.info("Registering ModBlocks for " + CinchsBetterDeepslate.MOD_ID);
    }
}