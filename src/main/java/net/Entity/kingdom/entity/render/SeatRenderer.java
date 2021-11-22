package net.Entity.kingdom.entity.render;

import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.custom.SeatEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;



public class SeatRenderer extends EntityRenderer<SeatEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Kingdoms.MOD_ID, "");

    public SeatRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SeatEntity entity) {
        return TEXTURE;
    }
}