package com.person98.cherrywood.block.custom.trees;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import com.person98.cherrywood.world.ModConfiguredFeatures;



import javax.annotation.Nullable;
import java.util.Random;

public class CherryTree extends Tree {
    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
        return ModConfiguredFeatures.CHERRY;
    }
}