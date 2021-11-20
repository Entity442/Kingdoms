package net.Entity.kingdom.entity;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.custom.BasicVillager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Entities {
        public static DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.ENTITIES,
                        Kingdoms.MOD_ID);


    public static final RegistryObject<EntityType<BasicVillager>> BASIC_VILLAGER = REGISTER.register("basic_villager",
            () -> EntityType.Builder.of(BasicVillager::new, MobCategory.CREATURE).sized(0.8f, 2f)
                    .build(new ResourceLocation(Kingdoms.MOD_ID, "basic_villager").toString()));



    public static void register(IEventBus eventBus) {
            REGISTER.register(eventBus);
        }
}
