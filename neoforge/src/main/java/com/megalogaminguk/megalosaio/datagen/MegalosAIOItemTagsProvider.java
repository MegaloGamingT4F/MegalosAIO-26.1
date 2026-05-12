package com.megalogaminguk.megalosaio.datagen;

import com.megalogaminguk.megalosaio.Constants;
import com.megalogaminguk.megalosaio.init.ModItemTags;
import com.megalogaminguk.megalosaio.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class MegalosAIOItemTagsProvider extends ItemTagsProvider {
    public MegalosAIOItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModItemTags.ALUMINIUM_TOOL_MATERIALS)
                .add(ModItems.ALUMINIUM_INGOT.get());

        tag(ModItemTags.SILVER_TOOL_MATERIALS)
                .add(ModItems.SILVER_INGOT.get());

        tag(ModItemTags.TECHNETIUM_TOOL_MATERIALS)
                .add(ModItems.TECHNETIUM_INGOT.get());

        tag(ModItemTags.TITANIUM_TOOL_MATERIALS)
                .add(ModItems.TITANIUM_INGOT.get());

    }
}
