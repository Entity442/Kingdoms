package net.Entity.kingdom.entity.event;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.EntityTypes;
import net.Entity.kingdom.entity.model.custom_VillagerModel;
import net.Entity.kingdom.entity.render.custom_villagerRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Kingdoms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ModEvents {
    private void ClientModEvents () {}


    @SubscribeEvent
    public static void RegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(custom_VillagerModel.LAYER_LOCATION, custom_VillagerModel:: createBodyLayer);
    }
    @SubscribeEvent
    public  static  void  RegisterRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityTypes.CUSTOM_VILLAGER.get(), custom_villagerRenderer::new);
    }

    }


