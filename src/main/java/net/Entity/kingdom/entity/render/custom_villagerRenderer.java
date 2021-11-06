package net.Entity.kingdom.entity.render;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.custom.customVillager;
import net.Entity.kingdom.entity.model.custom_VillagerModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class custom_villagerRenderer extends MobRenderer<customVillager, custom_VillagerModel<customVillager>>
{

    protected static final ResourceLocation TEXTURE =
                new ResourceLocation(Kingdoms.MOD_ID, "textures/entity/custom_villager.png");

    public custom_villagerRenderer(EntityRendererProvider.Context context) {
        super(context, new custom_VillagerModel<>(context.bakeLayer(custom_VillagerModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(customVillager pEntity) {
        return TEXTURE;
    }
}

