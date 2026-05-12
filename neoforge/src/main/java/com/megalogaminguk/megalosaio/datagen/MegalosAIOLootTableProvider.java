package com.megalogaminguk.megalosaio.datagen;

import com.megalogaminguk.megalosaio.init.ModBlocks;
import com.megalogaminguk.megalosaio.init.ModItems;
import com.megalogaminguk.megalosaio.services.NeoForgeRegistryHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MegalosAIOLootTableProvider extends LootTableProvider {
    public MegalosAIOLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(
                output,
                Set.of(),
                List.of(
                        new SubProviderEntry(MegalosAIOModBlockLootSubProvider::new, LootContextParamSets.BLOCK)
                ),
                registries
        );
    }

    private static final class MegalosAIOModBlockLootSubProvider extends BlockLootSubProvider{

        MegalosAIOModBlockLootSubProvider(HolderLookup.Provider registries) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected void generate() {
            //Blocks - Ore
            add(ModBlocks.ALUMINIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_ALUMINIUM.get()));
            add(ModBlocks.ANTIMONY_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_ANTIMONY.get()));
            add(ModBlocks.ARSENIC_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_ARSENIC.get()));
            add(ModBlocks.BARIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_BARIUM.get()));
            add(ModBlocks.BERYLLIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_BERYLLIUM.get()));
            add(ModBlocks.BISMUTH_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_BISMUTH.get()));
            add(ModBlocks.CADMIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_CADMIUM.get()));
            add(ModBlocks.CAESIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_CAESIUM.get()));
            add(ModBlocks.CALCIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_CALCIUM.get()));
            add(ModBlocks.CHROMIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_CHROMIUM.get()));
            add(ModBlocks.CINNABAR_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_CINNABAR.get()));
            add(ModBlocks.COBALT_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_COBALT.get()));
            add(ModBlocks.GALLIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_GALLIUM.get()));
            add(ModBlocks.GERMANIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_GERMANIUM.get()));
            add(ModBlocks.HAFNIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_HAFNIUM.get()));
            add(ModBlocks.INDIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_INDIUM.get()));
            add(ModBlocks.IRIDIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_IRIDIUM.get()));
            add(ModBlocks.LEAD_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_LEAD.get()));
            add(ModBlocks.LITHIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_LITHIUM.get()));
            add(ModBlocks.MAGNESIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_MAGNESIUM.get()));
            add(ModBlocks.MANGANESE_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_MANGANESE.get()));
            add(ModBlocks.MOLYBDENUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_MOLYBDENUM.get()));
            add(ModBlocks.NICKEL_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_NICKEL.get()));
            add(ModBlocks.NIOBIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_NIOBIUM.get()));
            add(ModBlocks.OSMIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_OSMIUM.get()));
            add(ModBlocks.PALLADIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_PALLADIUM.get()));
            add(ModBlocks.PHOSPHORUS_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_PHOSPHORUS.get()));
            add(ModBlocks.PLATINUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_PLATINUM.get()));
            add(ModBlocks.POTASSIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_POTASSIUM.get()));
            add(ModBlocks.RHENIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_RHENIUM.get()));
            add(ModBlocks.RHODIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_RHODIUM.get()));
            add(ModBlocks.RUBIDIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_RUBIDIUM.get()));
            add(ModBlocks.RUTHENIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_RUTHENIUM.get()));
            add(ModBlocks.SCANDIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_SCANDIUM.get()));
            add(ModBlocks.SELENIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_SELENIUM.get()));
            add(ModBlocks.SILICON_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_SILICON.get()));
            add(ModBlocks.SILVER_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_SILVER.get()));
            add(ModBlocks.SODIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_SODIUM.get()));
            add(ModBlocks.STRONTIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_STRONTIUM.get()));
            add(ModBlocks.TANTALUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_TANTALUM.get()));
            add(ModBlocks.TECHNETIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_TECHNETIUM.get()));
            add(ModBlocks.TELLURIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_TELLURIUM.get()));
            add(ModBlocks.THALLIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_THALLIUM.get()));
            add(ModBlocks.TIN_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_TIN.get()));
            add(ModBlocks.TITANIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_TITANIUM.get()));
            add(ModBlocks.TUNGSTEN_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_TUNGSTEN.get()));
            add(ModBlocks.VANADIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_VANADIUM.get()));
            add(ModBlocks.YTTRIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_YTTRIUM.get()));
            add(ModBlocks.ZINC_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_ZINC.get()));
            add(ModBlocks.ZIRCONIUM_ORE.block().get(), block -> createOreDrop(block, ModItems.RAW_ZIRCONIUM.get()));

            //Blocks - Block
            dropSelf(ModBlocks.ALUMINIUM_BLOCK.block().get());
            dropSelf(ModBlocks.ANTIMONY_BLOCK.block().get());
            dropSelf(ModBlocks.ARSENIC_BLOCK.block().get());
            dropSelf(ModBlocks.BARIUM_BLOCK.block().get());
            dropSelf(ModBlocks.BERYLLIUM_BLOCK.block().get());
            dropSelf(ModBlocks.BISMUTH_BLOCK.block().get());
            dropSelf(ModBlocks.CADMIUM_BLOCK.block().get());
            dropSelf(ModBlocks.CALCIUM_BLOCK.block().get());
            dropSelf(ModBlocks.CAESIUM_BLOCK.block().get());
            dropSelf(ModBlocks.CHROMIUM_BLOCK.block().get());
            dropSelf(ModBlocks.CINNABAR_BLOCK.block().get());
            dropSelf(ModBlocks.COBALT_BLOCK.block().get());
            dropSelf(ModBlocks.GERMANIUM_BLOCK.block().get());
            dropSelf(ModBlocks.GALLIUM_BLOCK.block().get());
            dropSelf(ModBlocks.HAFNIUM_BLOCK.block().get());
            dropSelf(ModBlocks.INDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.IRIDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.LEAD_BLOCK.block().get());
            dropSelf(ModBlocks.LITHIUM_BLOCK.block().get());
            dropSelf(ModBlocks.MAGNESIUM_BLOCK.block().get());
            dropSelf(ModBlocks.MANGANESE_BLOCK.block().get());
            dropSelf(ModBlocks.MOLYBDENUM_BLOCK.block().get());
            dropSelf(ModBlocks.NICKEL_BLOCK.block().get());
            dropSelf(ModBlocks.NIOBIUM_BLOCK.block().get());
            dropSelf(ModBlocks.OSMIUM_BLOCK.block().get());
            dropSelf(ModBlocks.PALLADIUM_BLOCK.block().get());
            dropSelf(ModBlocks.PHOSPHORUS_BLOCK.block().get());
            dropSelf(ModBlocks.PLATINUM_BLOCK.block().get());
            dropSelf(ModBlocks.POTASSIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RHENIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RHODIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RUBIDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RUTHENIUM_BLOCK.block().get());
            dropSelf(ModBlocks.SCANDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.SELENIUM_BLOCK.block().get());
            dropSelf(ModBlocks.SILICON_BLOCK.block().get());
            dropSelf(ModBlocks.SILVER_BLOCK.block().get());
            dropSelf(ModBlocks.SODIUM_BLOCK.block().get());
            dropSelf(ModBlocks.STRONTIUM_BLOCK.block().get());
            dropSelf(ModBlocks.TANTALUM_BLOCK.block().get());
            dropSelf(ModBlocks.TECHNETIUM_BLOCK.block().get());
            dropSelf(ModBlocks.TELLURIUM_BLOCK.block().get());
            dropSelf(ModBlocks.THALLIUM_BLOCK.block().get());
            dropSelf(ModBlocks.TIN_BLOCK.block().get());
            dropSelf(ModBlocks.TITANIUM_BLOCK.block().get());
            dropSelf(ModBlocks.TUNGSTEN_BLOCK.block().get());
            dropSelf(ModBlocks.VANADIUM_BLOCK.block().get());
            dropSelf(ModBlocks.YTTRIUM_BLOCK.block().get());
            dropSelf(ModBlocks.ZINC_BLOCK.block().get());
            dropSelf(ModBlocks.ZIRCONIUM_BLOCK.block().get());

            //Blocks - Raw Block
            dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_ANTIMONY_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_ARSENIC_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_BARIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_BERYLLIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_BISMUTH_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_CADMIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_CALCIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_CAESIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_CHROMIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_CINNABAR_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_COBALT_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_GERMANIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_GALLIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_HAFNIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_INDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_IRIDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_LEAD_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_LITHIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_MAGNESIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_MANGANESE_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_MOLYBDENUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_NICKEL_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_NIOBIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_PALLADIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_PHOSPHORUS_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_POTASSIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_RHENIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_RHODIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_RUBIDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_RUTHENIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_SCANDIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_SELENIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_SILICON_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_SILVER_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_SODIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_STRONTIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_TANTALUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_TECHNETIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_TELLURIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_THALLIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_TIN_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_TITANIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_TUNGSTEN_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_VANADIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_YTTRIUM_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_ZINC_BLOCK.block().get());
            dropSelf(ModBlocks.RAW_ZIRCONIUM_BLOCK.block().get());
        }
        @Override
        protected @Nonnull Iterable<Block> getKnownBlocks(){
            return NeoForgeRegistryHelper.BLOCKS.getEntries()
                    .stream()
                    .map(entry -> (Block) entry.value())
                    .toList();
        }
    }
}
