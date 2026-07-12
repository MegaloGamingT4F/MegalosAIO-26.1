package com.megalogaminguk.megalosaio.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.levelgen.GenerationStep;

public final class MegalosAIOFabricWorldGen {
    private MegalosAIOFabricWorldGen(){

    }
    public static void load() {
        //Overworld
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.ALUMINIUM_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.CALCIUM_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.CINNABAR_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.LEAD_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.MAGNESIUM_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.NICKEL_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.OSMIUM_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.PLATINUM_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.SILICON_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.SILVER_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.SODIUM_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.TIN_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.TITANIUM_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.ZINC_OVERWORLD_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.ZIRCONIUM_OVERWORLD_ORE_PLACED

        );

        //Deepslate
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.ANTIMONY_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.BISMUTH_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.CADMIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.CHROMIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.COBALT_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.GALLIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.IRIDIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.MANGANESE_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.MOLYBDENUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.PALLADIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.POTASSIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.RUTHENIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.THALLIUM_DEEPSLATE_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.TUNGSTEN_DEEPSLATE_ORE_PLACED

        );

        //Nether
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.ARSENIC_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.BARIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.BERYLLIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.CAESIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.GERMANIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.HAFNIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.INDIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.NIOBIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.PHOSPHORUS_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.RHENIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.RHODIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.SELENIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.TANTALUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.TECHNETIUM_NETHER_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.TELLURIUM_NETHER_ORE_PLACED

        );

        //End
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.LITHIUM_END_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.RUBIDIUM_END_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.SCANDIUM_END_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.STRONTIUM_END_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.VANADIUM_END_ORE_PLACED

        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                MegalosAIOWorldGen.YTTRIUM_END_ORE_PLACED

        );
    }
}
