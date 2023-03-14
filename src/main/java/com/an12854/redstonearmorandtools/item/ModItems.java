package com.an12854.redstonearmorandtools.item;

import com.an12854.redstonearmorandtools.RedstoneArmorandTools;
import com.an12854.redstonearmorandtools.util.ModArmorMaterial;
import com.an12854.redstonearmorandtools.util.ModTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RedstoneArmorandTools.MODID);

    // in the line (ModTiers.REDSTONE , x , y) x refers to the damage modifier and y refers to the attack speed modifier) -An12854
    // before you modify this lines run the client and view the damage and attack speed and adjust accordingly or you will suffer -An12854
    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(ModTiers.REDSTONE, 1, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(ModTiers.REDSTONE, -0.5f, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(ModTiers.REDSTONE, -1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(ModTiers.REDSTONE, 4, -3.1f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(ModTiers.REDSTONE, -4, -1f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> REDSTONE_HELMET = ITEMS.register("redstone_armor_helmet",
            () -> new ArmorItem(ModArmorMaterial.REDSTONE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_armor_chestplate",
            () -> new ArmorItem(ModArmorMaterial.REDSTONE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_armor_leggings",
            () -> new ArmorItem(ModArmorMaterial.REDSTONE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> REDSTONE_BOOTS = ITEMS.register("redstone_armor_boots",
            () -> new ArmorItem(ModArmorMaterial.REDSTONE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
