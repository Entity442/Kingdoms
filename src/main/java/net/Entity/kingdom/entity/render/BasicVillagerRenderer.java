package net.Entity.kingdom.entity.render;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.custom.BasicVillager;
import net.Entity.kingdom.entity.model.custom_VillagerModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BasicVillagerRenderer<Type extends BasicVillager> extends MobRenderer<Type,custom_VillagerModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Kingdoms.MOD_ID,
            "textures/entity/custom_villager.png");

    public BasicVillagerRenderer(EntityRendererProvider.Context context) {
        super(context, new custom_VillagerModel<>(context.bakeLayer(custom_VillagerModel.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }


}