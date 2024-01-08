package com.person98.cherrywood.block;

import com.person98.cherrywood.CherryWood;
import net.minecraft.block.WoodType;
import net.minecraft.util.ResourceLocation;

public class ModWoodTypes {
    public static final WoodType CHERRY =
            WoodType.create(new ResourceLocation(CherryWood.MOD_ID, "cherry").toString());
}