package com.tiredforeternity.stonevariants.item;

import com.tiredforeternity.stonevariants.StoneVariants;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StoneVariants.MODID);

    public static final DeferredItem<Item> SCULK_SEED = ITEMS.register("sculk_seed",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROOTS = ITEMS.register("roots",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
