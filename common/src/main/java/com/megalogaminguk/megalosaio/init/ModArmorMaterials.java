package com.megalogaminguk.megalosaio.init;

import com.megalogaminguk.megalosaio.Constants;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;

public class ModArmorMaterials {
    private ModArmorMaterials(){

    }
    public static final ResourceKey<EquipmentAsset> ALUMINIUM_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            Constants.id("aluminium"));
    public static final ResourceKey<EquipmentAsset> SILVER_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            Constants.id("silver"));
    public static final ResourceKey<EquipmentAsset> TECHNETIUM_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            Constants.id("technetium"));
    public static final ResourceKey<EquipmentAsset> TITANIUM_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            Constants.id("titanium"));

    public static final ArmorMaterial ALUMINIUM_ARMOR_MATERIAL = new ArmorMaterial(
            15,
            Util.make(new EnumMap<>(ArmorType.class),map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS,5);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
                map.put(ArmorType.BODY, 5);
            }),
            18,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            ModItemTags.ALUMINIUM_TOOL_MATERIALS,
            ALUMINIUM_ASSET
    );

    public static final ArmorMaterial SILVER_ARMOR_MATERIAL = new ArmorMaterial(
            15,
            Util.make(new EnumMap<>(ArmorType.class),map -> {
                map.put(ArmorType.BOOTS, 4);
                map.put(ArmorType.LEGGINGS,7);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 4);
                map.put(ArmorType.BODY, 7);
            }),
            18,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            ModItemTags.SILVER_TOOL_MATERIALS,
            SILVER_ASSET
    );

    public static final ArmorMaterial TECHNETIUM_ARMOR_MATERIAL = new ArmorMaterial(
            15,
            Util.make(new EnumMap<>(ArmorType.class),map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS,6);
                map.put(ArmorType.CHESTPLATE, 7);
                map.put(ArmorType.HELMET, 3);
                map.put(ArmorType.BODY, 7);
            }),
            18,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            ModItemTags.TECHNETIUM_TOOL_MATERIALS,
            TECHNETIUM_ASSET
    );

    public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = new ArmorMaterial(
            15,
            Util.make(new EnumMap<>(ArmorType.class),map -> {
                map.put(ArmorType.BOOTS, 5);
                map.put(ArmorType.LEGGINGS,8);
                map.put(ArmorType.CHESTPLATE, 9);
                map.put(ArmorType.HELMET, 5);
                map.put(ArmorType.BODY, 8);
            }),
            18,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            ModItemTags.TITANIUM_TOOL_MATERIALS,
            TITANIUM_ASSET
    );
}
