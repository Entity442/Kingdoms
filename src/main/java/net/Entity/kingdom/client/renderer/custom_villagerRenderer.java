package net.Entity.kingdom.client.renderer;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.client.model.custom_villagerModel;
import net.Entity.kingdom.common.entity.custom_villager;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class custom_villagerRenderer<Type extends custom_villager>extends MobRenderer<Type, EntityModel<Type>> {

    private  static  ResourceLocation TEXTURE =new ResourceLocation(Kingdoms.MOD_ID,"textures/entity/custom_villager.png");

    public custom_villagerRenderer(EntityRendererProvider.Context context) {
        super(context, new custom_villagerModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type Entity) {
        return TEXTURE;
    }
}
