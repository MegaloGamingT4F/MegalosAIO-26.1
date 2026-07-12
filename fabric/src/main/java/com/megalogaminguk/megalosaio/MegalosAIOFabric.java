package com.megalogaminguk.megalosaio;

import com.megalogaminguk.megalosaio.worldgen.MegalosAIOFabricWorldGen;
import net.fabricmc.api.ModInitializer;

public class MegalosAIOFabric implements ModInitializer {

    @Override
    public void onInitialize(){
        Constants.LOG.info("Hello Fabric World!");
        CommonClass.init();
        MegalosAIOFabricWorldGen.load();
    }
}
