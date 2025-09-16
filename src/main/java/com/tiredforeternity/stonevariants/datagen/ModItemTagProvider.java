package com.tiredforeternity.stonevariants.datagen;

import com.tiredforeternity.stonevariants.StoneVariants;
import com.tiredforeternity.stonevariants.item.ModItems;
import com.tiredforeternity.stonevariants.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper){
        super(output, lookupProvider, blockTags, StoneVariants.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider){
        tag(ModTags.Items.VARIANTS);
    }
}
