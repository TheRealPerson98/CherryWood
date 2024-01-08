package com.person98.cherrywood.item;


import com.person98.cherrywood.CherryWood;
import com.person98.cherrywood.block.ModBlocks;
import com.person98.cherrywood.item.custom.ModBoatItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CherryWood.MOD_ID);

    public static final RegistryObject<Item> CHERRY_BOAT = ITEMS.register("cherry_boat",
            () -> new ModBoatItem(new Item.Properties().group(ModItemGroup.CHERRY_GROUP), "cherry"));

    public static final RegistryObject<Item> CHERRY_SIGN = ITEMS.register("cherry_sign",
            () -> new SignItem(new Item.Properties().maxStackSize(16).group(ModItemGroup.CHERRY_GROUP),
                    ModBlocks.CHERRY_SIGN.get(), ModBlocks.CHERRY_WALL_SIGN.get()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}