package net.Entity.kingdom.Init;

import net.Entity.kingdom.Kingdoms;
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

    public static  final RegistryObject<EntityType<?>> CUSTOMVILLAGER =
            ENTITIES.register("customvillager",
                    () -> EntityType.Builder.of(customvillager:: new, MobCategory.CREATURE).sized(0.5f, 1f).build
                            (new ResourceLocation(Kingdoms.MOD_ID,"customvillager").toString()));

}
