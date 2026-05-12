package com.megalogaminguk.megalosaio.datagen;

import com.megalogaminguk.megalosaio.Constants;
import com.megalogaminguk.megalosaio.init.ModArmorMaterials;
import net.minecraft.client.data.models.EquipmentAssetProvider;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import javax.annotation.Nonnull;
import java.util.function.BiConsumer;

public class MegalosAIOEquipmentAssetProvider extends EquipmentAssetProvider {
    public MegalosAIOEquipmentAssetProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void registerModels(@Nonnull BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> output) {
        output.accept(
                ModArmorMaterials.ALUMINIUM_ASSET,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Constants.id("aluminium"))
                        .build()
        );
        output.accept(
                ModArmorMaterials.SILVER_ASSET,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Constants.id("silver"))
                        .build()
        );
        output.accept(
                ModArmorMaterials.TECHNETIUM_ASSET,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Constants.id("technetium"))
                        .build()
        );
        output.accept(
                ModArmorMaterials.TITANIUM_ASSET,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Constants.id("titanium"))
                        .build()
        );
    }
}
