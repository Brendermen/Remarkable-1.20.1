package net.brendermen.remarkable.util;

import net.brendermen.remarkable.block.ModBlocks;
import net.brendermen.remarkable.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class ModTab {

    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            Building_Blocks(event);
        } else if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            Colored_Blocks(event);
        } else if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            Natural_Blocks(event);
        } else if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            Functional_Block(event);
        } else if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            REDSTONE_BLOCKS(event);
        } else if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            TOOLS_AND_UTILITIES(event);
        } else if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            COMBAT(event);
        } else if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            FOOD_AND_DRINKS(event);
        } else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            INGREDIENTS(event);
        } else if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            SPAWN_EGGS(event);
        }
    }

    private static void Building_Blocks(BuildCreativeModeTabContentsEvent event) {

        event.getEntries().putBefore(Items.GOLD_BLOCK.getDefaultInstance(),
                ModBlocks.SILVER_BLOCK.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void Colored_Blocks(BuildCreativeModeTabContentsEvent event) {

    }

    private static void Natural_Blocks(BuildCreativeModeTabContentsEvent event) {

    }

    private static void Functional_Block(BuildCreativeModeTabContentsEvent event) {

    }

    private static void REDSTONE_BLOCKS(BuildCreativeModeTabContentsEvent event) {

    }

    private static void TOOLS_AND_UTILITIES(BuildCreativeModeTabContentsEvent event) {

    }

    private static void COMBAT(BuildCreativeModeTabContentsEvent event) {

    }

    private static void FOOD_AND_DRINKS(BuildCreativeModeTabContentsEvent event) {

    }

    private static void INGREDIENTS(BuildCreativeModeTabContentsEvent event) {

        event.getEntries().putBefore(Items.GOLD_INGOT.getDefaultInstance(),
                ModItems.SILVER_INGOT.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void SPAWN_EGGS(BuildCreativeModeTabContentsEvent event) {

    }
}