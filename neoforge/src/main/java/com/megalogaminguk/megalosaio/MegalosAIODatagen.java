package com.megalogaminguk.megalosaio;

import com.megalogaminguk.megalosaio.datagen.*;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class MegalosAIODatagen {
    private MegalosAIODatagen() {

    }

    public static void onGatherClientData(GatherDataEvent.Client event){
        event.createProvider(MegalosAIOModelProvider::new);
        event.createProvider(MegalosAIOEnglishLanguageProvider::new);
        event.createProvider(MegalosAIOBlockTagProvider::new);
        event.createProvider(MegalosAIOLootTableProvider::new);
        event.createProvider(MegalosAIOItemTagsProvider::new);
        event.createProvider(MegalosAIOEquipmentAssetProvider::new);
    }
}
