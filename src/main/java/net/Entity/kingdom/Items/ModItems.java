package net.Entity.kingdom.Items;

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

        public  static final  RegistryObject<Item> STORAGE_ROOM = ITEMS.register("storage_room",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> HOUSE_SMALL = ITEMS.register("house_small",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> HOUSE_MEDIUM = ITEMS.register("house_medium",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> HOUSE_LARGE = ITEMS.register("house_large",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> APIARY = ITEMS.register("apiary",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> COW_PEN = ITEMS.register("cow_pen",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> PIG_PEN = ITEMS.register("pig_pen",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> SHEEP_PEN = ITEMS.register("sheep_pen",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> RABBIT_PEN = ITEMS.register("rabbit_pen",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> CHICKEN_PEN = ITEMS.register("chicken_pen",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> BLACKSMITH = ITEMS.register("blacksmith",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> FLETCHER = ITEMS.register("fletcher",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> LIBRARY = ITEMS.register("library",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> TAVERN = ITEMS.register("tavern",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> MERCHANT_STALL = ITEMS.register("merchant_stall",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> MINESHAFT = ITEMS.register("mineshaft",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        public  static final  RegistryObject<Item> GUARD_POST = ITEMS.register("guard_post",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


            public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
            }
    }

