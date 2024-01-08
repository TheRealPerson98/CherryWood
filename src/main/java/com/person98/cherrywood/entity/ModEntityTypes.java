package com.person98.cherrywood.entity;

import com.person98.cherrywood.CherryWood;
import com.person98.cherrywood.entity.custom.ModBoatEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, CherryWood.MOD_ID);


    public static final RegistryObject<EntityType<ModBoatEntity>> CHERRY_BOAT =
            ENTITY_TYPES.register("cherry_boat",
                    () -> EntityType.Builder.<ModBoatEntity>create(ModBoatEntity::new,
                                    EntityClassification.MISC).size(0.5f, 0.5f)
                            .build(new ResourceLocation(CherryWood.MOD_ID, "cherry_wood").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}