package com.person98.cherrywood.block;


import com.person98.cherrywood.CherryWood;
import com.person98.cherrywood.block.custom.ModStandingSignBlock;
import com.person98.cherrywood.block.custom.ModWallSignBlock;
import com.person98.cherrywood.block.custom.trees.CherryTree;
import com.person98.cherrywood.item.ModItemGroup;
import com.person98.cherrywood.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CherryWood.MOD_ID);


    public static final RegistryObject<Block> CHERRY_LOG = registerBlock("cherry_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> CHERRY_WOOD = registerBlock("cherry_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> CHERRY_PLANKS = registerBlock("cherry_planks",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.AXE).hardnessAndResistance(5f)));








    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f)
                    .tickRandomly().sound(SoundType.PLANT).notSolid()));

    public static final RegistryObject<Block> CHERRY_SAPLING = registerBlock("cherry_sapling",
            () -> new SaplingBlock(new CherryTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> CHERRY_STAIRS = registerBlock("cherry_stairs",
            () -> new StairsBlock(() -> CHERRY_PLANKS.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.WOOD).harvestLevel(3).harvestTool(ToolType.AXE).setRequiresTool()));

    public static final RegistryObject<Block> CHERRY_SLAB = registerBlock("cherry_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.AXE).hardnessAndResistance(6f)));

    public static final RegistryObject<Block> CHERRY_FENCE = registerBlock("cherry_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.AXE).hardnessAndResistance(2f)));

    public static final RegistryObject<Block> CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.AXE).hardnessAndResistance(2f)));

    public static final RegistryObject<Block> CHERRY_DOOR = registerBlock("cherry_door",
            () -> new DoorBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(1).setRequiresTool()
                    .harvestTool(ToolType.AXE).hardnessAndResistance(6f).notSolid()));

    public static final RegistryObject<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).setRequiresTool()
                    .harvestTool(ToolType.AXE).hardnessAndResistance(6f).notSolid()));

    public static final RegistryObject<Block> CHERRY_BUTTON = registerBlock("cherry_button",
            () -> new WoodButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.AXE).hardnessAndResistance(1f).doesNotBlockMovement()));

    public static final RegistryObject<Block> CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.AXE).hardnessAndResistance(6f)));


    public static final RegistryObject<Block> CHERRY_SIGN = BLOCKS.register("cherry_sign",
            () -> new ModStandingSignBlock(AbstractBlock.Properties.create(Material.WOOD), ModWoodTypes.CHERRY));

    public static final RegistryObject<Block> CHERRY_WALL_SIGN = BLOCKS.register("cherry_wall_sign",
            () -> new ModWallSignBlock(AbstractBlock.Properties.create(Material.WOOD), ModWoodTypes.CHERRY));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.CHERRY_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}