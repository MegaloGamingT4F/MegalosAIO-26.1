package com.megalogaminguk.megalosaio;

import net.fabricmc.api.ModInitializer;

public class MegalosAIOFabric implements ModInitializer {

    @Override
    public void onInitialize(){
        Constants.LOG.info("Hello Fabric World!");
        CommonClass.init();
    }
}
