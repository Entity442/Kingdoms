package net.Entity.kingdom.Init;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.common.entity.custom_villager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class EntityInit {

    private  EntityInit() {}
    public static  final DeferredRegister<EntityType<?>> ENTITIES =
        DeferredRegister.create(ForgeRegistries.ENTITIES, Kingdoms.MOD_ID);

    public static  final RegistryObject<EntityType<?>> CUSTOM_VILLAGER =
            ENTITIES.register("custom_villager",
                    () -> EntityType.Builder.of(custom_villager:: new, MobCategory.CREATURE).sized(0.5f, 1f).build
                            (new ResourceLocation(Kingdoms.MOD_ID,"custom_villager").toString()));

}
