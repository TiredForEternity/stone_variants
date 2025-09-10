package com.tiredforeternity.stonevariants.item;

import com.tiredforeternity.stonevariants.StoneVariants;
import com.tiredforeternity.stonevariants.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StoneVariants.MODID);

    public static final Supplier<CreativeModeTab> STONE_VARIANTS_ITEMS_TAB = CREATIVE_MODE_TAB.register("items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCULK_SEED.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(StoneVariants.MODID, "blocks_tab"))
                    .title(Component.translatable("creativetab.stonevariants.items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SCULK_SEED);
                        output.accept(ModItems.ROOTS);
                        output.accept(ModItems.BUCKET_OF_DIRT);
                        output.accept(ModItems.BUCKET_OF_SAND);
                        output.accept(ModItems.BUCKET_OF_MUD);
                        output.accept(ModItems.MUD_BALL);
                    }).build());

    public static final Supplier<CreativeModeTab> STONE_VARIANTS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SNOWY_STONE_BRICKS.get()))
                    .title(Component.translatable("creativetab.stonevariants.blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DIRTY_COBBLSTONE);
                        output.accept(ModBlocks.DIRTY_COBBLESTONE_STAIRS);
                        output.accept(ModBlocks.DIRTY_COBBLESTONE_SLAB);
                        output.accept(ModBlocks.DIRTY_COBBLESTONE_WALL);
                        output.accept(ModBlocks.SANDY_COBBLSTONE);
                        output.accept(ModBlocks.SANDY_COBBLESTONE_STAIRS);
                        output.accept(ModBlocks.SANDY_COBBLESTONE_SLAB);
                        output.accept(ModBlocks.SANDY_COBBLESTONE_WALL);
                        output.accept(ModBlocks.SNOWY_COBBLSTONE);
                        output.accept(ModBlocks.SNOWY_COBBLESTONE_STAIRS);
                        output.accept(ModBlocks.SNOWY_COBBLESTONE_SLAB);
                        output.accept(ModBlocks.SNOWY_COBBLESTONE_WALL);
                        output.accept(ModBlocks.MUDDY_COBBLSTONE);
                        output.accept(ModBlocks.MUDDY_COBBLESTONE_STAIRS);
                        output.accept(ModBlocks.MUDDY_COBBLESTONE_SLAB);
                        output.accept(ModBlocks.MUDDY_COBBLESTONE_WALL);
                        output.accept(ModBlocks.ROOTED_COBBLSTONE);
                        output.accept(ModBlocks.ROOTED_COBBLESTONE_STAIRS);
                        output.accept(ModBlocks.ROOTED_COBBLESTONE_SLAB);
                        output.accept(ModBlocks.ROOTED_COBBLESTONE_WALL);
                        output.accept(ModBlocks.VEINY_COBBLESTONE);
                        output.accept(ModBlocks.VEINY_COBBLESTONE_STAIRS);
                        output.accept(ModBlocks.VEINY_COBBLESTONE_SLAB);
                        output.accept(ModBlocks.VEINY_COBBLESTONE_WALL);
                        output.accept(ModBlocks.LEAFY_COBBLESTONE);
                        output.accept(ModBlocks.LEAFY_COBBLESTONE_STAIRS);
                        output.accept(ModBlocks.LEAFY_COBBLESTONE_SLAB);
                        output.accept(ModBlocks.LEAFY_COBBLESTONE_WALL);
                        output.accept(ModBlocks.DIRTY_STONE_BRICKS);
                        output.accept(ModBlocks.SANDY_STONE_BRICKS);
                        output.accept(ModBlocks.SNOWY_STONE_BRICKS);
                        output.accept(ModBlocks.MUDDY_STONE_BRICKS);
                        output.accept(ModBlocks.ROOTED_STONE_BRICKS);
                        output.accept(ModBlocks.SCULKY_STONE_BRICKS);
                        output.accept(ModBlocks.LEAFY_STONE_BRICKS);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
