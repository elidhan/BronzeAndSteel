package net.elidhanmc.bronzeandsteel.item;

import net.elidhanmc.bronzeandsteel.BronzeAndSteel;
import net.elidhanmc.bronzeandsteel.block.ModBlocks;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BronzeAndSteel.MODID);

    //Materials
    public static final DeferredItem<Item> CRUDE_IRON = ITEMS.registerSimpleItem("crude_iron");
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");

    public static final DeferredItem<Item> SILICON_MIXTURE = ITEMS.registerSimpleItem("silicon_mixture");
    public static final DeferredItem<Item> BRONZE_MESH = ITEMS.registerSimpleItem("bronze_mesh");
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.registerSimpleItem("bronze_ingot");

    //Block Items
    public static final DeferredItem<BlockItem> BRONZE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bronze_block", ModBlocks.BRONZE_BLOCK);
    public static final DeferredItem<BlockItem> STEEL_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("steel_block", ModBlocks.STEEL_BLOCK);

    // Gear
    public static final DeferredItem<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () ->
            new SwordItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE,
                            2,
                            -2.4f))));
    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () ->
            new PickaxeItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE,
                            1.0f,
                            -2.8f))));
    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () ->
            new AxeItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRONZE,
                            4.0f,
                            -3.0f))));
    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () ->
            new ShovelItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE,
                            1.5f,
                            -3.0f))));
    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () ->
            new HoeItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRONZE,
                            -3.0f,
                            0.0f))));

    public static final DeferredItem<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () ->
            new SwordItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STEEL,
                    3.0f,
                    -2.4f))));
    public static final DeferredItem<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () ->
            new PickaxeItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL,
                            1.0f,
                            -2.8f))));
    public static final DeferredItem<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () ->
            new AxeItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STEEL,
                            6.0f,
                            -3.0f))));
    public static final DeferredItem<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () ->
            new ShovelItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STEEL,
                            1.5f,
                            -3.0f))));
    public static final DeferredItem<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () ->
            new HoeItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STEEL,
                            -3.0f,
                            0.0f))));

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () ->
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () ->
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () ->
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () ->
            new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final DeferredItem<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", () ->
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(24))));
    public static final DeferredItem<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () ->
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))));
    public static final DeferredItem<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () ->
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(24))));
    public static final DeferredItem<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", () ->
            new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(24))));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
