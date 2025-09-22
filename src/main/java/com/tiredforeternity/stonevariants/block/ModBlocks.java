package com.tiredforeternity.stonevariants.block;

import com.tiredforeternity.stonevariants.StoneVariants;
import com.tiredforeternity.stonevariants.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(StoneVariants.MODID);

    // =============================================COBBLESTONE================================================

    public static final DeferredBlock<Block> DIRTY_COBBLSTONE = registerBlock("dirty_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.ROOTED_DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));


    public static final DeferredBlock<SlabBlock> DIRTY_COBBLESTONE_SLAB = registerBlock("dirty_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .sound(SoundType.ROOTED_DIRT)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> DIRTY_COBBLESTONE_STAIRS = registerBlock("dirty_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.DIRTY_COBBLSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .sound(SoundType.ROOTED_DIRT)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> DIRTY_COBBLESTONE_WALL = registerBlock("dirty_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .sound(SoundType.ROOTED_DIRT)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> SANDY_COBBLSTONE = registerBlock("sandy_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SANDY_COBBLESTONE_SLAB = registerBlock("sandy_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SANDY_COBBLESTONE_STAIRS = registerBlock("sandy_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.SANDY_COBBLSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .sound(SoundType.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> SANDY_COBBLESTONE_WALL = registerBlock("sandy_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> SNOWY_COBBLSTONE = registerBlock("snowy_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.SNOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SNOWY_COBBLESTONE_SLAB = registerBlock("snowy_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.SNOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SNOWY_COBBLESTONE_STAIRS = registerBlock("snowy_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.SANDY_COBBLSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SNOW)
                            .sound(SoundType.SNOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> SNOWY_COBBLESTONE_WALL = registerBlock("snowy_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.SNOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> MUDDY_COBBLSTONE = registerBlock("muddy_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.MUD_BRICKS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> MUDDY_COBBLESTONE_SLAB = registerBlock("muddy_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.MUD_BRICKS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> MUDDY_COBBLESTONE_STAIRS = registerBlock("muddy_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.MUDDY_COBBLSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .sound(SoundType.MUD_BRICKS)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> MUDDY_COBBLESTONE_WALL = registerBlock("muddy_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.MUD_BRICKS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> ROOTED_COBBLSTONE = registerBlock("rooted_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> ROOTED_COBBLESTONE_SLAB = registerBlock("rooted_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> ROOTED_COBBLESTONE_STAIRS = registerBlock("rooted_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.ROOTED_COBBLSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PODZOL)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> ROOTED_COBBLESTONE_WALL = registerBlock("rooted_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> VEINY_COBBLESTONE = registerBlock("veiny_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.SCULK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> VEINY_COBBLESTONE_SLAB = registerBlock("veiny_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.SCULK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> VEINY_COBBLESTONE_STAIRS = registerBlock("veiny_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.VEINY_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_BLACK)
                            .sound(SoundType.SCULK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> VEINY_COBBLESTONE_WALL = registerBlock("veiny_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.SCULK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> LEAFY_COBBLESTONE = registerBlock("leafy_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> LEAFY_COBBLESTONE_SLAB = registerBlock("leafy_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> LEAFY_COBBLESTONE_STAIRS = registerBlock("leafy_cobblestone_stairs",
            () -> new StairBlock(ModBlocks.LEAFY_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .sound(SoundType.GRASS)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> LEAFY_COBBLESTONE_WALL = registerBlock("leafy_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    // =============================================STONE BRICKS================================================

    public static final DeferredBlock<Block> DIRTY_STONE_BRICKS = registerBlock("dirty_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> DIRTY_STONE_BRICKS_SLAB = registerBlock("dirty_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> DIRTY_STONE_BRICKS_STAIRS = registerBlock("dirty_stone_bricks_stairs",
            () -> new StairBlock(ModBlocks.DIRTY_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> DIRTY_STONE_BRICKS_WALL = registerBlock("dirty_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> SANDY_STONE_BRICKS = registerBlock("sandy_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SANDY_STONE_BRICKS_SLAB = registerBlock("sandy_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SANDY_STONE_BRICKS_STAIRS = registerBlock("sandy_stone_bricks_stairs",
            () -> new StairBlock(ModBlocks.SANDY_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> SANDY_STONE_BRICKS_WALL = registerBlock("sandy_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> SNOWY_STONE_BRICKS = registerBlock("snowy_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SNOWY_STONE_BRICKS_SLAB = registerBlock("snowy_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SNOWY_STONE_BRICKS_STAIRS = registerBlock("snowy_stone_bricks_stairs",
            () -> new StairBlock(ModBlocks.SNOWY_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SNOW)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> SNOWY_STONE_BRICKS_WALL = registerBlock("snowy_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> MUDDY_STONE_BRICKS = registerBlock("muddy_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> MUDDY_STONE_BRICKS_SLAB = registerBlock("muddy_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> MUDDY_STONE_BRICKS_STAIRS = registerBlock("muddy_stone_bricks_stairs",
            () -> new StairBlock(ModBlocks.MUDDY_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> MUDDY_STONE_BRICKS_WALL = registerBlock("muddy_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> ROOTED_STONE_BRICKS = registerBlock("rooted_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> ROOTED_STONE_BRICKS_SLAB = registerBlock("rooted_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> ROOTED_STONE_BRICKS_STAIRS = registerBlock("rooted_stone_bricks_stairs",
            () -> new StairBlock(ModBlocks.ROOTED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PODZOL)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> ROOTED_STONE_BRICKS_WALL = registerBlock("rooted_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> SCULKY_STONE_BRICKS = registerBlock("sculky_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SCULKY_STONE_BRICKS_SLAB = registerBlock("sculky_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SCULKY_STONE_BRICKS_STAIRS = registerBlock("sculky_stone_bricks_stairs",
            () -> new StairBlock(ModBlocks.SCULKY_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_BLACK)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> SCULKY_STONE_BRICKS_WALL = registerBlock("sculky_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> LEAFY_STONE_BRICKS = registerBlock("leafy_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> LEAFY_STONE_BRICKS_SLAB = registerBlock("leafy_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> LEAFY_STONE_BRICKS_STAIRS = registerBlock("leafy_stone_bricks_stairs",
            () -> new StairBlock(ModBlocks.LEAFY_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> LEAFY_STONE_BRICKS_WALL = registerBlock("leafy_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    // =============================================SANDSTONE BRICKS================================================

    public static final DeferredBlock<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SANDSTONE_BRICKS_SLAB = registerBlock("sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SANDSTONE_BRICKS_STAIRS = registerBlock("sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F,6.0F)));

    public static final DeferredBlock<WallBlock> SANDSTONE_BRICKS_WALL = registerBlock("sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> CHISELED_SANDSTONE_BRICKS = registerBlock("chiseled_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> CHISELED_SANDSTONE_BRICKS_SLAB = registerBlock("chiseled_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> CRACKED_SANDSTONE_BRICKS_SLAB = registerBlock("cracked_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> CRACKED_SANDSTONE_BRICKS_STAIRS = registerBlock("cracked_sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> CRACKED_SANDSTONE_BRICKS_WALL = registerBlock("cracked_sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> DIRTY_SANDSTONE_BRICKS = registerBlock("dirty_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> DIRTY_SANDSTONE_BRICKS_SLAB = registerBlock("dirty_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> DIRTY_SANDSTONE_BRICKS_STAIRS = registerBlock("dirty_sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.DIRTY_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> DIRTY_SANDSTONE_BRICKS_WALL = registerBlock("dirty_sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> SNOWY_SANDSTONE_BRICKS = registerBlock("snowy_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SNOWY_SANDSTONE_BRICKS_SLAB = registerBlock("snowy_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SNOWY_SANDSTONE_BRICKS_STAIRS = registerBlock("snowy_sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.SNOWY_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SNOW)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> SNOWY_SANDSTONE_BRICKS_WALL = registerBlock("snowy_sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> MUDDY_SANDSTONE_BRICKS = registerBlock("muddy_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> MUDDY_SANDSTONE_BRICKS_SLAB = registerBlock("muddy_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> MUDDY_SANDSTONE_BRICKS_STAIRS = registerBlock("muddy_sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.MUDDY_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> MUDDY_SANDSTONE_BRICKS_WALL = registerBlock("muddy_sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> ROOTED_SANDSTONE_BRICKS = registerBlock("rooted_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> ROOTED_SANDSTONE_BRICKS_SLAB = registerBlock("rooted_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> ROOTED_SANDSTONE_BRICKS_STAIRS = registerBlock("rooted_sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.ROOTED_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PODZOL)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));
    
    public static final DeferredBlock<WallBlock> ROOTED_SANDSTONE_BRICKS_WALL = registerBlock("rooted_sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> SCULKY_SANDSTONE_BRICKS = registerBlock("sculky_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> SCULKY_SANDSTONE_BRICKS_SLAB = registerBlock("sculky_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> SCULKY_SANDSTONE_BRICKS_STAIRS = registerBlock("sculky_sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.SCULKY_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_BLACK)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> SCULKY_SANDSTONE_BRICKS_WALL = registerBlock("sculky_sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<Block> LEAFY_SANDSTONE_BRICKS = registerBlock("leafy_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<SlabBlock> LEAFY_SANDSTONE_BRICKS_SLAB = registerBlock("leafy_sandstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));

    public static final DeferredBlock<StairBlock> LEAFY_SANDSTONE_BRICKS_STAIRS = registerBlock("leafy_sandstone_bricks_stairs",
            () -> new StairBlock(ModBlocks.LEAFY_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .sound(SoundType.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 6.0F)));

    public static final DeferredBlock<WallBlock> LEAFY_SANDSTONE_BRICKS_WALL = registerBlock("leafy_sandstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
