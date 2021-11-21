package net.Entity.kingdom.entity.event;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.Entities;
import net.Entity.kingdom.entity.model.custom_VillagerModel;
import net.Entity.kingdom.entity.render.BasicVillagerRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Kingdoms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {


    private ClientModEvents() {
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(custom_VillagerModel.LAYER_LOCATION, custom_VillagerModel::createBodyLayer);
    }


    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(Entities.BASIC_VILLAGER.get(), BasicVillagerRenderer::new);
    }
}
