package com.megalogaminguk.megalosaio.datagen.bootstrap;

import com.megalogaminguk.megalosaio.init.ModBlocks;
import com.megalogaminguk.megalosaio.worldgen.MegalosAIOWorldGen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class MegalosAIOWorldGenBootstrapper {
    private MegalosAIOWorldGenBootstrapper(){

    }

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context){
        //Overworld
        context.register(MegalosAIOWorldGen.ALUMINIUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.ALUMINIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.CALCIUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.CALCIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.CINNABAR_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.CINNABAR_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.LEAD_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.LEAD_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.MAGNESIUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.MAGNESIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.NICKEL_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.NICKEL_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.OSMIUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.OSMIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.PLATINUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.PLATINUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.SILICON_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.SILICON_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.SILVER_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.SILVER_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.SODIUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.SODIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.TIN_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.TIN_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.TITANIUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.TITANIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.ZINC_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.ZINC_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.ZIRCONIUM_OVERWORLD_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.ZIRCONIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));

        //Deepslate
        context.register(MegalosAIOWorldGen.ANTIMONY_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.ANTIMONY_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.BISMUTH_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.BISMUTH_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.CADMIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.CADMIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.CHROMIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.CHROMIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.COBALT_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.COBALT_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.GALLIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.GALLIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.IRIDIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.IRIDIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.MANGANESE_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.MANGANESE_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.MOLYBDENUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.MOLYBDENUM_ORE.block().get().defaultBlockState())
                ),
                        6,
                        0.0F)));
        context.register(MegalosAIOWorldGen.PALLADIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.BISMUTH_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.POTASSIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.GALLIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.RUTHENIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.HAFNIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.THALLIUM_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.INDIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.TUNGSTEN_DEEPSLATE_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.IRIDIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));

        //Nether
        context.register(MegalosAIOWorldGen.ARSENIC_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.ARSENIC_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.BARIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.BARIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.BERYLLIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.BERYLLIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.CAESIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.CAESIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.GERMANIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.GERMANIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.HAFNIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.HAFNIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.INDIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.INDIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.NIOBIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.NIOBIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.PHOSPHORUS_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.PHOSPHORUS_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.RHENIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.RHENIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.RHODIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.ANTIMONY_ORE.block().get().defaultBlockState())
                ),
                        8,
                        0.0F)));
        context.register(MegalosAIOWorldGen.SELENIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.SELENIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.TANTALUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.TANTALUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.TECHNETIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.TECHNETIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.TELLURIUM_NETHER_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.TELLURIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));

        //End
        context.register(MegalosAIOWorldGen.LITHIUM_END_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.LITHIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.RUBIDIUM_END_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.RUBIDIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.SCANDIUM_END_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.SCANDIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.STRONTIUM_END_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.STRONTIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
        context.register(MegalosAIOWorldGen.VANADIUM_END_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.VANADIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));context.register(MegalosAIOWorldGen.YTTRIUM_END_ORE, new ConfiguredFeature<>(Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.YTTRIUM_ORE.block().get().defaultBlockState())
                ),
                        3,
                        0.0F)));
    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //Overworld
        context.register(MegalosAIOWorldGen.ALUMINIUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.ALUMINIUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.CALCIUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.CALCIUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.CINNABAR_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.CINNABAR_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.LEAD_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.LEAD_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.MAGNESIUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.MAGNESIUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.NICKEL_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.NICKEL_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.OSMIUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.OSMIUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.PLATINUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.PLATINUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.SILICON_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.SILICON_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.SILVER_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.SILVER_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.SODIUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.SODIUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.TIN_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.TIN_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.TITANIUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.TITANIUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.ZINC_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.ZINC_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.ZIRCONIUM_OVERWORLD_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.ZIRCONIUM_OVERWORLD_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));

        //Deepslate
        context.register(MegalosAIOWorldGen.ANTIMONY_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.ANTIMONY_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.BISMUTH_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.BISMUTH_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.CADMIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.CADMIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.CHROMIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.CHROMIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.COBALT_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.COBALT_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.GALLIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.GALLIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.IRIDIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.IRIDIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.MANGANESE_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.MANGANESE_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.MOLYBDENUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.MOLYBDENUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.PALLADIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.PALLADIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.POTASSIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.POTASSIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.RUTHENIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.RUTHENIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.THALLIUM_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.THALLIUM_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.TUNGSTEN_DEEPSLATE_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.TUNGSTEN_DEEPSLATE_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(18)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(100)),
                        BiomeFilter.biome()

                )
        ));

        //Nether
        context.register(MegalosAIOWorldGen.ARSENIC_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.ARSENIC_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.BARIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.BARIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.BERYLLIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.BERYLLIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.CAESIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.CAESIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.GERMANIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.GERMANIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.HAFNIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.HAFNIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.INDIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.INDIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.NIOBIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.NIOBIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.PHOSPHORUS_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.PHOSPHORUS_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.RHENIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.RHENIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.RHODIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.RHODIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.SELENIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.SELENIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.TANTALUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.TANTALUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.TECHNETIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.TECHNETIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.TELLURIUM_NETHER_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.TELLURIUM_NETHER_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(14)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));

        //End
        context.register(MegalosAIOWorldGen.LITHIUM_END_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.LITHIUM_END_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(9)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.RUBIDIUM_END_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.RUBIDIUM_END_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(9)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.SCANDIUM_END_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.SCANDIUM_END_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(9)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.STRONTIUM_END_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.STRONTIUM_END_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(9)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
        context.register(MegalosAIOWorldGen.VANADIUM_END_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.VANADIUM_END_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(9)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));context.register(MegalosAIOWorldGen.YTTRIUM_END_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(MegalosAIOWorldGen.YTTRIUM_END_ORE),
                List.of(
                        CountPlacement.of(ConstantInt.of(9)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()),
                        BiomeFilter.biome()

                )
        ));
    }

}
