package net.Entity.kingdom.ModEvents;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.Entities;
import net.Entity.kingdom.entity.custom.BasicVillager;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Kingdoms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {



    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(Entities.BASIC_VILLAGER.get(), BasicVillager.createAttributes().build());
    }

}
