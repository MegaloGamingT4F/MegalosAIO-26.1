package com.megalogaminguk.megalosaio;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MegalosAIO {
    public MegalosAIO(IEventBus eventBus){
        Constants.LOG.info("Hello NeoForge World!");
        CommonClass.init();
    }
}
