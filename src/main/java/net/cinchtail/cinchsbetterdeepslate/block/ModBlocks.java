package net.cinchtail.cinchsbetterdeepslate.block;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.util.ModBlockSetType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class ModBlocks {

    public static final Block SCULK_INLAID_DEEPSLATE = registerBlock("sculk_inlaid_deepslate",
            properties -> new DropExperienceBlock(UniformInt.of(1,1), properties.sound(SoundType.DEEPSLATE_BRICKS)
                    .strength(3.5f, 6.0F).mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            properties -> new RotatedPillarBlock(properties.strength(2.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            properties -> new Block(properties.requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .strength(3.5f, 6.0F).mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            properties -> new StairBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.defaultBlockState(),
                    properties.strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE)
                            .requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(3.5f, 6.0F)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            properties -> new WallBlock(properties.requiresCorrectToolForDrops().strength(3.5f, 6.0F)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).forceSolidOn()));

    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            properties -> new Block(properties.requiresCorrectToolForDrops().strength(3.5f, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS).mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            properties -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(3.5f, 6.0F)
                            .sound(SoundType.DEEPSLATE_BRICKS).mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            properties -> new SlabBlock(properties.requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            properties -> new WallBlock(properties.requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_BRICKS).forceSolidOn()));

    public static final Block MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            properties -> new Block(properties.strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_TILES)
                    .requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            properties -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_TILES.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(3.5f, 6.0F)
                            .sound(SoundType.DEEPSLATE_TILES).mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            properties -> new SlabBlock(properties.requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_TILES)));
    public static final Block MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            properties -> new WallBlock(properties.requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3.5f, 6.0F).sound(SoundType.DEEPSLATE_TILES).forceSolidOn()));

    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            properties -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(),
                    properties.requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)
                            .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)
                            .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            properties -> new SlabBlock(properties.requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            properties -> new WallBlock(properties.requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn()));

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            properties -> new PressurePlateBlock(ModBlockSetType.POLISHED_DEEPSLATE,
                    properties.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            properties -> new ButtonBlock(ModBlockSetType.POLISHED_DEEPSLATE, 20,
                    properties.strength(0.5F).mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).noCollision()));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK,
                Identifier.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, name))));registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, name), toRegister);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CinchsBetterDeepslate.MOD_ID, name)))));
    }
    public static void registerModBlocks() {
        CinchsBetterDeepslate.LOGGER.info("Registering ModBlocks for " + CinchsBetterDeepslate.MOD_ID);
    }
}