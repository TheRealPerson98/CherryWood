package com.person98.cherrywood.item;

import com.person98.cherrywood.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CHERRY_GROUP = new ItemGroup("cherryWoodTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.CHERRY_LOG.get());
        }
    };

}