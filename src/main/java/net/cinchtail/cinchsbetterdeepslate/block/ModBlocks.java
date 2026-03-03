package net.cinchtail.cinchsbetterdeepslate.block;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.util.ModBlockSetType;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            new SculkInlaidDeepslateBlock(Block.Settings.copy(Blocks.CHISELED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "sculk_inlaid_deepslate")))));

    public static final Block MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            new Block(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate")))));
    public static final Block MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            new StairsBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.getDefaultState(),Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .sounds(BlockSoundGroup.DEEPSLATE).strength(3.5f, 6.0F)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate_stairs")))));
    public static final Block MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            new SlabBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate_slab")))));
    public static final Block MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            new WallBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_cobbled_deepslate_wall")))));

    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            new Block(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_bricks")))));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_BRICKS).strength(3.5f, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_brick_stairs")))));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_brick_slab")))));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_brick_wall")))));

    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            new Block(Block.Settings.copy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tiles")))));
    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            new StairsBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.getDefaultState(),
                    Block.Settings.copy(Blocks.DEEPSLATE_TILES).strength(3.5f, 6.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE_TILES).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tile_stairs")))));
    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tile_slab")))));
    public static final Block MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE_TILES)
                    .strength(3.5f, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "mossy_deepslate_tile_wall")))));

    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),
                    Block.Settings.copy(Blocks.STONE).strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_stairs")))));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_slab")))));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(Block.Settings.copy(Blocks.DEEPSLATE)
                    .strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "deepslate_wall")))));

    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button", CreatePolishedDeepslateButton());
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    Block.Settings.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sounds(BlockSoundGroup.POLISHED_DEEPSLATE).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                            Identifier.of(CinchsBetterDeepslate.MOD_ID, "polished_deepslate_pressure_plate")))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CinchsBetterDeepslate.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CinchsBetterDeepslate.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }
    public static Block CreatePolishedDeepslateButton() {
        return new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                Identifier.of(CinchsBetterDeepslate.MOD_ID, "polished_deepslate_button"))));
    }
    public static void registerModBlocks() {
        CinchsBetterDeepslate.LOGGER.info("Registering ModBlocks for " + CinchsBetterDeepslate.MOD_ID);
    }
}