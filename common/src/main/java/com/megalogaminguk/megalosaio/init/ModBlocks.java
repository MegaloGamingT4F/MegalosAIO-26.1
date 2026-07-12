package com.megalogaminguk.megalosaio.init;

import com.megalogaminguk.megalosaio.services.Services;
import com.megalogaminguk.megalosaio.services.util.BlockWithItemRegistryHandle;
import net.minecraft.world.level.block.Block;

public final class ModBlocks {
    private ModBlocks(){
    }

    public static void load(){
    }

    //Ore - Overworld
    public static final BlockWithItemRegistryHandle<Block> ALUMINIUM_ORE = Services.REGISTRY.registerBlockWithItem("aluminium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CALCIUM_ORE = Services.REGISTRY.registerBlockWithItem("calcium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CINNABAR_ORE = Services.REGISTRY.registerBlockWithItem("cinnabar_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> LEAD_ORE = Services.REGISTRY.registerBlockWithItem("lead_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> MAGNESIUM_ORE = Services.REGISTRY.registerBlockWithItem("magnesium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> NICKEL_ORE = Services.REGISTRY.registerBlockWithItem("nickel_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> OSMIUM_ORE = Services.REGISTRY.registerBlockWithItem("osmium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> PLATINUM_ORE = Services.REGISTRY.registerBlockWithItem("platinum_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SILICON_ORE = Services.REGISTRY.registerBlockWithItem("silicon_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SILVER_ORE = Services.REGISTRY.registerBlockWithItem("silver_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SODIUM_ORE = Services.REGISTRY.registerBlockWithItem("sodium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TIN_ORE = Services.REGISTRY.registerBlockWithItem("tin_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TITANIUM_ORE = Services.REGISTRY.registerBlockWithItem("titanium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> ZINC_ORE = Services.REGISTRY.registerBlockWithItem("zinc_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> ZIRCONIUM_ORE = Services.REGISTRY.registerBlockWithItem("zirconium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));

    //Ore - Deepslate
    public static final BlockWithItemRegistryHandle<Block> ANTIMONY_ORE = Services.REGISTRY.registerBlockWithItem("antimony_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> BISMUTH_ORE = Services.REGISTRY.registerBlockWithItem("bismuth_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CADMIUM_ORE = Services.REGISTRY.registerBlockWithItem("cadmium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CHROMIUM_ORE = Services.REGISTRY.registerBlockWithItem("chromium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> COBALT_ORE = Services.REGISTRY.registerBlockWithItem("cobalt_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> GALLIUM_ORE = Services.REGISTRY.registerBlockWithItem("gallium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> IRIDIUM_ORE = Services.REGISTRY.registerBlockWithItem("iridium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> MANGANESE_ORE = Services.REGISTRY.registerBlockWithItem("manganese_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> MOLYBDENUM_ORE = Services.REGISTRY.registerBlockWithItem("molybdenum_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> PALLADIUM_ORE = Services.REGISTRY.registerBlockWithItem("palladium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> POTASSIUM_ORE = Services.REGISTRY.registerBlockWithItem("potassium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RUTHENIUM_ORE = Services.REGISTRY.registerBlockWithItem("ruthenium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> THALLIUM_ORE = Services.REGISTRY.registerBlockWithItem("thallium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TUNGSTEN_ORE = Services.REGISTRY.registerBlockWithItem("tungsten_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));

    //Ore - Nether
    public static final BlockWithItemRegistryHandle<Block> ARSENIC_ORE = Services.REGISTRY.registerBlockWithItem("arsenic_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> BARIUM_ORE = Services.REGISTRY.registerBlockWithItem("barium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> BERYLLIUM_ORE = Services.REGISTRY.registerBlockWithItem("beryllium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CAESIUM_ORE = Services.REGISTRY.registerBlockWithItem("caesium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> GERMANIUM_ORE = Services.REGISTRY.registerBlockWithItem("germanium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> HAFNIUM_ORE = Services.REGISTRY.registerBlockWithItem("hafnium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> INDIUM_ORE = Services.REGISTRY.registerBlockWithItem("indium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> NIOBIUM_ORE = Services.REGISTRY.registerBlockWithItem("niobium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> PHOSPHORUS_ORE = Services.REGISTRY.registerBlockWithItem("phosphorus_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RHENIUM_ORE = Services.REGISTRY.registerBlockWithItem("rhenium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RHODIUM_ORE = Services.REGISTRY.registerBlockWithItem("rhodium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SELENIUM_ORE = Services.REGISTRY.registerBlockWithItem("selenium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TANTALUM_ORE = Services.REGISTRY.registerBlockWithItem("tantalum_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TECHNETIUM_ORE = Services.REGISTRY.registerBlockWithItem("technetium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TELLURIUM_ORE = Services.REGISTRY.registerBlockWithItem("tellurium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));

    //Ore - End
    public static final BlockWithItemRegistryHandle<Block> LITHIUM_ORE = Services.REGISTRY.registerBlockWithItem("lithium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RUBIDIUM_ORE = Services.REGISTRY.registerBlockWithItem("rubidium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SCANDIUM_ORE = Services.REGISTRY.registerBlockWithItem("scandium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> STRONTIUM_ORE = Services.REGISTRY.registerBlockWithItem("strontium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> VANADIUM_ORE = Services.REGISTRY.registerBlockWithItem("vanadium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> YTTRIUM_ORE = Services.REGISTRY.registerBlockWithItem("yttrium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));

    //Block
    public static final BlockWithItemRegistryHandle<Block> ALUMINIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("aluminium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> ANTIMONY_BLOCK = Services.REGISTRY.registerBlockWithItem("antimony_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> ARSENIC_BLOCK = Services.REGISTRY.registerBlockWithItem("arsenic_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> BARIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("barium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> BERYLLIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("beryllium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> BISMUTH_BLOCK = Services.REGISTRY.registerBlockWithItem("bismuth_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CADMIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("cadmium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CAESIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("caesium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CALCIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("calcium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CHROMIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("chromium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> CINNABAR_BLOCK = Services.REGISTRY.registerBlockWithItem("cinnabar_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> COBALT_BLOCK = Services.REGISTRY.registerBlockWithItem("cobalt_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> GERMANIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("germanium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> GALLIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("gallium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> HAFNIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("hafnium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> INDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("indium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> IRIDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("iridium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> LEAD_BLOCK = Services.REGISTRY.registerBlockWithItem("lead_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> LITHIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("lithium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> MAGNESIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("magnesium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> MANGANESE_BLOCK = Services.REGISTRY.registerBlockWithItem("manganese_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> MOLYBDENUM_BLOCK = Services.REGISTRY.registerBlockWithItem("molybdenum_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> NICKEL_BLOCK = Services.REGISTRY.registerBlockWithItem("nickel_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> NIOBIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("niobium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> OSMIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("osmium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> PALLADIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("palladium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> PHOSPHORUS_BLOCK = Services.REGISTRY.registerBlockWithItem("phosphorus_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> PLATINUM_BLOCK = Services.REGISTRY.registerBlockWithItem("platinum_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> POTASSIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("potassium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RHENIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("rhenium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RHODIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("rhodium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RUBIDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("rubidium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RUTHENIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("ruthenium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SCANDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("scandium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SELENIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("selenium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SILICON_BLOCK = Services.REGISTRY.registerBlockWithItem("silicon_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SILVER_BLOCK = Services.REGISTRY.registerBlockWithItem("silver_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> SODIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("sodium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> STRONTIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("strontium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TANTALUM_BLOCK = Services.REGISTRY.registerBlockWithItem("tantalum_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TECHNETIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("technetium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TELLURIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("tellurium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> THALLIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("thallium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TIN_BLOCK = Services.REGISTRY.registerBlockWithItem("tin_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TITANIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("titanium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> TUNGSTEN_BLOCK = Services.REGISTRY.registerBlockWithItem("tungsten_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> VANADIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("vanadium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> YTTRIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("yttrium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> ZINC_BLOCK = Services.REGISTRY.registerBlockWithItem("zinc_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> ZIRCONIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("zirconium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));

    //Raw Block
    public static final BlockWithItemRegistryHandle<Block> RAW_ALUMINIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_aluminium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_ANTIMONY_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_antimony_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_ARSENIC_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_arsenic_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_BARIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_barium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_BERYLLIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_beryllium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_BISMUTH_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_bismuth_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_CADMIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_cadmium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_CAESIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_caesium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_CALCIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_calcium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_CHROMIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_chromium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_CINNABAR_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_cinnabar_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_COBALT_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_cobalt_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_GERMANIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_germanium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_GALLIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_gallium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_HAFNIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_hafnium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_INDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_indium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_IRIDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_iridium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_LEAD_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_lead_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_LITHIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_lithium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_MAGNESIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_magnesium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_MANGANESE_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_manganese_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_MOLYBDENUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_molybdenum_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_NICKEL_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_nickel_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_NIOBIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_niobium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_OSMIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_osmium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_PALLADIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_palladium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_PHOSPHORUS_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_phosphorus_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_PLATINUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_platinum_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_POTASSIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_potassium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_RHENIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_rhenium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_RHODIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_rhodium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_RUBIDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_rubidium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_RUTHENIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_ruthenium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_SCANDIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_scandium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_SELENIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_selenium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_SILICON_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_silicon_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_SILVER_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_silver_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_SODIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_sodium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_STRONTIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_strontium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_TANTALUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_tantalum_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_TECHNETIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_technetium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_TELLURIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_tellurium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_THALLIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_thallium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_TIN_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_tin_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_TITANIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_titanium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_TUNGSTEN_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_tungsten_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_VANADIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_vanadium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_YTTRIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_yttrium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_ZINC_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_zinc_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));
    public static final BlockWithItemRegistryHandle<Block> RAW_ZIRCONIUM_BLOCK = Services.REGISTRY.registerBlockWithItem("raw_zirconium_block",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));

    private static BlockWithItemRegistryHandle<Block> createOreBlock(String name) {
        return Services.REGISTRY.registerBlockWithItem(name,
                properties -> new Block(properties.strength(3.0F,3.0F).requiresCorrectToolForDrops()));
    }
}
