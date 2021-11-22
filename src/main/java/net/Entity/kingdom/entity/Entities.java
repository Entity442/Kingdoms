package net.Entity.kingdom.entity;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.custom.BasicVillager;
import net.Entity.kingdom.entity.custom.SeatEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Entities {
        public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
                        Kingdoms.MOD_ID);


    public static final RegistryObject<EntityType<BasicVillager>> BASIC_VILLAGER = ENTITIES.register("basic_villager",
            () -> EntityType.Builder.of(BasicVillager::new, MobCategory.CREATURE).sized(0.8f, 2f)
                    .build(new ResourceLocation(Kingdoms.MOD_ID, "basic_villager").toString()));

    public static final RegistryObject<EntityType<SeatEntity>> SEAT = ENTITIES.register("seat",
            () -> EntityType.Builder.<SeatEntity>of(SeatEntity::new, MobCategory.MISC).sized(1f, 1f)
                    .build(new ResourceLocation(Kingdoms.MOD_ID, "seat").toString()));


    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
        }
}
