package com.megalogaminguk.megalosaio.worldgen;

import com.megalogaminguk.megalosaio.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class MegalosAIOWorldGen {
    //Configured Feature - Overworld
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINIUM_OVERWORLD_ORE = configuredFeatureResourceKey("aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CALCIUM_OVERWORLD_ORE = configuredFeatureResourceKey("calcium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CINNABAR_OVERWORLD_ORE = configuredFeatureResourceKey("cinnabar_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_OVERWORLD_ORE = configuredFeatureResourceKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNESIUM_OVERWORLD_ORE = configuredFeatureResourceKey("magnesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_OVERWORLD_ORE = configuredFeatureResourceKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OSMIUM_OVERWORLD_ORE = configuredFeatureResourceKey("osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_OVERWORLD_ORE = configuredFeatureResourceKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILICON_OVERWORLD_ORE = configuredFeatureResourceKey("silicon_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_OVERWORLD_ORE = configuredFeatureResourceKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SODIUM_OVERWORLD_ORE = configuredFeatureResourceKey("sodium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_OVERWORLD_ORE = configuredFeatureResourceKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_OVERWORLD_ORE = configuredFeatureResourceKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_OVERWORLD_ORE = configuredFeatureResourceKey("zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZIRCONIUM_OVERWORLD_ORE = configuredFeatureResourceKey("zirconium_ore");

    //Configure Feature - Deepslate
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANTIMONY_DEEPSLATE_ORE = configuredFeatureResourceKey("antimony_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BISMUTH_DEEPSLATE_ORE = configuredFeatureResourceKey("bismuth_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CADMIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("cadmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHROMIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("chromium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_DEEPSLATE_ORE = configuredFeatureResourceKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GALLIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("gallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRIDIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("iridium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGANESE_DEEPSLATE_ORE = configuredFeatureResourceKey("manganese_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOLYBDENUM_DEEPSLATE_ORE = configuredFeatureResourceKey("molybdenum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALLADIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("palladium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POTASSIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("potassium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUTHENIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("ruthenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THALLIUM_DEEPSLATE_ORE = configuredFeatureResourceKey("thallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_DEEPSLATE_ORE = configuredFeatureResourceKey("tungsten_ore");

    //Configured Feature - Nether
    public static final ResourceKey<ConfiguredFeature<?, ?>> ARSENIC_NETHER_ORE = configuredFeatureResourceKey("arsenic_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BARIUM_NETHER_ORE = configuredFeatureResourceKey("barium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERYLLIUM_NETHER_ORE = configuredFeatureResourceKey("beryllium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAESIUM_NETHER_ORE = configuredFeatureResourceKey("caesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GERMANIUM_NETHER_ORE = configuredFeatureResourceKey("germanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HAFNIUM_NETHER_ORE = configuredFeatureResourceKey("hafnium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INDIUM_NETHER_ORE = configuredFeatureResourceKey("indium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIOBIUM_NETHER_ORE = configuredFeatureResourceKey("niobium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PHOSPHORUS_NETHER_ORE = configuredFeatureResourceKey("phosphorus_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RHENIUM_NETHER_ORE = configuredFeatureResourceKey("rhenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RHODIUM_NETHER_ORE = configuredFeatureResourceKey("rhodium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SELENIUM_NETHER_ORE = configuredFeatureResourceKey("selenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TANTALUM_NETHER_ORE = configuredFeatureResourceKey("tantalum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TECHNETIUM_NETHER_ORE = configuredFeatureResourceKey("technetium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TELLURIUM_NETHER_ORE = configuredFeatureResourceKey("tellurium_ore");

    //Configured Feature - End
    public static final ResourceKey<ConfiguredFeature<?, ?>> LITHIUM_END_ORE = configuredFeatureResourceKey("lithium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBIDIUM_END_ORE = configuredFeatureResourceKey("rubidium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCANDIUM_END_ORE = configuredFeatureResourceKey("scandium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRONTIUM_END_ORE = configuredFeatureResourceKey("strontium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VANADIUM_END_ORE = configuredFeatureResourceKey("vanadium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YTTRIUM_END_ORE = configuredFeatureResourceKey("yttrium_ore");

    //Placed Feature - Overworld
    public static final ResourceKey<PlacedFeature> ALUMINIUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("aluminium_ore");
    public static final ResourceKey<PlacedFeature> CALCIUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("calcium_ore");
    public static final ResourceKey<PlacedFeature> CINNABAR_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("cinnabar_ore");
    public static final ResourceKey<PlacedFeature> LEAD_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("lead_ore");
    public static final ResourceKey<PlacedFeature> MAGNESIUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("magnesium_ore");
    public static final ResourceKey<PlacedFeature> NICKEL_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("nickel_ore");
    public static final ResourceKey<PlacedFeature> OSMIUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("osmium_ore");
    public static final ResourceKey<PlacedFeature> PLATINUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("platinum_ore");
    public static final ResourceKey<PlacedFeature> SILICON_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("silicon_ore");
    public static final ResourceKey<PlacedFeature> SILVER_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("silver_ore");
    public static final ResourceKey<PlacedFeature> SODIUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("sodium_ore");
    public static final ResourceKey<PlacedFeature> TIN_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("tin_ore");
    public static final ResourceKey<PlacedFeature> TITANIUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("titanium_ore");
    public static final ResourceKey<PlacedFeature> ZINC_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("zinc_ore");
    public static final ResourceKey<PlacedFeature> ZIRCONIUM_OVERWORLD_ORE_PLACED = placedFeatureResourceKey("zirconium_ore");

    //Configure Feature - Deepslate
    public static final ResourceKey<PlacedFeature> ANTIMONY_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("antimony_ore");
    public static final ResourceKey<PlacedFeature> BISMUTH_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("bismuth_ore");
    public static final ResourceKey<PlacedFeature> CADMIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("cadmium_ore");
    public static final ResourceKey<PlacedFeature> CHROMIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("chromium_ore");
    public static final ResourceKey<PlacedFeature> COBALT_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("cobalt_ore");
    public static final ResourceKey<PlacedFeature> GALLIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("gallium_ore");
    public static final ResourceKey<PlacedFeature> IRIDIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("iridium_ore");
    public static final ResourceKey<PlacedFeature> MANGANESE_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("manganese_ore");
    public static final ResourceKey<PlacedFeature> MOLYBDENUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("molybdenum_ore");
    public static final ResourceKey<PlacedFeature> PALLADIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("palladium_ore");
    public static final ResourceKey<PlacedFeature> POTASSIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("potassium_ore");
    public static final ResourceKey<PlacedFeature> RUTHENIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("ruthenium_ore");
    public static final ResourceKey<PlacedFeature> THALLIUM_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("thallium_ore");
    public static final ResourceKey<PlacedFeature> TUNGSTEN_DEEPSLATE_ORE_PLACED = placedFeatureResourceKey("tungsten_ore");

    //placed Feature - Nether
    public static final ResourceKey<PlacedFeature> ARSENIC_NETHER_ORE_PLACED = placedFeatureResourceKey("arsenic_ore");
    public static final ResourceKey<PlacedFeature> BARIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("barium_ore");
    public static final ResourceKey<PlacedFeature> BERYLLIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("beryllium_ore");
    public static final ResourceKey<PlacedFeature> CAESIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("caesium_ore");
    public static final ResourceKey<PlacedFeature> GERMANIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("germanium_ore");
    public static final ResourceKey<PlacedFeature> HAFNIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("hafnium_ore");
    public static final ResourceKey<PlacedFeature> INDIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("indium_ore");
    public static final ResourceKey<PlacedFeature> NIOBIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("niobium_ore");
    public static final ResourceKey<PlacedFeature> PHOSPHORUS_NETHER_ORE_PLACED = placedFeatureResourceKey("phosphorus_ore");
    public static final ResourceKey<PlacedFeature> RHENIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("rhenium_ore");
    public static final ResourceKey<PlacedFeature> RHODIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("rhodium_ore");
    public static final ResourceKey<PlacedFeature> SELENIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("selenium_ore");
    public static final ResourceKey<PlacedFeature> TANTALUM_NETHER_ORE_PLACED = placedFeatureResourceKey("tantalum_ore");
    public static final ResourceKey<PlacedFeature> TECHNETIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("technetium_ore");
    public static final ResourceKey<PlacedFeature> TELLURIUM_NETHER_ORE_PLACED = placedFeatureResourceKey("tellurium_ore");

    //placed Feature - End
    public static final ResourceKey<PlacedFeature> LITHIUM_END_ORE_PLACED = placedFeatureResourceKey("lithium_ore");
    public static final ResourceKey<PlacedFeature> RUBIDIUM_END_ORE_PLACED = placedFeatureResourceKey("rubidium_ore");
    public static final ResourceKey<PlacedFeature> SCANDIUM_END_ORE_PLACED = placedFeatureResourceKey("scandium_ore");
    public static final ResourceKey<PlacedFeature> STRONTIUM_END_ORE_PLACED = placedFeatureResourceKey("strontium_ore");
    public static final ResourceKey<PlacedFeature> VANADIUM_END_ORE_PLACED = placedFeatureResourceKey("vanadium_ore");
    public static final ResourceKey<PlacedFeature> YTTRIUM_END_ORE_PLACED = placedFeatureResourceKey("yttrium_ore");

    private MegalosAIOWorldGen(){

    }

    public static void load(){

    }

    private static ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureResourceKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Constants.id(name));
    }

    private static ResourceKey<PlacedFeature> placedFeatureResourceKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Constants.id(name));
    }
}
