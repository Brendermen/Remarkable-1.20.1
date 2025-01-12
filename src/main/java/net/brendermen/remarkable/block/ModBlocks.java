package net.brendermen.remarkable.block;

import net.brendermen.remarkable.Remarkable;
import net.brendermen.remarkable.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Remarkable.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
//names lang light_blue light_gray carpets 
    
    // textures prismarine blocks


    public static final RegistryObject<Block> ACACIA_BOARDS = registerBlock("acacia_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> AMBER_CARPET = registerBlock("amber_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CARPET)));
    public static final RegistryObject<Block> AMBER_CONCRETE = registerBlock("amber_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> AMBER_CONCRETE_POWDER = registerBlock("amber_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> AMBER_CONCRETE_STAIRS = registerBlock("amber_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.AMBER_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> AMBER_STAINED_GLASS = registerBlock("amber_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> AMBER_TERRACOTTA = registerBlock("amber_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICK_SLAB = registerBlock("amber_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICK_STAIRS = registerBlock("amber_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.AMBER_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICKS = registerBlock("amber_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AMBER_TERRACOTTA_SLAB = registerBlock("amber_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AMBER_TERRACOTTA_STAIRS = registerBlock("amber_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.AMBER_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AMBER_WOOL = registerBlock("amber_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> AMBER_WOOL_SLAB = registerBlock("amber_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> AMBER_WOOL_STAIRS = registerBlock("amber_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.AMBER_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ANDESITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> ANDESITE_PILLAR = registerBlock("andesite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> ANDESITE_TILE_SLAB = registerBlock("andesite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> ANDESITE_TILE_STAIRS = registerBlock("andesite_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.ANDESITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> ANDESITE_TILES = registerBlock("andesite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> AQUA_WOOL = registerBlock("aqua_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> AZURE_CARPET = registerBlock("azure_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> AZURE_CONCRETE = registerBlock("azure_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> AZURE_CONCRETE_POWDER = registerBlock("azure_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> AZURE_CONCRETE_STAIRS = registerBlock("azure_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.AZURE_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> AZURE_STAINED_GLASS = registerBlock("azure_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> AZURE_TERRACOTTA = registerBlock("azure_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AZURE_TERRACOTTA_BRICK_SLAB = registerBlock("azure_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AZURE_TERRACOTTA_BRICK_STAIRS = registerBlock("azure_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.AZURE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AZURE_TERRACOTTA_BRICKS = registerBlock("azure_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AZURE_TERRACOTTA_SLAB = registerBlock("azure_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AZURE_TERRACOTTA_STAIRS = registerBlock("azure_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.AZURE_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> AZURE_WOOL = registerBlock("azure_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> AZURE_WOOL_SLAB = registerBlock("azure_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> AZURE_WOOL_STAIRS = registerBlock("azure_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.AZURE_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BIRCH_BOARDS = registerBlock("birch_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(Blocks.BLACK_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            () -> new StairBlock(Blocks.BLACK_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BLACKSTONE_PILLAR = registerBlock("blackstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> BLACKSTONE_TILES = registerBlock("blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(Blocks.BLUE_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            () -> new StairBlock(Blocks.BLUE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            () -> new StairBlock(Blocks.BLUE_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BLUSH_WOOL = registerBlock("blush_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(Blocks.BROWN_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            () -> new StairBlock(Blocks.BROWN_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            () -> new StairBlock(Blocks.BROWN_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_PILLAR = registerBlock("calcite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_TILES = registerBlock("calcite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
    public static final RegistryObject<Block> CHISELED_CALCITE = registerBlock("chiseled_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CHISELED_CLAY = registerBlock("chiseled_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));
    public static final RegistryObject<Block> CHISELED_DEEP_ELDER_PRISMARINE = registerBlock("chiseled_deep_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> CHISELED_DEEP_PRISMARINE = registerBlock("chiseled_deep_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> CHISELED_DIORITE = registerBlock("chiseled_diorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> CHISELED_DIRT = registerBlock("chiseled_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHISELED_GRANITE = registerBlock("chiseled_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
    public static final RegistryObject<Block> CHISELED_MAGMA = registerBlock("chiseled_magma",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));
    public static final RegistryObject<Block> CHISELED_MUD = registerBlock("chiseled_mud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));
    public static final RegistryObject<Block> CHISELED_NETHERRACK = registerBlock("chiseled_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> CHISELED_PACKED_MUD = registerBlock("chiseled_packed_mud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));
    public static final RegistryObject<Block> CHISELED_PRISMARINE = registerBlock("chiseled_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> CHISELED_SLATE = registerBlock("chiseled_slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<Block> CHISELED_TUFF = registerBlock("chiseled_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    public static final RegistryObject<Block> CLAY_BRICKS = registerBlock("clay_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));
    public static final RegistryObject<Block> CLAY_PILLAR = registerBlock("clay_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)));
    public static final RegistryObject<Block> CLAY_TILES = registerBlock("clay_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));
    public static final RegistryObject<Block> COBBLED_RED_SANDSTONE = registerBlock("cobbled_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
    public static final RegistryObject<Block> COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> CRACKED_CHISELED_STONE = registerBlock("cracked_chiseled_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_STONE = registerBlock("cracked_polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_STONE_SLAB = registerBlock("cracked_polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_STONE_STAIRS = registerBlock("cracked_polished_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.CRACKED_POLISHED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_STONE_BRICKS::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_PILLAR = registerBlock("cracked_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_TILE_SLAB = registerBlock("cracked_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_TILE_STAIRS = registerBlock("cracked_stone_tile_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CREAM_CARPET = registerBlock("cream_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CREAM_CONCRETE = registerBlock("cream_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CREAM_CONCRETE_POWDER = registerBlock("cream_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> CREAM_CONCRETE_STAIRS = registerBlock("cream_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.CREAM_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CREAM_STAINED_GLASS = registerBlock("cream_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA = registerBlock("cream_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA_BRICK_SLAB = registerBlock("cream_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA_BRICK_STAIRS = registerBlock("cream_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CREAM_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA_BRICKS = registerBlock("cream_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA_SLAB = registerBlock("cream_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA_STAIRS = registerBlock("cream_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.CREAM_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_WOOL = registerBlock("cream_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CREAM_WOOL_SLAB = registerBlock("cream_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CREAM_WOOL_STAIRS = registerBlock("cream_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.CREAM_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CRIMSON_BOARDS = registerBlock("crimson_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(Blocks.CYAN_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            () -> new StairBlock(Blocks.CYAN_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            () -> new StairBlock(Blocks.CYAN_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> DARK_OAK_BOARDS = registerBlock("dark_oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> DEEP_DIRT = registerBlock("deep_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DEEP_ELDER_PRISMARINE = registerBlock("deep_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DEEP_ELDER_PRISMARINE_BRICKS = registerBlock("deep_elder_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DEEP_ELDER_PRISMARINE_PILLAR = registerBlock("deep_elder_prismarine_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DEEP_ELDER_PRISMARINE_TILES = registerBlock("deep_elder_prismarine_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DEEP_ELDER_SEA_LAMP = registerBlock("deep_elder_sea_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)));
    public static final RegistryObject<Block> DEEP_PRISMARINE = registerBlock("deep_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DEEP_PRISMARINE_BRICKS = registerBlock("deep_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DEEP_PRISMARINE_PILLAR = registerBlock("deep_prismarine_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DEEP_SEA_LAMP = registerBlock("deep_sea_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)));
    public static final RegistryObject<Block> DEEPSLATE_PILLAR = registerBlock("deepslate_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DIORITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> DIORITE_PILLAR = registerBlock("diorite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> DIORITE_TILE_SLAB = registerBlock("diorite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> DIORITE_TILE_STAIRS = registerBlock("diorite_tile_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> DIORITE_TILES = registerBlock("diorite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
    public static final RegistryObject<Block> DIRT_BRICKS = registerBlock("dirt_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_PILLAR = registerBlock("dirt_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_TILES = registerBlock("dirt_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_PILLAR = registerBlock("dripstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POLISHED_DEEP_ELDER_PRISMARINE = registerBlock("polished_deep_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> ELDER_PRISMARINE_BRICKS = registerBlock("elder_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public static final RegistryObject<Block> ELDER_PRISMARINE_PILLAR = registerBlock("elder_prismarine_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> ELDER_SEA_LAMP = registerBlock("elder_sea_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)));
    public static final RegistryObject<Block> FOREST_CARPET = registerBlock("forest_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FOREST_CONCRETE = registerBlock("forest_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> FOREST_CONCRETE_POWDER = registerBlock("forest_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> FOREST_CONCRETE_STAIRS = registerBlock("forest_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.FOREST_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> FOREST_STAINED_GLASS = registerBlock("forest_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FOREST_TERRACOTTA = registerBlock("forest_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICK_SLAB = registerBlock("forest_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICK_STAIRS = registerBlock("forest_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.FOREST_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICKS = registerBlock("forest_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_TERRACOTTA_SLAB = registerBlock("forest_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_TERRACOTTA_STAIRS = registerBlock("forest_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.FOREST_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_WOOL = registerBlock("forest_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FOREST_WOOL_SLAB = registerBlock("forest_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FOREST_WOOL_STAIRS = registerBlock("forest_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.FOREST_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FUCHSIA_CARPET = registerBlock("fuchsia_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FUCHSIA_CONCRETE = registerBlock("fuchsia_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> FUCHSIA_CONCRETE_POWDER = registerBlock("fuchsia_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> FUCHSIA_CONCRETE_STAIRS = registerBlock("fuchsia_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.FUCHSIA_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> FUCHSIA_STAINED_GLASS = registerBlock("fuchsia_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA = registerBlock("fuchsia_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_BRICK_SLAB = registerBlock("fuchsia_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_BRICK_STAIRS = registerBlock("fuchsia_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.FUCHSIA_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_BRICKS = registerBlock("fuchsia_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_SLAB = registerBlock("fuchsia_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_STAIRS = registerBlock("fuchsia_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.FUCHSIA_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static final RegistryObject<Block> GRASS_SLAB = registerBlock("grass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> SCORCHED_NETHER_BRICKS = registerBlock("scorched_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));

    public static final RegistryObject<Block> OAK_PANELS = registerBlock("oak_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SANDED_OAK = registerBlock("sanded_oak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> OAK_BEAM = registerBlock("oak_beam",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> OAK_TRIM = registerBlock("oak_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));








    public static final RegistryObject<Block> POLISHED_DEEP_PRISMARINE = registerBlock("polished_deep_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));



























    public static final RegistryObject<Block> PRISMARINE_TILES = registerBlock("prismarine_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> ELDER_PRISMARINE_TILES = registerBlock("elder_prismarine_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> CHISELED_ELDER_PRISMARINE = registerBlock("chiseled_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));





    public static final RegistryObject<Block> PRISMARINE_PILLAR = registerBlock("prismarine_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));




























    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));











    public static final RegistryObject<Block> TUFF_BRICKS = registerBlock("tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> TUFF_TILES = registerBlock("tuff_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)));



    public static final RegistryObject<Block> TUFF_PILLAR = registerBlock("tuff_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));








    public static final RegistryObject<Block> NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> NETHERRACK_TILES = registerBlock("netherrack_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));



    public static final RegistryObject<Block> NETHERRACK_PILLAR = registerBlock("netherrack_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));



    public static final RegistryObject<Block> POLISHED_MAGMA = registerBlock("polished_magma",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));

    public static final RegistryObject<Block> MAGMA_BRICKS = registerBlock("magma_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));

    public static final RegistryObject<Block> MAGMA_TILES = registerBlock("magma_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));



    public static final RegistryObject<Block> MAGMA_PILLAR = registerBlock("magma_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)));















    public static final RegistryObject<Block> LIGHT_GRAY = registerBlock("light_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));

    public static final RegistryObject<Block> POLISHED_LIGHT_GRAY = registerBlock("polished_light_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));

    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));

    public static final RegistryObject<Block> LIGHT_GRAY_TILES = registerBlock("light_gray_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));



    public static final RegistryObject<Block> LIGHT_GRAY_PILLAR = registerBlock("light_gray_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)));































    //<editor-fold desc="WOOD">

    public static final RegistryObject<Block> OAK_BOARDS = registerBlock("oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));




    public static final RegistryObject<Block> SPRUCE_BOARDS = registerBlock("spruce_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));








    public static final RegistryObject<Block> JUNGLE_BOARDS = registerBlock("jungle_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));


    public static final RegistryObject<Block> MANGROVE_BOARDS = registerBlock("mangrove_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));





    public static final RegistryObject<Block> WARPED_BOARDS = registerBlock("warped_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    //</editor-fold>

    //<editor-fold desc="NATURAL">
    public static final RegistryObject<Block> POLISHED_DIRT = registerBlock("polished_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));










    public static final RegistryObject<Block> POLISHED_PACKED_MUD = registerBlock("polished_packed_mud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> PACKED_MUD_TILES = registerBlock("packed_mud_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));



    public static final RegistryObject<Block> PACKED_MUD_PILLAR = registerBlock("packed_mud_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> POLISHED_MUD = registerBlock("polished_mud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<Block> MUD_BRICKS = registerBlock("mud_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<Block> MUD_TILES = registerBlock("mud_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));



    public static final RegistryObject<Block> MUD_PILLAR = registerBlock("mud_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));


    public static final RegistryObject<Block> POLISHED_CLAY = registerBlock("polished_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));












    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_TILES = registerBlock("sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_PILLAR = registerBlock("sandstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));




    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_PILLAR = registerBlock("red_sandstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));


    public static final RegistryObject<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> STONE_PILLAR = registerBlock("stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));


    public static final RegistryObject<Block> MOSSY_STONE = registerBlock("mossy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_STAIRS = registerBlock("mossy_stone_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_SLAB = registerBlock("mossy_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_CHISELED_STONE = registerBlock("mossy_chiseled_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_PILLAR = registerBlock("mossy_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));


    public static final RegistryObject<Block> CRACKED_STONE = registerBlock("cracked_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRACKED_STONE_STAIRS = registerBlock("cracked_stone_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRACKED_STONE_SLAB = registerBlock("cracked_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));


















    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> GRANITE_TILES = registerBlock("granite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> GRANITE_TILE_STAIRS = registerBlock("granite_tile_stairs",
            () -> new StairBlock(Blocks.STONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> GRANITE_TILE_SLAB = registerBlock("granite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));



    public static final RegistryObject<Block> GRANITE_PILLAR = registerBlock("granite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));












 



















    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));


    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)));


    public static final RegistryObject<Block> POLISHED_AMETHYST_BLOCK = registerBlock("polished_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));


    public static final RegistryObject<Block> POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> ELDER_PRISMARINE = registerBlock("elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> POLISHED_ELDER_PRISMARINE = registerBlock("polished_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));




    public static final RegistryObject<Block> POLISHED_NETHERRACK = registerBlock("polished_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> WARPED_NETHER_BRICKS = registerBlock("warped_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));




    public static final RegistryObject<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));
    //</editor-fold>

    //<editor-fold desc="CUSTOM COLORS">
    public static final RegistryObject<Block> FUCHSIA_WOOL = registerBlock("fuchsia_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> FUCHSIA_WOOL_STAIRS = registerBlock("fuchsia_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.FUCHSIA_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> FUCHSIA_WOOL_SLAB = registerBlock("fuchsia_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));













    public static final RegistryObject<Block> POLISHED_FUCHSIA_TERRACOTTA = registerBlock("polished_fuchsia_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));







    public static final RegistryObject<Block> POLISHED_FUCHSIA_CONCRETE = registerBlock("polished_fuchsia_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> FUCHSIA_CONCRETE_BRICKS = registerBlock("fuchsia_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> FUCHSIA_CONCRETE_TILES = registerBlock("fuchsia_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));




    public static final RegistryObject<Block> SCARLET_WOOL = registerBlock("scarlet_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> SCARLET_WOOL_STAIRS = registerBlock("scarlet_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.SCARLET_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> SCARLET_WOOL_SLAB = registerBlock("scarlet_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> SCARLET_CARPET = registerBlock("scarlet_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA = registerBlock("scarlet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_STAIRS = registerBlock("scarlet_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.SCARLET_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_SLAB = registerBlock("scarlet_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_BRICKS = registerBlock("scarlet_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_BRICK_STAIRS = registerBlock("scarlet_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SCARLET_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_BRICK_SLAB = registerBlock("scarlet_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_SCARLET_TERRACOTTA = registerBlock("polished_scarlet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_CONCRETE = registerBlock("scarlet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> SCARLET_CONCRETE_STAIRS = registerBlock("scarlet_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.SCARLET_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> SCARLET_CONCRETE_POWDER = registerBlock("scarlet_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_SCARLET_CONCRETE = registerBlock("polished_scarlet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> SCARLET_CONCRETE_BRICKS = registerBlock("scarlet_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> SCARLET_CONCRETE_TILES = registerBlock("scarlet_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> SCARLET_STAINED_GLASS = registerBlock("scarlet_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));












    public static final RegistryObject<Block> POLISHED_AMBER_TERRACOTTA = registerBlock("polished_amber_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));







    public static final RegistryObject<Block> POLISHED_AMBER_CONCRETE = registerBlock("polished_amber_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> AMBER_CONCRETE_BRICKS = registerBlock("amber_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> AMBER_CONCRETE_TILES = registerBlock("amber_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));




    public static final RegistryObject<Block> LEMON_WOOL = registerBlock("lemon_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LEMON_WOOL_STAIRS = registerBlock("lemon_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.LEMON_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LEMON_WOOL_SLAB = registerBlock("lemon_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LEMON_CARPET = registerBlock("lemon_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA = registerBlock("lemon_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_STAIRS = registerBlock("lemon_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.LEMON_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_SLAB = registerBlock("lemon_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_BRICKS = registerBlock("lemon_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_BRICK_STAIRS = registerBlock("lemon_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LEMON_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_BRICK_SLAB = registerBlock("lemon_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_LEMON_TERRACOTTA = registerBlock("polished_lemon_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_CONCRETE = registerBlock("lemon_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LEMON_CONCRETE_STAIRS = registerBlock("lemon_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.LEMON_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LEMON_CONCRETE_POWDER = registerBlock("lemon_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_LEMON_CONCRETE = registerBlock("polished_lemon_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LEMON_CONCRETE_BRICKS = registerBlock("lemon_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LEMON_CONCRETE_TILES = registerBlock("lemon_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LEMON_STAINED_GLASS = registerBlock("lemon_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));




















    public static final RegistryObject<Block> POLISHED_FOREST_TERRACOTTA = registerBlock("polished_forest_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));







    public static final RegistryObject<Block> POLISHED_FOREST_CONCRETE = registerBlock("polished_forest_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> FOREST_CONCRETE_BRICKS = registerBlock("forest_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> FOREST_CONCRETE_TILES = registerBlock("forest_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));




    public static final RegistryObject<Block> TEAL_WOOL = registerBlock("teal_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TEAL_WOOL_STAIRS = registerBlock("teal_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.TEAL_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TEAL_WOOL_SLAB = registerBlock("teal_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TEAL_CARPET = registerBlock("teal_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA = registerBlock("teal_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_STAIRS = registerBlock("teal_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.TEAL_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_SLAB = registerBlock("teal_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICKS = registerBlock("teal_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICK_STAIRS = registerBlock("teal_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TEAL_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICK_SLAB = registerBlock("teal_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_TEAL_TERRACOTTA = registerBlock("polished_teal_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_CONCRETE = registerBlock("teal_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TEAL_CONCRETE_STAIRS = registerBlock("teal_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.TEAL_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TEAL_CONCRETE_POWDER = registerBlock("teal_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_TEAL_CONCRETE = registerBlock("polished_teal_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TEAL_CONCRETE_BRICKS = registerBlock("teal_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TEAL_CONCRETE_TILES = registerBlock("teal_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TEAL_STAINED_GLASS = registerBlock("teal_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));


    public static final RegistryObject<Block> CERULEAN_WOOL = registerBlock("cerulean_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CERULEAN_WOOL_STAIRS = registerBlock("cerulean_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.CERULEAN_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CERULEAN_WOOL_SLAB = registerBlock("cerulean_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CERULEAN_CARPET = registerBlock("cerulean_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA = registerBlock("cerulean_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_STAIRS = registerBlock("cerulean_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.CERULEAN_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_SLAB = registerBlock("cerulean_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_BRICKS = registerBlock("cerulean_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cerulean_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CERULEAN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_BRICK_SLAB = registerBlock("cerulean_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_CERULEAN_TERRACOTTA = registerBlock("polished_cerulean_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_CONCRETE = registerBlock("cerulean_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CERULEAN_CONCRETE_STAIRS = registerBlock("cerulean_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.CERULEAN_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CERULEAN_CONCRETE_POWDER = registerBlock("cerulean_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_CERULEAN_CONCRETE = registerBlock("polished_cerulean_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CERULEAN_CONCRETE_BRICKS = registerBlock("cerulean_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CERULEAN_CONCRETE_TILES = registerBlock("cerulean_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CERULEAN_STAINED_GLASS = registerBlock("cerulean_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));


















    public static final RegistryObject<Block> POLISHED_AZURE_TERRACOTTA = registerBlock("polished_azure_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));







    public static final RegistryObject<Block> POLISHED_AZURE_CONCRETE = registerBlock("polished_azure_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> AZURE_CONCRETE_BRICKS = registerBlock("azure_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> AZURE_CONCRETE_TILES = registerBlock("azure_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));




    public static final RegistryObject<Block> INDIGO_WOOL = registerBlock("indigo_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> INDIGO_WOOL_STAIRS = registerBlock("indigo_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.INDIGO_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> INDIGO_WOOL_SLAB = registerBlock("indigo_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> INDIGO_CARPET = registerBlock("indigo_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA = registerBlock("indigo_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA_STAIRS = registerBlock("indigo_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.INDIGO_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA_SLAB = registerBlock("indigo_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICKS = registerBlock("indigo_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICK_STAIRS = registerBlock("indigo_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.INDIGO_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block>  INDIGO_TERRACOTTA_BRICK_SLAB = registerBlock("indigo_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_INDIGO_TERRACOTTA = registerBlock("polished_indigo_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_GLAZED_TERRACOTTA = registerBlock("indigo_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_CONCRETE = registerBlock("indigo_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> INDIGO_CONCRETE_STAIRS = registerBlock("indigo_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.INDIGO_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> INDIGO_CONCRETE_POWDER = registerBlock("indigo_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_INDIGO_CONCRETE = registerBlock("polished_indigo_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> INDIGO_CONCRETE_BRICKS = registerBlock("indigo_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> INDIGO_CONCRETE_TILES = registerBlock("indigo_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> INDIGO_STAINED_GLASS = registerBlock("indigo_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));


    public static final RegistryObject<Block> VIOLET_WOOL = registerBlock("violet_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VIOLET_WOOL_STAIRS = registerBlock("violet_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.VIOLET_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VIOLET_WOOL_SLAB = registerBlock("violet_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VIOLET_CARPET = registerBlock("violet_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA = registerBlock("violet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_SLAB = registerBlock("violet_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_STAIRS = registerBlock("violet_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.VIOLET_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_BRICKS = registerBlock("violet_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_BRICK_STAIRS = registerBlock("violet_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.VIOLET_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_BRICK_SLAB = registerBlock("violet_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_VIOLET_TERRACOTTA = registerBlock("polished_violet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_CONCRETE = registerBlock("violet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VIOLET_CONCRETE_STAIRS = registerBlock("violet_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.VIOLET_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VIOLET_CONCRETE_POWDER = registerBlock("violet_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_VIOLET_CONCRETE = registerBlock("polished_violet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VIOLET_CONCRETE_BRICKS = registerBlock("violet_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VIOLET_CONCRETE_TILES = registerBlock("violet_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VIOLET_STAINED_GLASS = registerBlock("violet_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));


    public static final RegistryObject<Block> VELVET_WOOL = registerBlock("velvet_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VELVET_WOOL_STAIRS = registerBlock("velvet_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.VELVET_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VELVET_WOOL_SLAB = registerBlock("velvet_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VELVET_CARPET = registerBlock("velvet_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA = registerBlock("velvet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_STAIRS = registerBlock("velvet_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.VELVET_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_SLAB = registerBlock("velvet_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_BRICKS = registerBlock("velvet_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_BRICK_STAIRS = registerBlock("velvet_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.VELVET_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_BRICK_SLAB = registerBlock("velvet_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_VELVET_TERRACOTTA = registerBlock("polished_velvet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_CONCRETE = registerBlock("velvet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VELVET_CONCRETE_STAIRS = registerBlock("velvet_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.VELVET_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VELVET_CONCRETE_POWDER = registerBlock("velvet_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_VELVET_CONCRETE = registerBlock("polished_velvet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VELVET_CONCRETE_BRICKS = registerBlock("velvet_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VELVET_CONCRETE_TILES = registerBlock("velvet_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VELVET_STAINED_GLASS = registerBlock("velvet_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));


    public static final RegistryObject<Block> TAN_WOOL = registerBlock("tan_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TAN_WOOL_STAIRS = registerBlock("tan_wool_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_WOOL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TAN_WOOL_SLAB = registerBlock("tan_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TAN_CARPET = registerBlock("tan_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TAN_TERRACOTTA = registerBlock("tan_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_STAIRS = registerBlock("tan_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_SLAB = registerBlock("tan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_BRICKS = registerBlock("tan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_BRICK_STAIRS = registerBlock("tan_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_BRICK_SLAB = registerBlock("tan_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_TAN_TERRACOTTA = registerBlock("polished_tan_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_CONCRETE = registerBlock("tan_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TAN_CONCRETE_STAIRS = registerBlock("tan_concrete_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TAN_CONCRETE_POWDER = registerBlock("tan_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> POLISHED_TAN_CONCRETE = registerBlock("polished_tan_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TAN_CONCRETE_BRICKS = registerBlock("tan_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TAN_CONCRETE_TILES = registerBlock("tan_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TAN_STAINED_GLASS = registerBlock("tan_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));


















    public static final RegistryObject<Block> POLISHED_CREAM_TERRACOTTA = registerBlock("polished_cream_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));







    public static final RegistryObject<Block> POLISHED_CREAM_CONCRETE = registerBlock("polished_cream_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CREAM_CONCRETE_BRICKS = registerBlock("cream_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CREAM_CONCRETE_TILES = registerBlock("cream_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    //</editor-fold>

    //<editor-fold desc="VANILLA COLORS">
    public static final RegistryObject<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_STAIRS = registerBlock("terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_TERRACOTTA = registerBlock("polished_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));


    public static final RegistryObject<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            () -> new StairBlock(Blocks.RED_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_RED_TERRACOTTA = registerBlock("polished_red_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(Blocks.RED_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_RED_CONCRETE = registerBlock("polished_red_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            () -> new StairBlock(Blocks.ORANGE_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_ORANGE_TERRACOTTA = registerBlock("polished_orange_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(Blocks.ORANGE_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_ORANGE_CONCRETE = registerBlock("polished_orange_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            () -> new StairBlock(Blocks.YELLOW_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            () -> new StairBlock(Blocks.YELLOW_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_YELLOW_TERRACOTTA = registerBlock("polished_yellow_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(Blocks.YELLOW_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_YELLOW_CONCRETE = registerBlock("polished_yellow_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            () -> new StairBlock(Blocks.LIME_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            () -> new StairBlock(Blocks.LIME_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_LIME_TERRACOTTA = registerBlock("polished_lime_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(Blocks.LIME_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_LIME_CONCRETE = registerBlock("polished_lime_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            () -> new StairBlock(Blocks.GREEN_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            () -> new StairBlock(Blocks.GREEN_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_GREEN_TERRACOTTA = registerBlock("polished_green_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(Blocks.GREEN_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_GREEN_CONCRETE = registerBlock("polished_green_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));










    public static final RegistryObject<Block> POLISHED_CYAN_TERRACOTTA = registerBlock("polished_cyan_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));



    public static final RegistryObject<Block> POLISHED_CYAN_CONCRETE = registerBlock("polished_cyan_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_LIGHT_BLUE_TERRACOTTA = registerBlock("polished_light_blue_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_LIGHT_BLUE_CONCRETE = registerBlock("polished_light_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));














    public static final RegistryObject<Block> POLISHED_BLUE_TERRACOTTA = registerBlock("polished_blue_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));



    public static final RegistryObject<Block> POLISHED_BLUE_CONCRETE = registerBlock("polished_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            () -> new StairBlock(Blocks.PURPLE_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            () -> new StairBlock(Blocks.PURPLE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_PURPLE_TERRACOTTA = registerBlock("polished_purple_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(Blocks.PURPLE_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_PURPLE_CONCRETE = registerBlock("polished_purple_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            () -> new StairBlock(Blocks.MAGENTA_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_MAGENTA_TERRACOTTA = registerBlock("polished_magenta_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(Blocks.MAGENTA_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_MAGENTA_CONCRETE = registerBlock("polished_magenta_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            () -> new StairBlock(Blocks.PINK_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            () -> new StairBlock(Blocks.PINK_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_PINK_TERRACOTTA = registerBlock("polished_pink_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(Blocks.PINK_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_PINK_CONCRETE = registerBlock("polished_pink_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_WHITE_TERRACOTTA = registerBlock("polished_white_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_WHITE_CONCRETE = registerBlock("polished_white_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> WHITE_CONCRETE_BRICKS = registerBlock("white_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> WHITE_CONCRETE_TILES = registerBlock("white_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_LIGHT_GRAY_TERRACOTTA = registerBlock("polished_light_gray_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_LIGHT_GRAY_CONCRETE = registerBlock("polished_light_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            () -> new StairBlock(Blocks.GRAY_WOOL::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            () -> new StairBlock(Blocks.GRAY_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_GRAY_TERRACOTTA = registerBlock("polished_gray_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(Blocks.GRAY_CONCRETE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> POLISHED_GRAY_CONCRETE = registerBlock("polished_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
















    public static final RegistryObject<Block> POLISHED_BLACK_TERRACOTTA = registerBlock("polished_black_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));



    public static final RegistryObject<Block> POLISHED_BLACK_CONCRETE = registerBlock("polished_black_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));














    public static final RegistryObject<Block> POLISHED_BROWN_TERRACOTTA = registerBlock("polished_brown_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));



    public static final RegistryObject<Block> POLISHED_BROWN_CONCRETE = registerBlock("polished_brown_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
}
