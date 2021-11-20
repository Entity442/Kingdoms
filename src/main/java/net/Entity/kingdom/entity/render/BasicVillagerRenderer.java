package net.Entity.kingdom.entity.render;

import net.Entity.kingdom.entity.custom.BasicVillager;
import net.Entity.kingdom.entity.model.custom_VillagerModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BasicVillagerRenderer extends MobRenderer<BasicVillager, custom_VillagerModel<BasicVillager>> {
    public BasicVillagerRenderer(EntityRendererProvider.Context context) {
        super(context, new custom_VillagerModel(context.bakeLayer(custom_VillagerModel.LAYER_LOCATION)), 0.5f);
    }

    public BasicVillagerRenderer(EntityRendererProvider.Context p_174304_, custom_VillagerModel<BasicVillager> p_174305_, float p_174306_) {
        super(p_174304_, p_174305_, p_174306_);
    }

    @Override
    public ResourceLocation getTextureLocation(BasicVillager entity) {
        return new ResourceLocation("kingdom:textures/entity/custom_villager.png");
    }
}
