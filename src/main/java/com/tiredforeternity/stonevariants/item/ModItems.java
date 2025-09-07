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
    public static final DeferredItem<Item> MUD_BALL = ITEMS.register("mud_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BUCKET_OF_DIRT = ITEMS.register("bucket_of_dirt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BUCKET_OF_SAND = ITEMS.register("bucket_of_sand",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BUCKET_OF_MUD = ITEMS.register("bucket_of_mud",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
