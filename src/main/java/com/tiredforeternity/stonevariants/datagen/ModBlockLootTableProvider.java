package com.tiredforeternity.stonevariants.datagen;

import com.tiredforeternity.stonevariants.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }


    @Override
    protected void generate() {
        dropSelf(ModBlocks.DIRTY_COBBLSTONE.get());
        dropSelf(ModBlocks.SANDY_COBBLSTONE.get());
        dropSelf(ModBlocks.SNOWY_COBBLSTONE.get());
        dropSelf(ModBlocks.MUDDY_COBBLSTONE.get());
        dropSelf(ModBlocks.ROOTED_COBBLSTONE.get());
        dropSelf(ModBlocks.VEINY_COBBLESTONE.get());
        dropSelf(ModBlocks.LEAFY_COBBLESTONE.get());
        dropSelf(ModBlocks.DIRTY_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.SANDY_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.SNOWY_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.MUDDY_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.ROOTED_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.VEINY_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.LEAFY_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.DIRTY_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.SANDY_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.SNOWY_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.MUDDY_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.ROOTED_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.VEINY_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.LEAFY_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.DIRTY_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.SANDY_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.SNOWY_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.MUDDY_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.ROOTED_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.VEINY_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.LEAFY_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.DIRTY_STONE_BRICKS.get());
        dropSelf(ModBlocks.SANDY_STONE_BRICKS.get());
        dropSelf(ModBlocks.SNOWY_STONE_BRICKS.get());
        dropSelf(ModBlocks.MUDDY_STONE_BRICKS.get());
        dropSelf(ModBlocks.ROOTED_STONE_BRICKS.get());
        dropSelf(ModBlocks.SCULKY_STONE_BRICKS.get());
        dropSelf(ModBlocks.LEAFY_STONE_BRICKS.get());
        dropSelf(ModBlocks.DIRTY_STONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.SANDY_STONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.SNOWY_STONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.MUDDY_STONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.ROOTED_STONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.SCULKY_STONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.LEAFY_STONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.DIRTY_STONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.SANDY_STONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.SNOWY_STONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.MUDDY_STONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.ROOTED_STONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.SCULKY_STONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.LEAFY_STONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.DIRTY_STONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.SANDY_STONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.SNOWY_STONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.MUDDY_STONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.ROOTED_STONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.SCULKY_STONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.LEAFY_STONE_BRICKS_WALL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}