package com.megalogaminguk.megalosaio.init;

import com.megalogaminguk.megalosaio.services.Services;
import com.megalogaminguk.megalosaio.services.util.RegistryHandle;
import net.minecraft.world.item.Item;

public final class ModItems {
    private ModItems(){
    }

    public static void load(){

    }

    //Metallurgy
    public static final RegistryHandle<Item> ALUMINIUM_INGOT = Services.REGISTRY.registerItem("aluminium_ingot",
            Item::new);

    //Alloys

    //Nature & Gastronomy

    //Technology
}
