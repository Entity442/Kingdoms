package net.Entity.kingdom.event;
import net.Entity.kingdom.Init.EntityInit;
import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.common.entity.custom_villager;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Kingdoms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class CommonModEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put((EntityType<? extends LivingEntity>) EntityInit.CUSTOM_VILLAGER.get(),
                custom_villager.createLivingAttributes().build());
    }


}
