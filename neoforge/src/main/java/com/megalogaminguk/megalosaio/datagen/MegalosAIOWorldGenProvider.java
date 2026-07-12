package com.megalogaminguk.megalosaio.datagen;

import com.megalogaminguk.megalosaio.Constants;
import com.megalogaminguk.megalosaio.datagen.bootstrap.MegalosAIOWorldGenBootstrapper;
import com.megalogaminguk.megalosaio.worldgen.MegalosAIOWorldGen;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class MegalosAIOWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, MegalosAIOWorldGenBootstrapper::bootstrapConfiguredFeatures)
            .add(Registries.PLACED_FEATURE, MegalosAIOWorldGenBootstrapper::bootstrapPlacedFeatures)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, MegalosAIOWorldGenProvider::bootstrapBiomeModifiers);

    //Overworld
    private static final ResourceKey<BiomeModifier> ALUMINIUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("aluminium_ore");
    private static final ResourceKey<BiomeModifier> CALCIUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("calcium_ore");
    private static final ResourceKey<BiomeModifier> CINNABAR_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("cinnabar_ore");
    private static final ResourceKey<BiomeModifier> LEAD_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("lead_ore");
    private static final ResourceKey<BiomeModifier> MAGNESIUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("magnesium_ore");
    private static final ResourceKey<BiomeModifier> NICKEL_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("nickel_ore");
    private static final ResourceKey<BiomeModifier> OSMIUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("osmium_ore");
    private static final ResourceKey<BiomeModifier> PLATINUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("platinum_ore");
    private static final ResourceKey<BiomeModifier> SILICON_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("silicon_ore");
    private static final ResourceKey<BiomeModifier> SILVER_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("silver_ore");
    private static final ResourceKey<BiomeModifier> SODIUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("sodium_ore");
    private static final ResourceKey<BiomeModifier> TIN_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("tin_ore");
    private static final ResourceKey<BiomeModifier> TITANIUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("titanium_ore");
    private static final ResourceKey<BiomeModifier> ZINC_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("zinc_ore");
    private static final ResourceKey<BiomeModifier> ZIRCONIUM_OVERWORLD_ORE_MODIFIER = biomeModifierResourceKey("zirconium_ore");

    //Deepslate
    private static final ResourceKey<BiomeModifier> ANTIMONY_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("antimony_ore");
    private static final ResourceKey<BiomeModifier> BISMUTH_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("bismuth_ore");
    private static final ResourceKey<BiomeModifier> CADMIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("cadmium_ore");
    private static final ResourceKey<BiomeModifier> CHROMIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("chromium_ore");
    private static final ResourceKey<BiomeModifier> COBALT_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("cobalt_ore");
    private static final ResourceKey<BiomeModifier> GALLIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("gallium_ore");
    private static final ResourceKey<BiomeModifier> IRIDIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("iridium_ore");
    private static final ResourceKey<BiomeModifier> MANGANESE_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("manganese_ore");
    private static final ResourceKey<BiomeModifier> MOLYBDENUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("molybdenum_ore");
    private static final ResourceKey<BiomeModifier> PALLADIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("palladium_ore");
    private static final ResourceKey<BiomeModifier> POTASSIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("potassium_ore");
    private static final ResourceKey<BiomeModifier> RUTHENIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("ruthenium_ore");
    private static final ResourceKey<BiomeModifier> THALLIUM_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("thallium_ore");
    private static final ResourceKey<BiomeModifier> TUNGSTEN_DEEPSLATE_ORE_MODIFIER = biomeModifierResourceKey("tungsten_ore");

    //Nether
    private static final ResourceKey<BiomeModifier> ARSENIC_NETHER_ORE_MODIFIER = biomeModifierResourceKey("arsenic_ore");
    private static final ResourceKey<BiomeModifier> BARIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("barium_ore");
    private static final ResourceKey<BiomeModifier> BERYLLIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("beryllium_ore");
    private static final ResourceKey<BiomeModifier> CAESIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("caesium_ore");
    private static final ResourceKey<BiomeModifier> GERMANIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("germanium_ore");
    private static final ResourceKey<BiomeModifier> HAFNIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("hafnium_ore");
    private static final ResourceKey<BiomeModifier> INDIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("indium_ore");
    private static final ResourceKey<BiomeModifier> NIOBIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("niobium_ore");
    private static final ResourceKey<BiomeModifier> PHOSPHORUS_NETHER_ORE_MODIFIER = biomeModifierResourceKey("phosphorus_ore");
    private static final ResourceKey<BiomeModifier> RHENIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("rhenium_ore");
    private static final ResourceKey<BiomeModifier> RHODIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("rhodium_ore");
    private static final ResourceKey<BiomeModifier> SELENIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("selenium_ore");
    private static final ResourceKey<BiomeModifier> TANTALUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("tantalum_ore");
    private static final ResourceKey<BiomeModifier> TECHNETIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("technetium_ore");
    private static final ResourceKey<BiomeModifier> TELLURIUM_NETHER_ORE_MODIFIER = biomeModifierResourceKey("tellurium_ore");

    //End
    private static final ResourceKey<BiomeModifier> LITHIUM_END_ORE_MODIFIER = biomeModifierResourceKey("lithium_ore");
    private static final ResourceKey<BiomeModifier> RUBIDIUM_END_ORE_MODIFIER = biomeModifierResourceKey("rubidium_ore");
    private static final ResourceKey<BiomeModifier> SCANDIUM_END_ORE_MODIFIER = biomeModifierResourceKey("scandium_ore");
    private static final ResourceKey<BiomeModifier> STRONTIUM_END_ORE_MODIFIER = biomeModifierResourceKey("strontium_ore");
    private static final ResourceKey<BiomeModifier> VANADIUM_END_ORE_MODIFIER = biomeModifierResourceKey("vanadium_ore");
    private static final ResourceKey<BiomeModifier> YTTRIUM_END_ORE_MODIFIER = biomeModifierResourceKey("yttrium_ore");

    public MegalosAIOWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }

    private static void bootstrapBiomeModifiers(BootstrapContext<BiomeModifier> context) {
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        //Overworld
        context.register(ALUMINIUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.ALUMINIUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(CALCIUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.CALCIUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(CINNABAR_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.CINNABAR_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(LEAD_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.LEAD_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(MAGNESIUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.MAGNESIUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(NICKEL_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.NICKEL_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(OSMIUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.OSMIUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(PLATINUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.PLATINUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(SILICON_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.SILICON_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(SILVER_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.SILVER_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(SODIUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.SODIUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(TIN_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.TIN_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(TITANIUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.TITANIUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ZINC_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.ZINC_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ZIRCONIUM_OVERWORLD_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.ZIRCONIUM_OVERWORLD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        //Deepslate
        context.register(ANTIMONY_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.ANTIMONY_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(BISMUTH_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.BISMUTH_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(CADMIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.CADMIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(CHROMIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.CHROMIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(COBALT_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.COBALT_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(GALLIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.GALLIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(IRIDIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.IRIDIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(MANGANESE_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.MANGANESE_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(MOLYBDENUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.MOLYBDENUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(PALLADIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.PALLADIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(POTASSIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.POTASSIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(RUTHENIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.RUTHENIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(THALLIUM_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.THALLIUM_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(TUNGSTEN_DEEPSLATE_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.TUNGSTEN_DEEPSLATE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        //Nether
        context.register(ARSENIC_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.ARSENIC_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(BARIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.BARIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(BERYLLIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.BERYLLIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(CAESIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.CAESIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(GERMANIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.GERMANIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(HAFNIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.HAFNIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(INDIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.INDIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(NIOBIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.NIOBIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(PHOSPHORUS_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.PHOSPHORUS_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(RHENIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.RHENIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(RHODIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.RHODIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(SELENIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.SELENIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(TANTALUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.TANTALUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(TECHNETIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.TECHNETIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(TELLURIUM_NETHER_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.TELLURIUM_NETHER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        //End
        context.register(LITHIUM_END_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.LITHIUM_END_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(RUBIDIUM_END_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.RUBIDIUM_END_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(SCANDIUM_END_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.SCANDIUM_END_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(STRONTIUM_END_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.STRONTIUM_END_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(VANADIUM_END_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.VANADIUM_END_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(YTTRIUM_END_ORE_MODIFIER, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(MegalosAIOWorldGen.YTTRIUM_END_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static ResourceKey<BiomeModifier> biomeModifierResourceKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,Constants.id(name));
    }
}
