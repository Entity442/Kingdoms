package net.Entity.kingdom.item;

import net.Entity.kingdom.Kingdoms;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

    public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, Kingdoms.MOD_ID);
        public static final RegistryObject<Item> TOWN_HALL = ITEMS.register("town_hall",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> KITCHEN = ITEMS.register("kitchen",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> APIARY = ITEMS.register("apiary",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



            public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
            }
    }

