package com.tiredforeternity.stonevariants;

import com.tiredforeternity.stonevariants.block.ModBlocks;
import com.tiredforeternity.stonevariants.item.ModCreativeModeTabs;
import com.tiredforeternity.stonevariants.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.EventBus;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(StoneVariants.MODID)
public class StoneVariants {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "stonevariants";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public StoneVariants(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.DIRTY_COBBLSTONE);
            event.accept(ModBlocks.DIRTY_COBBLESTONE_SLAB);
            event.accept(ModBlocks.DIRTY_COBBLESTONE_STAIRS);
            event.accept(ModBlocks.DIRTY_COBBLESTONE_WALL);

            event.accept(ModBlocks.SANDY_COBBLSTONE);
            event.accept(ModBlocks.SANDY_COBBLESTONE_SLAB);
            event.accept(ModBlocks.SANDY_COBBLESTONE_STAIRS);
            event.accept(ModBlocks.SANDY_COBBLESTONE_WALL);

            event.accept(ModBlocks.SNOWY_COBBLSTONE);
            event.accept(ModBlocks.SNOWY_COBBLESTONE_SLAB);
            event.accept(ModBlocks.SNOWY_COBBLESTONE_STAIRS);
            event.accept(ModBlocks.SNOWY_COBBLESTONE_WALL);

            event.accept(ModBlocks.MUDDY_COBBLSTONE);
            event.accept(ModBlocks.MUDDY_COBBLESTONE_SLAB);
            event.accept(ModBlocks.MUDDY_COBBLESTONE_STAIRS);
            event.accept(ModBlocks.MUDDY_COBBLESTONE_WALL);

            event.accept(ModBlocks.ROOTED_COBBLSTONE);
            event.accept(ModBlocks.ROOTED_COBBLESTONE_SLAB);
            event.accept(ModBlocks.ROOTED_COBBLESTONE_STAIRS);
            event.accept(ModBlocks.ROOTED_COBBLESTONE_WALL);

            event.accept(ModBlocks.VEINY_COBBLESTONE);
            event.accept(ModBlocks.VEINY_COBBLESTONE_SLAB);
            event.accept(ModBlocks.VEINY_COBBLESTONE_STAIRS);
            event.accept(ModBlocks.VEINY_COBBLESTONE_WALL);

            event.accept(ModBlocks.LEAFY_COBBLESTONE);
            event.accept(ModBlocks.LEAFY_COBBLESTONE_SLAB);
            event.accept(ModBlocks.LEAFY_COBBLESTONE_STAIRS);
            event.accept(ModBlocks.LEAFY_COBBLESTONE_WALL);

            event.accept(ModBlocks.DIRTY_STONE_BRICKS);
            event.accept(ModBlocks.DIRTY_STONE_BRICKS_SLAB);
            event.accept(ModBlocks.DIRTY_STONE_BRICKS_STAIRS);
            event.accept(ModBlocks.DIRTY_STONE_BRICKS_WALL);

            event.accept(ModBlocks.SANDY_STONE_BRICKS);
            event.accept(ModBlocks.SANDY_STONE_BRICKS_SLAB);
            event.accept(ModBlocks.SANDY_STONE_BRICKS_STAIRS);
            event.accept(ModBlocks.SANDY_STONE_BRICKS_WALL);

            event.accept(ModBlocks.SNOWY_STONE_BRICKS);
            event.accept(ModBlocks.SNOWY_STONE_BRICKS_SLAB);
            event.accept(ModBlocks.SNOWY_STONE_BRICKS_STAIRS);
            event.accept(ModBlocks.SNOWY_STONE_BRICKS_WALL);

            event.accept(ModBlocks.MUDDY_STONE_BRICKS);
            event.accept(ModBlocks.MUDDY_STONE_BRICKS_SLAB);
            event.accept(ModBlocks.MUDDY_STONE_BRICKS_STAIRS);
            event.accept(ModBlocks.MUDDY_STONE_BRICKS_WALL);

            event.accept(ModBlocks.ROOTED_STONE_BRICKS);
            event.accept(ModBlocks.ROOTED_STONE_BRICKS_SLAB);
            event.accept(ModBlocks.ROOTED_STONE_BRICKS_STAIRS);
            event.accept(ModBlocks.ROOTED_STONE_BRICKS_WALL);

            event.accept(ModBlocks.SCULKY_STONE_BRICKS);
            event.accept(ModBlocks.SCULKY_STONE_BRICKS_SLAB);
            event.accept(ModBlocks.SCULKY_STONE_BRICKS_STAIRS);
            event.accept(ModBlocks.SCULKY_STONE_BRICKS_WALL);

            event.accept(ModBlocks.LEAFY_STONE_BRICKS);
            event.accept(ModBlocks.LEAFY_STONE_BRICKS_SLAB);
            event.accept(ModBlocks.LEAFY_STONE_BRICKS_STAIRS);
            event.accept(ModBlocks.LEAFY_STONE_BRICKS_WALL);

            event.accept(ModBlocks.SANDSTONE_BRICKS);
            event.accept(ModBlocks.SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.SANDSTONE_BRICKS_WALL);

            event.accept(ModBlocks.CHISELED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.CHISELED_SANDSTONE_BRICKS_SLAB);

            event.accept(ModBlocks.CRACKED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.CRACKED_SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.CRACKED_SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.CRACKED_SANDSTONE_BRICKS_WALL);

            event.accept(ModBlocks.DIRTY_SANDSTONE_BRICKS);
            event.accept(ModBlocks.DIRTY_SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.DIRTY_SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.DIRTY_SANDSTONE_BRICKS_WALL);

            event.accept(ModBlocks.SNOWY_SANDSTONE_BRICKS);
            event.accept(ModBlocks.SNOWY_SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.SNOWY_SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.SNOWY_SANDSTONE_BRICKS_WALL);

            event.accept(ModBlocks.MUDDY_SANDSTONE_BRICKS);
            event.accept(ModBlocks.MUDDY_SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.MUDDY_SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.MUDDY_SANDSTONE_BRICKS_WALL);

            event.accept(ModBlocks.ROOTED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.ROOTED_SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.ROOTED_SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.ROOTED_SANDSTONE_BRICKS_WALL);

            event.accept(ModBlocks.SCULKY_SANDSTONE_BRICKS);
            event.accept(ModBlocks.SCULKY_SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.SCULKY_SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.SCULKY_SANDSTONE_BRICKS_WALL);

            event.accept(ModBlocks.LEAFY_SANDSTONE_BRICKS);
            event.accept(ModBlocks.LEAFY_SANDSTONE_BRICKS_SLAB);
            event.accept(ModBlocks.LEAFY_SANDSTONE_BRICKS_STAIRS);
            event.accept(ModBlocks.LEAFY_SANDSTONE_BRICKS_WALL);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = StoneVariants.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
