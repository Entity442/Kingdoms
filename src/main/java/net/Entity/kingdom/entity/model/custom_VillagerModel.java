package net.Entity.kingdom.entity.model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.Entity.kingdom.Kingdoms;
import net.Entity.kingdom.entity.custom.BasicVillager;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class custom_VillagerModel<Type extends BasicVillager> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new
			ModelLayerLocation(new ResourceLocation(Kingdoms.MOD_ID,"custom_villagermodel"),"main");
	private final ModelPart VillagerHead;
	private final ModelPart villager_body;
	private final ModelPart villagerRightArm;
	private final ModelPart villagerLeftArm;
	private final ModelPart villagerRightHip;
	private final ModelPart villagerLeftHip;

	public custom_VillagerModel(ModelPart root) {
		this.VillagerHead = root.getChild("VillagerHead");
		this.villager_body = root.getChild("villager_body");
		this.villagerRightArm = root.getChild("villagerRightArm");
		this.villagerLeftArm = root.getChild("villagerLeftArm");
		this.villagerRightHip = root.getChild("villagerRightHip");
		this.villagerLeftHip = root.getChild("villagerLeftHip");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition VillagerHead = partdefinition.addOrReplaceChild("VillagerHead", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition nose = VillagerHead.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -4.0F));

		PartDefinition villager_body = partdefinition.addOrReplaceChild("villager_body", CubeListBuilder.create().texOffs(0, 18).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition villagerRightArm = partdefinition.addOrReplaceChild("villagerRightArm", CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition villagerRightForarm = villagerRightArm.addOrReplaceChild("villagerRightForarm", CubeListBuilder.create().texOffs(48, 10).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(-1.0F, 4.0F, 0.0F));

		PartDefinition villagerLeftArm = partdefinition.addOrReplaceChild("villagerLeftArm", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition villagerLeftforarm = villagerLeftArm.addOrReplaceChild("villagerLeftforarm", CubeListBuilder.create().texOffs(48, 10).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(1.0F, 4.0F, 0.0F));

		PartDefinition villagerRightHip = partdefinition.addOrReplaceChild("villagerRightHip", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition villagerrightFoot = villagerRightHip.addOrReplaceChild("villagerrightFoot", CubeListBuilder.create().texOffs(0, 54).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition villagerLeftHip = partdefinition.addOrReplaceChild("villagerLeftHip", CubeListBuilder.create().texOffs(32, 10).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition villagerLeftFoot = villagerLeftHip.addOrReplaceChild("villagerLeftFoot", CubeListBuilder.create().texOffs(15, 54).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		VillagerHead.render(poseStack, buffer, packedLight, packedOverlay);
		villager_body.render(poseStack, buffer, packedLight, packedOverlay);
		villagerRightArm.render(poseStack, buffer, packedLight, packedOverlay);
		villagerLeftArm.render(poseStack, buffer, packedLight, packedOverlay);
		villagerRightHip.render(poseStack, buffer, packedLight, packedOverlay);
		villagerLeftHip.render(poseStack, buffer, packedLight, packedOverlay);
	}
}