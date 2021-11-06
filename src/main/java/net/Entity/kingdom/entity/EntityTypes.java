package net.Entity.kingdom.entity;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.custom.customVillager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Kingdoms.MOD_ID);

    public static final RegistryObject<EntityType<customVillager>> CUSTOM_VILLAGER =
            ENTITY_TYPES.register("customVillager",
                    () -> EntityType.Builder.of(customVillager::new,
                                    MobCategory.CREATURE).sized(1f, 3f)
                            .build(new ResourceLocation(Kingdoms.MOD_ID, "customVillager").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
