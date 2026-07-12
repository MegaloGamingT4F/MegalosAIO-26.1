package com.megalogaminguk.megalosaio.init;

import com.megalogaminguk.megalosaio.Constants;
import com.megalogaminguk.megalosaio.services.Services;
import com.megalogaminguk.megalosaio.services.util.RegistryHandle;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;

public final class ModCreativeTabs {
    private ModCreativeTabs() {
    }

    public static final RegistryHandle<CreativeModeTab> MEGALOS_AIO_TAB =
            Services.REGISTRY.registerCreativeTab("megalos_aio_tab", () -> new ItemStack(ModBlocks.ALUMINIUM_ORE.block().get()),
                    output -> BuiltInRegistries.ITEM.stream()
                            .filter(item -> Objects.equals(BuiltInRegistries.ITEM.getKey(item)
                                    .getNamespace(), Constants.MOD_ID))
                            .forEachOrdered(output::accept));

    public static void load(){

    }
}
