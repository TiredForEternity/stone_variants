package com.tiredforeternity.stonevariants.datagen;

import com.tiredforeternity.stonevariants.StoneVariants;
import com.tiredforeternity.stonevariants.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StoneVariants.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        basicItem(ModItems.SCULK_SEED.get());
    }
}
