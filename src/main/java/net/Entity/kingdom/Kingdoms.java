package net.Entity.kingdom;

import net.Entity.kingdom.Kblock.KModBlocks;
import net.Entity.kingdom.Items.ModItems;
import net.Entity.kingdom.entity.Entities;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Kingdoms.MOD_ID)
public class Kingdoms
{
    public static final String MOD_ID = "kingdom";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String KINGDOMS = "kingdoms";


    public Kingdoms() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        ModItems.register(eventBus);
        KModBlocks.register(eventBus);
        Entities.register(eventBus);
        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {


            ItemBlockRenderTypes.setRenderLayer(KModBlocks.OAK_CHAIR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(KModBlocks.ACACIA_CHAIR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(KModBlocks.BIRCH_CHAIR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(KModBlocks.CRIMSON_CHAIR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(KModBlocks.DARK_OAK_CHAIR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(KModBlocks.JUNGLE_CHAIR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(KModBlocks.SPRUCE_CHAIR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(KModBlocks.WARPED_CHAIR.get(), RenderType.cutout());
        });

    }

}
