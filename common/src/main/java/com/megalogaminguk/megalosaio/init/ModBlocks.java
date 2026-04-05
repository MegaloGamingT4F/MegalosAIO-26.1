package com.megalogaminguk.megalosaio.init;

import com.megalogaminguk.megalosaio.services.Services;
import com.megalogaminguk.megalosaio.services.util.BlockWithItemRegistryHandle;
import net.minecraft.world.level.block.Block;

public final class ModBlocks {
    private ModBlocks(){
    }

    public static void load(){

    }

    //Ore
    public static final BlockWithItemRegistryHandle<Block> ALUMINIUM_ORE = Services.REGISTRY.registerBlockWithItem("aluminium_ore",
            properties -> new Block(properties.strength(3.0F).requiresCorrectToolForDrops()));

    //Block

    //Raw Block
}
