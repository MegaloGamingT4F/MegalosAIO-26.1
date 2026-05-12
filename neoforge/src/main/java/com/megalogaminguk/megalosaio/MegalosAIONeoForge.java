package com.megalogaminguk.megalosaio;

import com.megalogaminguk.megalosaio.services.NeoForgeRegistryHelper;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MegalosAIONeoForge {
    public MegalosAIONeoForge(IEventBus eventBus){
        Constants.LOG.info("Hello NeoForge World!");
        CommonClass.init();
        eventBus.addListener(MegalosAIODatagen::onGatherClientData);
        NeoForgeRegistryHelper.register(eventBus);
    }
}
