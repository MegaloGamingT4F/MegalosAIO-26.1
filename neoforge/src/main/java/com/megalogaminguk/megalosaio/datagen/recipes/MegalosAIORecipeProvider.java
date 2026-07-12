package com.megalogaminguk.megalosaio.datagen.recipes;

import com.megalogaminguk.megalosaio.Constants;
import com.megalogaminguk.megalosaio.init.ModBlocks;
import com.megalogaminguk.megalosaio.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MegalosAIORecipeProvider extends RecipeProvider {
    public MegalosAIORecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {

        //Aluminium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ALUMINIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_ALUMINIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_ALUMINIUM.get()), has(ModItems.RAW_ALUMINIUM.get())).group("aluminium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ALUMINIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_NUGGET.get()), has(ModItems.ALUMINIUM_NUGGET.get())).group("aluminium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ALUMINIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_DUST.get()), has(ModItems.ALUMINIUM_DUST.get())).group("aluminium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_ALUMINIUM.get(), 9).requires(ModBlocks.RAW_ALUMINIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_ALUMINIUM_BLOCK.block().get())
                        , has(ModBlocks.RAW_ALUMINIUM_BLOCK.block().get())).group("aluminium").save(output,"megalosaio:raw_aluminium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 9).requires(ModBlocks.ALUMINIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.ALUMINIUM_BLOCK.block().get())
                        , has(ModBlocks.ALUMINIUM_BLOCK.block().get())).group("aluminium").save(output, "megalosaio:aluminium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET.get(), 9).requires(ModItems.ALUMINIUM_INGOT.get()).unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .group("aluminium").save(output, "megalosaio:aluminium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_DUST.get(), 9).requires(ModItems.ALUMINIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.ALUMINIUM_NUGGET.get()), has(ModItems.ALUMINIUM_NUGGET.get()))
                .group("aluminium").save(output, "megalosaio:aluminium_dust_shapeless");
        
//Calcium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CALCIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_INGOT.get()), has(ModItems.CALCIUM_INGOT.get())).group("calcium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CALCIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_CALCIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CALCIUM.get()), has(ModItems.RAW_CALCIUM.get())).group("calcium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CALCIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CALCIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_NUGGET.get()), has(ModItems.CALCIUM_NUGGET.get())).group("calcium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CALCIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CALCIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_DUST.get()), has(ModItems.CALCIUM_DUST.get())).group("calcium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_CALCIUM.get(), 9).requires(ModBlocks.RAW_CALCIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_CALCIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_CALCIUM_BLOCK.block().get())).group("calcium").save(output,"megalosaio:raw_calcium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CALCIUM_INGOT.get(), 9).requires(ModBlocks.CALCIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.CALCIUM_BLOCK.block().get())
                , has(ModBlocks.CALCIUM_BLOCK.block().get())).group("calcium").save(output, "megalosaio:calcium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CALCIUM_NUGGET.get(), 9).requires(ModItems.CALCIUM_INGOT.get()).unlockedBy(getHasName(ModItems.CALCIUM_INGOT.get()), has(ModItems.CALCIUM_INGOT.get()))
                .group("calcium").save(output, "megalosaio:calcium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CALCIUM_DUST.get(), 9).requires(ModItems.CALCIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.CALCIUM_NUGGET.get()), has(ModItems.CALCIUM_NUGGET.get()))
                .group("calcium").save(output, "megalosaio:calcium_dust_shapeless");

        //Chromium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHROMIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get())).group("chromium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CHROMIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_CHROMIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CHROMIUM.get()), has(ModItems.RAW_CHROMIUM.get())).group("chromium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CHROMIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CHROMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_NUGGET.get()), has(ModItems.CHROMIUM_NUGGET.get())).group("chromium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CHROMIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_DUST.get()), has(ModItems.CHROMIUM_DUST.get())).group("chromium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_CHROMIUM.get(), 9).requires(ModBlocks.RAW_CHROMIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_CHROMIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_CHROMIUM_BLOCK.block().get())).group("chromium").save(output,"megalosaio:raw_chromium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 9).requires(ModBlocks.CHROMIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.CHROMIUM_BLOCK.block().get())
                , has(ModBlocks.CHROMIUM_BLOCK.block().get())).group("chromium").save(output, "megalosaio:chromium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_NUGGET.get(), 9).requires(ModItems.CHROMIUM_INGOT.get()).unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .group("chromium").save(output, "megalosaio:chromium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_DUST.get(), 9).requires(ModItems.CHROMIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.CHROMIUM_NUGGET.get()), has(ModItems.CHROMIUM_NUGGET.get()))
                .group("chromium").save(output, "megalosaio:chromium_dust_shapeless");

        //LEAD
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get())).group("lead").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_LEAD_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_LEAD.get())
                .unlockedBy(getHasName(ModItems.RAW_LEAD.get()), has(ModItems.RAW_LEAD.get())).group("lead").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.LEAD_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.LEAD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LEAD_NUGGET.get()), has(ModItems.LEAD_NUGGET.get())).group("lead").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.LEAD_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.LEAD_DUST.get())
                .unlockedBy(getHasName(ModItems.LEAD_DUST.get()), has(ModItems.LEAD_DUST.get())).group("lead").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_LEAD.get(), 9).requires(ModBlocks.RAW_LEAD_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_LEAD_BLOCK.block().get())
                , has(ModBlocks.RAW_LEAD_BLOCK.block().get())).group("lead").save(output,"megalosaio:raw_lead_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9).requires(ModBlocks.LEAD_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.LEAD_BLOCK.block().get())
                , has(ModBlocks.LEAD_BLOCK.block().get())).group("lead").save(output, "megalosaio:lead_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.LEAD_NUGGET.get(), 9).requires(ModItems.LEAD_INGOT.get()).unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .group("lead").save(output, "megalosaio:lead_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.LEAD_DUST.get(), 9).requires(ModItems.LEAD_NUGGET.get()).unlockedBy(getHasName(ModItems.LEAD_NUGGET.get()), has(ModItems.LEAD_NUGGET.get()))
                .group("lead").save(output, "megalosaio:lead_dust_shapeless");

//MAGNESIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGNESIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MAGNESIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_INGOT.get()), has(ModItems.MAGNESIUM_INGOT.get())).group("magnesium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MAGNESIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_MAGNESIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_MAGNESIUM.get()), has(ModItems.RAW_MAGNESIUM.get())).group("magnesium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MAGNESIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MAGNESIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_NUGGET.get()), has(ModItems.MAGNESIUM_NUGGET.get())).group("magnesium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MAGNESIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MAGNESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_DUST.get()), has(ModItems.MAGNESIUM_DUST.get())).group("magnesium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_MAGNESIUM.get(), 9).requires(ModBlocks.RAW_MAGNESIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_MAGNESIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_MAGNESIUM_BLOCK.block().get())).group("magnesium").save(output,"megalosaio:raw_magnesium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get(), 9).requires(ModBlocks.MAGNESIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.MAGNESIUM_BLOCK.block().get())
                , has(ModBlocks.MAGNESIUM_BLOCK.block().get())).group("magnesium").save(output, "megalosaio:magnesium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MAGNESIUM_NUGGET.get(), 9).requires(ModItems.MAGNESIUM_INGOT.get()).unlockedBy(getHasName(ModItems.MAGNESIUM_INGOT.get()), has(ModItems.MAGNESIUM_INGOT.get()))
                .group("magnesium").save(output, "megalosaio:magnesium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MAGNESIUM_DUST.get(), 9).requires(ModItems.MAGNESIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.MAGNESIUM_NUGGET.get()), has(ModItems.MAGNESIUM_NUGGET.get()))
                .group("magnesium").save(output, "megalosaio:magnesium_dust_shapeless");

//MANGANESE
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGANESE_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MANGANESE_INGOT.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_INGOT.get()), has(ModItems.MANGANESE_INGOT.get())).group("manganese").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MANGANESE_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_MANGANESE.get())
                .unlockedBy(getHasName(ModItems.RAW_MANGANESE.get()), has(ModItems.RAW_MANGANESE.get())).group("manganese").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MANGANESE_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MANGANESE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_NUGGET.get()), has(ModItems.MANGANESE_NUGGET.get())).group("manganese").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MANGANESE_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_DUST.get()), has(ModItems.MANGANESE_DUST.get())).group("manganese").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_MANGANESE.get(), 9).requires(ModBlocks.RAW_MANGANESE_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_MANGANESE_BLOCK.block().get())
                , has(ModBlocks.RAW_MANGANESE_BLOCK.block().get())).group("manganese").save(output,"megalosaio:raw_manganese_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get(), 9).requires(ModBlocks.MANGANESE_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.MANGANESE_BLOCK.block().get())
                , has(ModBlocks.MANGANESE_BLOCK.block().get())).group("manganese").save(output, "megalosaio:manganese_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MANGANESE_NUGGET.get(), 9).requires(ModItems.MANGANESE_INGOT.get()).unlockedBy(getHasName(ModItems.MANGANESE_INGOT.get()), has(ModItems.MANGANESE_INGOT.get()))
                .group("manganese").save(output, "megalosaio:manganese_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MANGANESE_DUST.get(), 9).requires(ModItems.MANGANESE_NUGGET.get()).unlockedBy(getHasName(ModItems.MANGANESE_NUGGET.get()), has(ModItems.MANGANESE_NUGGET.get()))
                .group("manganese").save(output, "megalosaio:manganese_dust_shapeless");

//NICKEL
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NICKEL_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.NICKEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.NICKEL_INGOT.get()), has(ModItems.NICKEL_INGOT.get())).group("nickel").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_NICKEL_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_NICKEL.get())
                .unlockedBy(getHasName(ModItems.RAW_NICKEL.get()), has(ModItems.RAW_NICKEL.get())).group("nickel").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.NICKEL_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.NICKEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NICKEL_NUGGET.get()), has(ModItems.NICKEL_NUGGET.get())).group("nickel").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.NICKEL_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.NICKEL_DUST.get()), has(ModItems.NICKEL_DUST.get())).group("nickel").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_NICKEL.get(), 9).requires(ModBlocks.RAW_NICKEL_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_NICKEL_BLOCK.block().get())
                , has(ModBlocks.RAW_NICKEL_BLOCK.block().get())).group("nickel").save(output,"megalosaio:raw_nickel_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 9).requires(ModBlocks.NICKEL_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.NICKEL_BLOCK.block().get())
                , has(ModBlocks.NICKEL_BLOCK.block().get())).group("NICKEL").save(output, "megalosaio:nickel_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.NICKEL_NUGGET.get(), 9).requires(ModItems.NICKEL_INGOT.get()).unlockedBy(getHasName(ModItems.NICKEL_INGOT.get()), has(ModItems.NICKEL_INGOT.get()))
                .group("nickel").save(output, "megalosaio:nickel_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.NICKEL_DUST.get(), 9).requires(ModItems.NICKEL_NUGGET.get()).unlockedBy(getHasName(ModItems.NICKEL_NUGGET.get()), has(ModItems.NICKEL_NUGGET.get()))
                .group("nickel").save(output, "megalosaio:nickel_dust_shapeless");

        //POTASSIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTASSIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.POTASSIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_INGOT.get()), has(ModItems.POTASSIUM_INGOT.get())).group("potassium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_POTASSIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_POTASSIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_POTASSIUM.get()), has(ModItems.RAW_POTASSIUM.get())).group("potassium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.POTASSIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.POTASSIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_NUGGET.get()), has(ModItems.POTASSIUM_NUGGET.get())).group("potassium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.POTASSIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.POTASSIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_DUST.get()), has(ModItems.POTASSIUM_DUST.get())).group("potassium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_POTASSIUM.get(), 9).requires(ModBlocks.RAW_POTASSIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_POTASSIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_POTASSIUM_BLOCK.block().get())).group("potassium").save(output,"megalosaio:raw_potassium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.POTASSIUM_INGOT.get(), 9).requires(ModBlocks.POTASSIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.POTASSIUM_BLOCK.block().get())
                , has(ModBlocks.POTASSIUM_BLOCK.block().get())).group("potassium").save(output, "megalosaio:potassium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.POTASSIUM_NUGGET.get(), 9).requires(ModItems.POTASSIUM_INGOT.get()).unlockedBy(getHasName(ModItems.POTASSIUM_INGOT.get()), has(ModItems.POTASSIUM_INGOT.get()))
                .group("potassium").save(output, "megalosaio:potassium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.POTASSIUM_DUST.get(), 9).requires(ModItems.POTASSIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.POTASSIUM_NUGGET.get()), has(ModItems.POTASSIUM_NUGGET.get()))
                .group("potassium").save(output, "megalosaio:potassium_dust_shapeless");

//SILICON
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILICON_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SILICON_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILICON_INGOT.get()), has(ModItems.SILICON_INGOT.get())).group("silicon").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SILICON_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_SILICON.get())
                .unlockedBy(getHasName(ModItems.RAW_SILICON.get()), has(ModItems.RAW_SILICON.get())).group("silicon").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILICON_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SILICON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILICON_NUGGET.get()), has(ModItems.SILICON_NUGGET.get())).group("silicon").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILICON_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.SILICON_DUST.get()), has(ModItems.SILICON_DUST.get())).group("silicon").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_SILICON.get(), 9).requires(ModBlocks.RAW_SILICON_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_SILICON_BLOCK.block().get())
                , has(ModBlocks.RAW_SILICON_BLOCK.block().get())).group("silicon").save(output,"megalosaio:raw_silicon_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SILICON_INGOT.get(), 9).requires(ModBlocks.SILICON_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.SILICON_BLOCK.block().get())
                , has(ModBlocks.SILICON_BLOCK.block().get())).group("silicon").save(output, "megalosaio:silicon_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SILICON_NUGGET.get(), 9).requires(ModItems.SILICON_INGOT.get()).unlockedBy(getHasName(ModItems.SILICON_INGOT.get()), has(ModItems.SILICON_INGOT.get()))
                .group("silicon").save(output, "megalosaio:silicon_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SILICON_DUST.get(), 9).requires(ModItems.SILICON_NUGGET.get()).unlockedBy(getHasName(ModItems.SILICON_NUGGET.get()), has(ModItems.SILICON_NUGGET.get()))
                .group("silicon").save(output, "megalosaio:silicon_dust_shapeless");

//SODIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SODIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SODIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SODIUM_INGOT.get()), has(ModItems.SODIUM_INGOT.get())).group("sodium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SODIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_SODIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_SODIUM.get()), has(ModItems.RAW_SODIUM.get())).group("sodium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SODIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SODIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SODIUM_NUGGET.get()), has(ModItems.SODIUM_NUGGET.get())).group("sodium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SODIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SODIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SODIUM_DUST.get()), has(ModItems.SODIUM_DUST.get())).group("sodium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_SODIUM.get(), 9).requires(ModBlocks.RAW_SODIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_SODIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_SODIUM_BLOCK.block().get())).group("sodium").save(output,"megalosaio:raw_sodium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SODIUM_INGOT.get(), 9).requires(ModBlocks.SODIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.SODIUM_BLOCK.block().get())
                , has(ModBlocks.SODIUM_BLOCK.block().get())).group("sodium").save(output, "megalosaio:sodium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SODIUM_NUGGET.get(), 9).requires(ModItems.SODIUM_INGOT.get()).unlockedBy(getHasName(ModItems.SODIUM_INGOT.get()), has(ModItems.SODIUM_INGOT.get()))
                .group("sodium").save(output, "megalosaio:sodium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SODIUM_DUST.get(), 9).requires(ModItems.SODIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.SODIUM_NUGGET.get()), has(ModItems.SODIUM_NUGGET.get()))
                .group("sodium").save(output, "megalosaio:sodium_dust_shapeless");

//TIN
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get())).group("tin").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TIN_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_TIN.get())
                .unlockedBy(getHasName(ModItems.RAW_TIN.get()), has(ModItems.RAW_TIN.get())).group("tin").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TIN_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get())).group("tin").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TIN_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.TIN_DUST.get()), has(ModItems.TIN_DUST.get())).group("tin").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_TIN.get(), 9).requires(ModBlocks.RAW_TIN_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_TIN_BLOCK.block().get())
                , has(ModBlocks.RAW_TIN_BLOCK.block().get())).group("tin").save(output,"megalosaio:raw_tin_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9).requires(ModBlocks.TIN_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.TIN_BLOCK.block().get())
                , has(ModBlocks.TIN_BLOCK.block().get())).group("tin").save(output, "megalosaio:tin_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET.get(), 9).requires(ModItems.TIN_INGOT.get()).unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .group("tin").save(output, "megalosaio:tin_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TIN_DUST.get(), 9).requires(ModItems.TIN_NUGGET.get()).unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .group("tin").save(output, "megalosaio:tin_dust_shapeless");

//TITANIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TITANIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_TITANIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TITANIUM.get()), has(ModItems.RAW_TITANIUM.get())).group("titanium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TITANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NUGGET.get()), has(ModItems.TITANIUM_NUGGET.get())).group("titanium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_DUST.get()), has(ModItems.TITANIUM_DUST.get())).group("titanium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_TITANIUM.get(), 9).requires(ModBlocks.RAW_TITANIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_TITANIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_TITANIUM_BLOCK.block().get())).group("titanium").save(output,"megalosaio:raw_titanium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 9).requires(ModBlocks.TITANIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.TITANIUM_BLOCK.block().get())
                , has(ModBlocks.TITANIUM_BLOCK.block().get())).group("titanium").save(output, "megalosaio:titanium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TITANIUM_NUGGET.get(), 9).requires(ModItems.TITANIUM_INGOT.get()).unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .group("titanium").save(output, "megalosaio:titanium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TITANIUM_DUST.get(), 9).requires(ModItems.TITANIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.TITANIUM_NUGGET.get()), has(ModItems.TITANIUM_NUGGET.get()))
                .group("titanium").save(output, "megalosaio:titanium_dust_shapeless");

//ZINC
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZINC_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ZINC_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZINC_INGOT.get()), has(ModItems.ZINC_INGOT.get())).group("zinc").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ZINC_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_ZINC.get())
                .unlockedBy(getHasName(ModItems.RAW_ZINC.get()), has(ModItems.RAW_ZINC.get())).group("zinc").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ZINC_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ZINC_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZINC_NUGGET.get()), has(ModItems.ZINC_NUGGET.get())).group("zinc").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ZINC_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.ZINC_DUST.get()), has(ModItems.ZINC_DUST.get())).group("zinc").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_ZINC.get(), 9).requires(ModBlocks.RAW_ZINC_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_ZINC_BLOCK.block().get())
                , has(ModBlocks.RAW_ZINC_BLOCK.block().get())).group("zinc").save(output,"megalosaio:raw_zinc_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 9).requires(ModBlocks.ZINC_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.ZINC_BLOCK.block().get())
                , has(ModBlocks.ZINC_BLOCK.block().get())).group("zinc").save(output, "megalosaio:zinc_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ZINC_NUGGET.get(), 9).requires(ModItems.ZINC_INGOT.get()).unlockedBy(getHasName(ModItems.ZINC_INGOT.get()), has(ModItems.ZINC_INGOT.get()))
                .group("zinc").save(output, "megalosaio:zinc_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ZINC_DUST.get(), 9).requires(ModItems.ZINC_NUGGET.get()).unlockedBy(getHasName(ModItems.ZINC_NUGGET.get()), has(ModItems.ZINC_NUGGET.get()))
                .group("zinc").save(output, "megalosaio:zinc_dust_shapeless");

        //Barium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BARIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BARIUM_INGOT.get()).unlockedBy(getHasName(ModItems.BARIUM_INGOT.get()), has(ModItems.BARIUM_INGOT.get()))
                .group("barium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_BARIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_BARIUM.get()).unlockedBy(getHasName(ModItems.RAW_BARIUM.get()), has(ModItems.RAW_BARIUM.get()))
                .group("barium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BARIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BARIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.BARIUM_NUGGET.get()), has(ModItems.BARIUM_NUGGET.get()))
                .group("barium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BARIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BARIUM_DUST.get()).unlockedBy(getHasName(ModItems.BARIUM_DUST.get()), has(ModItems.BARIUM_DUST.get()))
                .group("barium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_BARIUM.get(), 9).requires(ModBlocks.RAW_BARIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_BARIUM_BLOCK.block().get()), has(ModBlocks.RAW_BARIUM_BLOCK.block().get()))
                .group("barium").save(output,"megalosaio:raw_barium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BARIUM_INGOT.get(), 9).requires(ModBlocks.BARIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.BARIUM_BLOCK.block().get()), has(ModBlocks.BARIUM_BLOCK.block().get()))
                .group("barium").save(output, "megalosaio:barium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BARIUM_NUGGET.get(), 9).requires(ModItems.BARIUM_INGOT.get()).unlockedBy(getHasName(ModItems.BARIUM_INGOT.get()), has(ModItems.BARIUM_INGOT.get()))
                .group("barium").save(output, "megalosaio:barium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BARIUM_DUST.get(), 9).requires(ModItems.BARIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.BARIUM_NUGGET.get()), has(ModItems.BARIUM_NUGGET.get()))
                .group("barium").save(output, "megalosaio:barium_dust_shapeless");

        //CADMIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CADMIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CADMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_INGOT.get()), has(ModItems.CADMIUM_INGOT.get())).group("cadmium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CADMIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_CADMIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CADMIUM.get()), has(ModItems.RAW_CADMIUM.get())).group("cadmium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CADMIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CADMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_NUGGET.get()), has(ModItems.CADMIUM_NUGGET.get())).group("cadmium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CADMIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CADMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_DUST.get()), has(ModItems.CADMIUM_DUST.get())).group("cadmium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_CADMIUM.get(), 9).requires(ModBlocks.RAW_CADMIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_CADMIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_CADMIUM_BLOCK.block().get())).group("cadmium").save(output,"megalosaio:raw_cadmium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get(), 9).requires(ModBlocks.CADMIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.CADMIUM_BLOCK.block().get())
                , has(ModBlocks.CADMIUM_BLOCK.block().get())).group("cadmium").save(output, "megalosaio:cadmium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CADMIUM_NUGGET.get(), 9).requires(ModItems.CADMIUM_INGOT.get()).unlockedBy(getHasName(ModItems.CADMIUM_INGOT.get()), has(ModItems.CADMIUM_INGOT.get()))
                .group("cadmium").save(output, "megalosaio:cadmium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CADMIUM_DUST.get(), 9).requires(ModItems.CADMIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.CADMIUM_NUGGET.get()), has(ModItems.CADMIUM_NUGGET.get()))
                .group("cadmium").save(output, "megalosaio:cadmium_dust_shapeless");

        //CAESIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAESIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CAESIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_INGOT.get()), has(ModItems.CAESIUM_INGOT.get())).group("caesium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CAESIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_CAESIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CAESIUM.get()), has(ModItems.RAW_CAESIUM.get())).group("caesium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CAESIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CAESIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_NUGGET.get()), has(ModItems.CAESIUM_NUGGET.get())).group("caesium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CAESIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CAESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_DUST.get()), has(ModItems.CAESIUM_DUST.get())).group("caesium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_CAESIUM.get(), 9).requires(ModBlocks.RAW_CAESIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_CAESIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_CAESIUM_BLOCK.block().get())).group("caesium").save(output,"megalosaio:raw_caesium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CAESIUM_INGOT.get(), 9).requires(ModBlocks.CAESIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.CAESIUM_BLOCK.block().get())
                , has(ModBlocks.CAESIUM_BLOCK.block().get())).group("caesium").save(output, "megalosaio:caesium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CAESIUM_NUGGET.get(), 9).requires(ModItems.CAESIUM_INGOT.get()).unlockedBy(getHasName(ModItems.CAESIUM_INGOT.get()), has(ModItems.CAESIUM_INGOT.get()))
                .group("caesium").save(output, "megalosaio:caesium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CAESIUM_DUST.get(), 9).requires(ModItems.CAESIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.CAESIUM_NUGGET.get()), has(ModItems.CAESIUM_NUGGET.get()))
                .group("caesium").save(output, "megalosaio:caesium_dust_shapeless");

        //COBALT
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBALT_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.COBALT_INGOT.get())
                .unlockedBy(getHasName(ModItems.COBALT_INGOT.get()), has(ModItems.COBALT_INGOT.get())).group("cobalt").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_COBALT_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_COBALT.get())
                .unlockedBy(getHasName(ModItems.RAW_COBALT.get()), has(ModItems.RAW_COBALT.get())).group("cobalt").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.COBALT_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.COBALT_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COBALT_NUGGET.get()), has(ModItems.COBALT_NUGGET.get())).group("cobalt").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.COBALT_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.COBALT_DUST.get())
                .unlockedBy(getHasName(ModItems.COBALT_DUST.get()), has(ModItems.COBALT_DUST.get())).group("cobalt").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_COBALT.get(), 9).requires(ModBlocks.RAW_COBALT_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_COBALT_BLOCK.block().get())
                , has(ModBlocks.RAW_COBALT_BLOCK.block().get())).group("cobalt").save(output,"megalosaio:raw_cobalt_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 9).requires(ModBlocks.COBALT_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.COBALT_BLOCK.block().get())
                , has(ModBlocks.COBALT_BLOCK.block().get())).group("cobalt").save(output, "megalosaio:cobalt_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.COBALT_NUGGET.get(), 9).requires(ModItems.COBALT_INGOT.get()).unlockedBy(getHasName(ModItems.COBALT_INGOT.get()), has(ModItems.COBALT_INGOT.get()))
                .group("cobalt").save(output, "megalosaio:cobalt_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.COBALT_DUST.get(), 9).requires(ModItems.COBALT_NUGGET.get()).unlockedBy(getHasName(ModItems.COBALT_NUGGET.get()), has(ModItems.COBALT_NUGGET.get()))
                .group("cobalt").save(output, "megalosaio:cobalt_dust_shapeless");

        //LITHIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LITHIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.LITHIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_INGOT.get()), has(ModItems.LITHIUM_INGOT.get())).group("lithium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_LITHIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_LITHIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_LITHIUM.get()), has(ModItems.RAW_LITHIUM.get())).group("lithium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.LITHIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.LITHIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_NUGGET.get()), has(ModItems.LITHIUM_NUGGET.get())).group("lithium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.LITHIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.LITHIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_DUST.get()), has(ModItems.LITHIUM_DUST.get())).group("lithium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_LITHIUM.get(), 9).requires(ModBlocks.RAW_LITHIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_LITHIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_LITHIUM_BLOCK.block().get())).group("lithium").save(output,"megalosaio:raw_lithium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.LITHIUM_INGOT.get(), 9).requires(ModBlocks.LITHIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.LITHIUM_BLOCK.block().get())
                , has(ModBlocks.LITHIUM_BLOCK.block().get())).group("lithium").save(output, "megalosaio:lithium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.LITHIUM_NUGGET.get(), 9).requires(ModItems.LITHIUM_INGOT.get()).unlockedBy(getHasName(ModItems.LITHIUM_INGOT.get()), has(ModItems.LITHIUM_INGOT.get()))
                .group("lithium").save(output, "megalosaio:lithium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.LITHIUM_DUST.get(), 9).requires(ModItems.LITHIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.LITHIUM_NUGGET.get()), has(ModItems.LITHIUM_NUGGET.get()))
                .group("lithium").save(output, "megalosaio:lithium_dust_shapeless");

        //NIOBIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIOBIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.NIOBIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_INGOT.get()), has(ModItems.NIOBIUM_INGOT.get())).group("niobium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_NIOBIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_NIOBIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_NIOBIUM.get()), has(ModItems.RAW_NIOBIUM.get())).group("niobium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.NIOBIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.NIOBIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_NUGGET.get()), has(ModItems.NIOBIUM_NUGGET.get())).group("niobium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.NIOBIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.NIOBIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_DUST.get()), has(ModItems.NIOBIUM_DUST.get())).group("niobium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_NIOBIUM.get(), 9).requires(ModBlocks.RAW_NIOBIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_NIOBIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_NIOBIUM_BLOCK.block().get())).group("niobium").save(output,"megalosaio:raw_niobium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 9).requires(ModBlocks.NIOBIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.NIOBIUM_BLOCK.block().get())
                , has(ModBlocks.NIOBIUM_BLOCK.block().get())).group("niobium").save(output, "megalosaio:niobium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.NIOBIUM_NUGGET.get(), 9).requires(ModItems.NIOBIUM_INGOT.get()).unlockedBy(getHasName(ModItems.NIOBIUM_INGOT.get()), has(ModItems.NIOBIUM_INGOT.get()))
                .group("niobium").save(output, "megalosaio:niobium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.NIOBIUM_DUST.get(), 9).requires(ModItems.NIOBIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.NIOBIUM_NUGGET.get()), has(ModItems.NIOBIUM_NUGGET.get()))
                .group("niobium").save(output, "megalosaio:niobium_dust_shapeless");

        //RUBIDIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBIDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RUBIDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_INGOT.get()), has(ModItems.RUBIDIUM_INGOT.get())).group("rubidium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RUBIDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_RUBIDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RUBIDIUM.get()), has(ModItems.RAW_RUBIDIUM.get())).group("rubidium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBIDIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RUBIDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_NUGGET.get()), has(ModItems.RUBIDIUM_NUGGET.get())).group("rubidium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBIDIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RUBIDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_DUST.get()), has(ModItems.RUBIDIUM_DUST.get())).group("rubidium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_RUBIDIUM.get(), 9).requires(ModBlocks.RAW_RUBIDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_RUBIDIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_RUBIDIUM_BLOCK.block().get())).group("rubidium").save(output,"megalosaio:raw_rubidium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RUBIDIUM_INGOT.get(), 9).requires(ModBlocks.RUBIDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RUBIDIUM_BLOCK.block().get())
                , has(ModBlocks.RUBIDIUM_BLOCK.block().get())).group("rubidium").save(output, "megalosaio:rubidium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RUBIDIUM_NUGGET.get(), 9).requires(ModItems.RUBIDIUM_INGOT.get()).unlockedBy(getHasName(ModItems.RUBIDIUM_INGOT.get()), has(ModItems.RUBIDIUM_INGOT.get()))
                .group("rubidium").save(output, "megalosaio:rubidium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RUBIDIUM_DUST.get(), 9).requires(ModItems.RUBIDIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.RUBIDIUM_NUGGET.get()), has(ModItems.RUBIDIUM_NUGGET.get()))
                .group("rubidium").save(output, "megalosaio:rubidium_dust_shapeless");

        //SILVER
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SILVER_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_SILVER.get())
                .unlockedBy(getHasName(ModItems.RAW_SILVER.get()), has(ModItems.RAW_SILVER.get())).group("silver").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILVER_NUGGET.get()), has(ModItems.SILVER_NUGGET.get())).group("silver").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.SILVER_DUST.get()), has(ModItems.SILVER_DUST.get())).group("silver").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_SILVER.get(), 9).requires(ModBlocks.RAW_SILVER_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_SILVER_BLOCK.block().get())
                , has(ModBlocks.RAW_SILVER_BLOCK.block().get())).group("silver").save(output,"megalosaio:raw_silver_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9).requires(ModBlocks.SILVER_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.SILVER_BLOCK.block().get())
                , has(ModBlocks.SILVER_BLOCK.block().get())).group("silver").save(output, "megalosaio:silver_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SILVER_NUGGET.get(), 9).requires(ModItems.SILVER_INGOT.get()).unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .group("silver").save(output, "megalosaio:silver_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SILVER_DUST.get(), 9).requires(ModItems.SILVER_NUGGET.get()).unlockedBy(getHasName(ModItems.SILVER_NUGGET.get()), has(ModItems.SILVER_NUGGET.get()))
                .group("silver").save(output, "megalosaio:silver_dust_shapeless");

        //SCANDIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCANDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SCANDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_INGOT.get()), has(ModItems.SCANDIUM_INGOT.get())).group("scandium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SCANDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_SCANDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_SCANDIUM.get()), has(ModItems.RAW_SCANDIUM.get())).group("scandium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SCANDIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SCANDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_NUGGET.get()), has(ModItems.SCANDIUM_NUGGET.get())).group("scandium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SCANDIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SCANDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_DUST.get()), has(ModItems.SCANDIUM_DUST.get())).group("scandium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_SCANDIUM.get(), 9).requires(ModBlocks.RAW_SCANDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_SCANDIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_SCANDIUM_BLOCK.block().get())).group("scandium").save(output,"megalosaio:raw_scandium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get(), 9).requires(ModBlocks.SCANDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.SCANDIUM_BLOCK.block().get())
                , has(ModBlocks.SCANDIUM_BLOCK.block().get())).group("scandium").save(output, "megalosaio:scandium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SCANDIUM_NUGGET.get(), 9).requires(ModItems.SCANDIUM_INGOT.get()).unlockedBy(getHasName(ModItems.SCANDIUM_INGOT.get()), has(ModItems.SCANDIUM_INGOT.get()))
                .group("scandium").save(output, "megalosaio:scandium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SCANDIUM_DUST.get(), 9).requires(ModItems.SCANDIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.SCANDIUM_NUGGET.get()), has(ModItems.SCANDIUM_NUGGET.get()))
                .group("scandium").save(output, "megalosaio:scandium_dust_shapeless");

        //STRONTIUM
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRONTIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.STRONTIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_INGOT.get()), has(ModItems.STRONTIUM_INGOT.get())).group("strontium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_STRONTIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_STRONTIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_STRONTIUM.get()), has(ModItems.RAW_STRONTIUM.get())).group("strontium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.STRONTIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.STRONTIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_NUGGET.get()), has(ModItems.STRONTIUM_NUGGET.get())).group("strontium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.STRONTIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.STRONTIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_DUST.get()), has(ModItems.STRONTIUM_DUST.get())).group("strontium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_STRONTIUM.get(), 9).requires(ModBlocks.RAW_STRONTIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_STRONTIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_STRONTIUM_BLOCK.block().get())).group("strontium").save(output,"megalosaio:raw_strontium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.STRONTIUM_INGOT.get(), 9).requires(ModBlocks.STRONTIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.STRONTIUM_BLOCK.block().get())
                , has(ModBlocks.STRONTIUM_BLOCK.block().get())).group("strontium").save(output, "megalosaio:strontium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.STRONTIUM_NUGGET.get(), 9).requires(ModItems.STRONTIUM_INGOT.get()).unlockedBy(getHasName(ModItems.STRONTIUM_INGOT.get()), has(ModItems.STRONTIUM_INGOT.get()))
                .group("strontium").save(output, "megalosaio:strontium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.STRONTIUM_DUST.get(), 9).requires(ModItems.STRONTIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.STRONTIUM_NUGGET.get()), has(ModItems.STRONTIUM_NUGGET.get()))
                .group("strontium").save(output, "megalosaio:strontium_dust_shapeless");

        //Arsenic
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARSENIC_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ARSENIC_INGOT.get()).unlockedBy(getHasName(ModItems.ARSENIC_INGOT.get()), has(ModItems.ARSENIC_INGOT.get()))
                .group("arsenic").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ARSENIC_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_ARSENIC.get()).unlockedBy(getHasName(ModItems.RAW_ARSENIC.get()), has(ModItems.RAW_ARSENIC.get()))
                .group("arsenic").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ARSENIC_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ARSENIC_NUGGET.get()).unlockedBy(getHasName(ModItems.ARSENIC_NUGGET.get()), has(ModItems.ARSENIC_NUGGET.get()))
                .group("arsenic").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ARSENIC_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ARSENIC_DUST.get()).unlockedBy(getHasName(ModItems.ARSENIC_DUST.get()), has(ModItems.ARSENIC_DUST.get()))
                .group("arsenic").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_ARSENIC.get(), 9).requires(ModBlocks.RAW_ARSENIC_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_ARSENIC_BLOCK.block().get()), has(ModBlocks.RAW_ARSENIC_BLOCK.block().get()))
                .group("arsenic").save(output,"megalosaio:raw_arsenic_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ARSENIC_INGOT.get(), 9).requires(ModBlocks.ARSENIC_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.ARSENIC_BLOCK.block().get()), has(ModBlocks.ARSENIC_BLOCK.block().get()))
                .group("arsenic").save(output, "megalosaio:aresnic_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ARSENIC_NUGGET.get(), 9).requires(ModItems.ARSENIC_INGOT.get()).unlockedBy(getHasName(ModItems.ARSENIC_INGOT.get()), has(ModItems.ARSENIC_INGOT.get()))
                .group("arsenic").save(output, "megalosaio:aresnic_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ARSENIC_DUST.get(), 9).requires(ModItems.ARSENIC_NUGGET.get()).unlockedBy(getHasName(ModItems.ARSENIC_NUGGET.get()), has(ModItems.ARSENIC_NUGGET.get()))
                .group("arsenic").save(output, "megalosaio:aresnic_dust_shapeless");

        //Antimony
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANTIMONY_BLOCK.block().get())
                .pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ANTIMONY_INGOT.get()).unlockedBy(getHasName(ModItems.ANTIMONY_INGOT.get()), has(ModItems.ANTIMONY_INGOT.get()))
                .group("antimony").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ANTIMONY_BLOCK.block().get())
                .pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_ANTIMONY.get()).unlockedBy(getHasName(ModItems.RAW_ANTIMONY.get()), has(ModItems.RAW_ANTIMONY.get()))
                .group("antimony").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ANTIMONY_INGOT.get())
                .pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ANTIMONY_NUGGET.get()).unlockedBy(getHasName(ModItems.ANTIMONY_NUGGET.get()), has(ModItems.ANTIMONY_NUGGET.get()))
                .group("antimony").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ANTIMONY_NUGGET.get())
                .pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ANTIMONY_DUST.get()).unlockedBy(getHasName(ModItems.ANTIMONY_DUST.get()), has(ModItems.ANTIMONY_DUST.get()))
                .group("antimony").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_ANTIMONY.get(), 9).requires(ModBlocks.RAW_ANTIMONY_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_ANTIMONY_BLOCK.block().get()), has(ModBlocks.RAW_ANTIMONY_BLOCK.block().get()))
                .group("antimony").save(output,"megalosaio:raw_antimony_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ANTIMONY_INGOT.get(), 9).requires(ModBlocks.ANTIMONY_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.ANTIMONY_BLOCK.block().get()), has(ModBlocks.ANTIMONY_BLOCK.block().get()))
                .group("antimony").save(output, "megalosaio:antimony_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ANTIMONY_NUGGET.get(), 9).requires(ModItems.ANTIMONY_INGOT.get()).unlockedBy(getHasName(ModItems.ANTIMONY_INGOT.get()), has(ModItems.ANTIMONY_INGOT.get()))
                .group("antimony").save(output, "megalosaio:antimony_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ANTIMONY_DUST.get(), 9).requires(ModItems.ANTIMONY_NUGGET.get()).unlockedBy(getHasName(ModItems.ANTIMONY_NUGGET.get()), has(ModItems.ANTIMONY_NUGGET.get()))
                .group("antimony").save(output, "megalosaio:antimony_dust_shapeless");

        //Bismuth
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BISMUTH_INGOT.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_INGOT.get()), has(ModItems.BISMUTH_INGOT.get())).group("bismuth").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_BISMUTH_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_BISMUTH.get())
                .unlockedBy(getHasName(ModItems.RAW_BISMUTH.get()), has(ModItems.RAW_BISMUTH.get())).group("bismuth").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BISMUTH_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_NUGGET.get()), has(ModItems.BISMUTH_NUGGET.get())).group("bismuth").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BISMUTH_DUST.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_DUST.get()), has(ModItems.BISMUTH_DUST.get())).group("bismuth").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_BISMUTH.get(), 9).requires(ModBlocks.RAW_BISMUTH_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_BISMUTH_BLOCK.block().get())
                , has(ModBlocks.RAW_BISMUTH_BLOCK.block().get())).group("bismuth").save(output,"megalosaio:raw_bismuth_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BISMUTH_INGOT.get(), 9).requires(ModBlocks.BISMUTH_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.BISMUTH_BLOCK.block().get())
                , has(ModBlocks.BISMUTH_BLOCK.block().get())).group("bismuth").save(output, "megalosaio:bismuth_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BISMUTH_NUGGET.get(), 9).requires(ModItems.BISMUTH_INGOT.get()).unlockedBy(getHasName(ModItems.BISMUTH_INGOT.get()), has(ModItems.BISMUTH_INGOT.get()))
                .group("bismuth").save(output, "megalosaio:bismuth_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BISMUTH_DUST.get(), 9).requires(ModItems.BISMUTH_NUGGET.get()).unlockedBy(getHasName(ModItems.BISMUTH_NUGGET.get()), has(ModItems.BISMUTH_NUGGET.get()))
                .group("bismuth").save(output, "megalosaio:bismuth_dust_shapeless");

        //Gallium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GALLIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.GALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_INGOT.get()), has(ModItems.GALLIUM_INGOT.get())).group("gallium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_GALLIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_GALLIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_GALLIUM.get()), has(ModItems.RAW_GALLIUM.get())).group("gallium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.GALLIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.GALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_NUGGET.get()), has(ModItems.GALLIUM_NUGGET.get())).group("gallium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.GALLIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.GALLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_DUST.get()), has(ModItems.GALLIUM_DUST.get())).group("gallium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_GALLIUM.get(), 9).requires(ModBlocks.RAW_GALLIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_GALLIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_GALLIUM_BLOCK.block().get())).group("gallium").save(output,"megalosaio:raw_gallium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.GALLIUM_INGOT.get(), 9).requires(ModBlocks.GALLIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.GALLIUM_BLOCK.block().get())
                , has(ModBlocks.GALLIUM_BLOCK.block().get())).group("gallium").save(output, "megalosaio:gallium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.GALLIUM_NUGGET.get(), 9).requires(ModItems.GALLIUM_INGOT.get()).unlockedBy(getHasName(ModItems.GALLIUM_INGOT.get()), has(ModItems.GALLIUM_INGOT.get()))
                .group("gallium").save(output, "megalosaio:gallium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.GALLIUM_DUST.get(), 9).requires(ModItems.GALLIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.GALLIUM_NUGGET.get()), has(ModItems.GALLIUM_NUGGET.get()))
                .group("gallium").save(output, "megalosaio:gallium_dust_shapeless");

        //Hafnium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAFNIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.HAFNIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_INGOT.get()), has(ModItems.HAFNIUM_INGOT.get())).group("hafnium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_HAFNIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_HAFNIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_HAFNIUM.get()), has(ModItems.RAW_HAFNIUM.get())).group("hafnium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.HAFNIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.HAFNIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_NUGGET.get()), has(ModItems.HAFNIUM_NUGGET.get())).group("hafnium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.HAFNIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.HAFNIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_DUST.get()), has(ModItems.HAFNIUM_DUST.get())).group("hafnium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_HAFNIUM.get(), 9).requires(ModBlocks.RAW_HAFNIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_HAFNIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_HAFNIUM_BLOCK.block().get())).group("hafnium").save(output,"megalosaio:raw_hafnium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get(), 9).requires(ModBlocks.HAFNIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.HAFNIUM_BLOCK.block().get())
                , has(ModBlocks.HAFNIUM_BLOCK.block().get())).group("hafnium").save(output, "megalosaio:hafnium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.HAFNIUM_NUGGET.get(), 9).requires(ModItems.HAFNIUM_INGOT.get()).unlockedBy(getHasName(ModItems.HAFNIUM_INGOT.get()), has(ModItems.HAFNIUM_INGOT.get()))
                .group("hafnium").save(output, "megalosaio:hafnium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.HAFNIUM_DUST.get(), 9).requires(ModItems.HAFNIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.HAFNIUM_NUGGET.get()), has(ModItems.HAFNIUM_NUGGET.get()))
                .group("hafnium").save(output, "megalosaio:hafnium_dust_shapeless");

//Indium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.INDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.INDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.INDIUM_INGOT.get()), has(ModItems.INDIUM_INGOT.get())).group("indium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_INDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_INDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_INDIUM.get()), has(ModItems.RAW_INDIUM.get())).group("indium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.INDIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.INDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.INDIUM_NUGGET.get()), has(ModItems.INDIUM_NUGGET.get())).group("indium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.INDIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.INDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.INDIUM_DUST.get()), has(ModItems.INDIUM_DUST.get())).group("indium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_INDIUM.get(), 9).requires(ModBlocks.RAW_INDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_INDIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_INDIUM_BLOCK.block().get())).group("indium").save(output,"megalosaio:raw_indium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.INDIUM_INGOT.get(), 9).requires(ModBlocks.INDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.INDIUM_BLOCK.block().get())
                , has(ModBlocks.INDIUM_BLOCK.block().get())).group("indium").save(output, "megalosaio:indium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.INDIUM_NUGGET.get(), 9).requires(ModItems.INDIUM_INGOT.get()).unlockedBy(getHasName(ModItems.INDIUM_INGOT.get()), has(ModItems.INDIUM_INGOT.get()))
                .group("indium").save(output, "megalosaio:indium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.INDIUM_DUST.get(), 9).requires(ModItems.INDIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.INDIUM_NUGGET.get()), has(ModItems.INDIUM_NUGGET.get()))
                .group("indium").save(output, "megalosaio:indium_dust_shapeless");

//Iridium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRIDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.IRIDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_INGOT.get()), has(ModItems.IRIDIUM_INGOT.get())).group("iridium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_IRIDIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_IRIDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_IRIDIUM.get()), has(ModItems.RAW_IRIDIUM.get())).group("iridium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.IRIDIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.IRIDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_NUGGET.get()), has(ModItems.IRIDIUM_NUGGET.get())).group("iridium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.IRIDIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.IRIDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_DUST.get()), has(ModItems.IRIDIUM_DUST.get())).group("iridium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_IRIDIUM.get(), 9).requires(ModBlocks.RAW_IRIDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_IRIDIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_IRIDIUM_BLOCK.block().get())).group("iridium").save(output,"megalosaio:raw_iridium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 9).requires(ModBlocks.IRIDIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.IRIDIUM_BLOCK.block().get())
                , has(ModBlocks.IRIDIUM_BLOCK.block().get())).group("iridium").save(output, "megalosaio:iridium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_NUGGET.get(), 9).requires(ModItems.IRIDIUM_INGOT.get()).unlockedBy(getHasName(ModItems.IRIDIUM_INGOT.get()), has(ModItems.IRIDIUM_INGOT.get()))
                .group("iridium").save(output, "megalosaio:iridium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_DUST.get(), 9).requires(ModItems.IRIDIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.IRIDIUM_NUGGET.get()), has(ModItems.IRIDIUM_NUGGET.get()))
                .group("iridium").save(output, "megalosaio:iridium_dust_shapeless");

//Molybdenum
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOLYBDENUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MOLYBDENUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_INGOT.get()), has(ModItems.MOLYBDENUM_INGOT.get())).group("molybdenum").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MOLYBDENUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_MOLYBDENUM.get())
                .unlockedBy(getHasName(ModItems.RAW_MOLYBDENUM.get()), has(ModItems.RAW_MOLYBDENUM.get())).group("molybdenum").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MOLYBDENUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MOLYBDENUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_NUGGET.get()), has(ModItems.MOLYBDENUM_NUGGET.get())).group("molybdenum").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MOLYBDENUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.MOLYBDENUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_DUST.get()), has(ModItems.MOLYBDENUM_DUST.get())).group("molybdenum").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_MOLYBDENUM.get(), 9).requires(ModBlocks.RAW_MOLYBDENUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_MOLYBDENUM_BLOCK.block().get())
                , has(ModBlocks.RAW_MOLYBDENUM_BLOCK.block().get())).group("molybdenum").save(output,"megalosaio:raw_molybdenum_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(), 9).requires(ModBlocks.MOLYBDENUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.MOLYBDENUM_BLOCK.block().get())
                , has(ModBlocks.MOLYBDENUM_BLOCK.block().get())).group("molybdenum").save(output, "megalosaio:molybdenum_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MOLYBDENUM_NUGGET.get(), 9).requires(ModItems.MOLYBDENUM_INGOT.get()).unlockedBy(getHasName(ModItems.MOLYBDENUM_INGOT.get()), has(ModItems.MOLYBDENUM_INGOT.get()))
                .group("molybdenum").save(output, "megalosaio:molybdenum_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.MOLYBDENUM_DUST.get(), 9).requires(ModItems.MOLYBDENUM_NUGGET.get()).unlockedBy(getHasName(ModItems.MOLYBDENUM_NUGGET.get()), has(ModItems.MOLYBDENUM_NUGGET.get()))
                .group("molybdenum").save(output, "megalosaio:molybdenum_dust_shapeless");

//Cinnabar
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CINNABAR_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CINNABAR_INGOT.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_INGOT.get()), has(ModItems.CINNABAR_INGOT.get())).group("cinnabar").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CINNABAR_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_CINNABAR.get())
                .unlockedBy(getHasName(ModItems.RAW_CINNABAR.get()), has(ModItems.RAW_CINNABAR.get())).group("cinnabar").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CINNABAR_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CINNABAR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_NUGGET.get()), has(ModItems.CINNABAR_NUGGET.get())).group("cinnabar").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CINNABAR_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.CINNABAR_DUST.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_DUST.get()), has(ModItems.CINNABAR_DUST.get())).group("cinnabar").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_CINNABAR.get(), 9).requires(ModBlocks.RAW_CINNABAR_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_CINNABAR_BLOCK.block().get())
                , has(ModBlocks.RAW_CINNABAR_BLOCK.block().get())).group("cinnabar").save(output,"megalosaio:raw_cinnabar_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CINNABAR_INGOT.get(), 9).requires(ModBlocks.CINNABAR_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.CINNABAR_BLOCK.block().get())
                , has(ModBlocks.CINNABAR_BLOCK.block().get())).group("cinnabar").save(output, "megalosaio:cinnabar_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CINNABAR_NUGGET.get(), 9).requires(ModItems.CINNABAR_INGOT.get()).unlockedBy(getHasName(ModItems.CINNABAR_INGOT.get()), has(ModItems.CINNABAR_INGOT.get()))
                .group("cinnabar").save(output, "megalosaio:cinnabar_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.CINNABAR_DUST.get(), 9).requires(ModItems.CINNABAR_NUGGET.get()).unlockedBy(getHasName(ModItems.CINNABAR_NUGGET.get()), has(ModItems.CINNABAR_NUGGET.get()))
                .group("cinnabar").save(output, "megalosaio:cinnabar_dust_shapeless");

//Osmium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OSMIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.OSMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_INGOT.get()), has(ModItems.OSMIUM_INGOT.get())).group("osmium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_OSMIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_OSMIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_OSMIUM.get()), has(ModItems.RAW_OSMIUM.get())).group("osmium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.OSMIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.OSMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_NUGGET.get()), has(ModItems.OSMIUM_NUGGET.get())).group("osmium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.OSMIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.OSMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_DUST.get()), has(ModItems.OSMIUM_DUST.get())).group("osmium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_OSMIUM.get(), 9).requires(ModBlocks.RAW_OSMIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_OSMIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_OSMIUM_BLOCK.block().get())).group("osmium").save(output,"megalosaio:raw_osmium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 9).requires(ModBlocks.OSMIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.OSMIUM_BLOCK.block().get())
                , has(ModBlocks.OSMIUM_BLOCK.block().get())).group("osmium").save(output, "megalosaio:osmium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.OSMIUM_NUGGET.get(), 9).requires(ModItems.OSMIUM_INGOT.get()).unlockedBy(getHasName(ModItems.OSMIUM_INGOT.get()), has(ModItems.OSMIUM_INGOT.get()))
                .group("osmium").save(output, "megalosaio:osmium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.OSMIUM_DUST.get(), 9).requires(ModItems.OSMIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.OSMIUM_NUGGET.get()), has(ModItems.OSMIUM_NUGGET.get()))
                .group("osmium").save(output, "megalosaio:osmium_dust_shapeless");

//Palladium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALLADIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PALLADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_INGOT.get()), has(ModItems.PALLADIUM_INGOT.get())).group("palladium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_PALLADIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_PALLADIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_PALLADIUM.get()), has(ModItems.RAW_PALLADIUM.get())).group("palladium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.PALLADIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PALLADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_NUGGET.get()), has(ModItems.PALLADIUM_NUGGET.get())).group("palladium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.PALLADIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PALLADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_DUST.get()), has(ModItems.PALLADIUM_DUST.get())).group("palladium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_PALLADIUM.get(), 9).requires(ModBlocks.RAW_PALLADIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_PALLADIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_PALLADIUM_BLOCK.block().get())).group("palladium").save(output,"megalosaio:raw_palladium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 9).requires(ModBlocks.PALLADIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.PALLADIUM_BLOCK.block().get())
                , has(ModBlocks.PALLADIUM_BLOCK.block().get())).group("palladium").save(output, "megalosaio:palladium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_NUGGET.get(), 9).requires(ModItems.PALLADIUM_INGOT.get()).unlockedBy(getHasName(ModItems.PALLADIUM_INGOT.get()), has(ModItems.PALLADIUM_INGOT.get()))
                .group("palladium").save(output, "megalosaio:palladium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_DUST.get(), 9).requires(ModItems.PALLADIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.PALLADIUM_NUGGET.get()), has(ModItems.PALLADIUM_NUGGET.get()))
                .group("palladium").save(output, "megalosaio:palladium_dust_shapeless");

//Platinum
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATINUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get())).group("platinum").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_PLATINUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_PLATINUM.get())
                .unlockedBy(getHasName(ModItems.RAW_PLATINUM.get()), has(ModItems.RAW_PLATINUM.get())).group("platinum").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PLATINUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_NUGGET.get()), has(ModItems.PLATINUM_NUGGET.get())).group("platinum").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PLATINUM_DUST.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_DUST.get()), has(ModItems.PLATINUM_DUST.get())).group("platinum").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_PLATINUM.get(), 9).requires(ModBlocks.RAW_PLATINUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_PLATINUM_BLOCK.block().get())
                , has(ModBlocks.RAW_PLATINUM_BLOCK.block().get())).group("platinum").save(output,"megalosaio:raw_platinum_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 9).requires(ModBlocks.PLATINUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.PLATINUM_BLOCK.block().get())
                , has(ModBlocks.PLATINUM_BLOCK.block().get())).group("platinum").save(output, "megalosaio:platinum_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET.get(), 9).requires(ModItems.PLATINUM_INGOT.get()).unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .group("platinum").save(output, "megalosaio:platinum_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PLATINUM_DUST.get(), 9).requires(ModItems.PLATINUM_NUGGET.get()).unlockedBy(getHasName(ModItems.PLATINUM_NUGGET.get()), has(ModItems.PLATINUM_NUGGET.get()))
                .group("platinum").save(output, "megalosaio:platinum_dust_shapeless");

//Tantalum
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TANTALUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TANTALUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_INGOT.get()), has(ModItems.TANTALUM_INGOT.get())).group("tantalum").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TANTALUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_TANTALUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TANTALUM.get()), has(ModItems.RAW_TANTALUM.get())).group("tantalum").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TANTALUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TANTALUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_NUGGET.get()), has(ModItems.TANTALUM_NUGGET.get())).group("tantalum").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TANTALUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TANTALUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_DUST.get()), has(ModItems.TANTALUM_DUST.get())).group("tantalum").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_TANTALUM.get(), 9).requires(ModBlocks.RAW_TANTALUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_TANTALUM_BLOCK.block().get())
                , has(ModBlocks.RAW_TANTALUM_BLOCK.block().get())).group("tantalum").save(output,"megalosaio:raw_tantalum_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get(), 9).requires(ModBlocks.TANTALUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.TANTALUM_BLOCK.block().get())
                , has(ModBlocks.TANTALUM_BLOCK.block().get())).group("tantalum").save(output, "megalosaio:tantalum_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TANTALUM_NUGGET.get(), 9).requires(ModItems.TANTALUM_INGOT.get()).unlockedBy(getHasName(ModItems.TANTALUM_INGOT.get()), has(ModItems.TANTALUM_INGOT.get()))
                .group("tantalum").save(output, "megalosaio:tantalum_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TANTALUM_DUST.get(), 9).requires(ModItems.TANTALUM_NUGGET.get()).unlockedBy(getHasName(ModItems.TANTALUM_NUGGET.get()), has(ModItems.TANTALUM_NUGGET.get()))
                .group("tantalum").save(output, "megalosaio:tantalum_dust_shapeless");

//Thallium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALLIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.THALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_INGOT.get()), has(ModItems.THALLIUM_INGOT.get())).group("thallium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_THALLIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_THALLIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_THALLIUM.get()), has(ModItems.RAW_THALLIUM.get())).group("thallium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.THALLIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.THALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_NUGGET.get()), has(ModItems.THALLIUM_NUGGET.get())).group("thallium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.THALLIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.THALLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_DUST.get()), has(ModItems.THALLIUM_DUST.get())).group("thallium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_THALLIUM.get(), 9).requires(ModBlocks.RAW_THALLIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_THALLIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_THALLIUM_BLOCK.block().get())).group("thallium").save(output,"megalosaio:raw_thallium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.THALLIUM_INGOT.get(), 9).requires(ModBlocks.THALLIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.THALLIUM_BLOCK.block().get())
                , has(ModBlocks.THALLIUM_BLOCK.block().get())).group("thallium").save(output, "megalosaio:thallium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.THALLIUM_NUGGET.get(), 9).requires(ModItems.THALLIUM_INGOT.get()).unlockedBy(getHasName(ModItems.THALLIUM_INGOT.get()), has(ModItems.THALLIUM_INGOT.get()))
                .group("thallium").save(output, "megalosaio:thallium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.THALLIUM_DUST.get(), 9).requires(ModItems.THALLIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.THALLIUM_NUGGET.get()), has(ModItems.THALLIUM_NUGGET.get()))
                .group("thallium").save(output, "megalosaio:thallium_dust_shapeless");

//Tungsten
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUNGSTEN_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get())).group("tungsten").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TUNGSTEN_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_TUNGSTEN.get())
                .unlockedBy(getHasName(ModItems.RAW_TUNGSTEN.get()), has(ModItems.RAW_TUNGSTEN.get())).group("tungsten").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TUNGSTEN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_NUGGET.get()), has(ModItems.TUNGSTEN_NUGGET.get())).group("tungsten").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_DUST.get()), has(ModItems.TUNGSTEN_DUST.get())).group("tungsten").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_TUNGSTEN.get(), 9).requires(ModBlocks.RAW_TUNGSTEN_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_TUNGSTEN_BLOCK.block().get())
                , has(ModBlocks.RAW_TUNGSTEN_BLOCK.block().get())).group("tungsten").save(output,"megalosaio:raw_tungsten_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 9).requires(ModBlocks.TUNGSTEN_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.TUNGSTEN_BLOCK.block().get())
                , has(ModBlocks.TUNGSTEN_BLOCK.block().get())).group("tungsten").save(output, "megalosaio:tungsten_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_NUGGET.get(), 9).requires(ModItems.TUNGSTEN_INGOT.get()).unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .group("tungsten").save(output, "megalosaio:tungsten_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_DUST.get(), 9).requires(ModItems.TUNGSTEN_NUGGET.get()).unlockedBy(getHasName(ModItems.TUNGSTEN_NUGGET.get()), has(ModItems.TUNGSTEN_NUGGET.get()))
                .group("tungsten").save(output, "megalosaio:tungsten_dust_shapeless");

//Vanadium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VANADIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.VANADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_INGOT.get()), has(ModItems.VANADIUM_INGOT.get())).group("vanadium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_VANADIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_VANADIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_VANADIUM.get()), has(ModItems.RAW_VANADIUM.get())).group("vanadium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.VANADIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.VANADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_NUGGET.get()), has(ModItems.VANADIUM_NUGGET.get())).group("vanadium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.VANADIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.VANADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_DUST.get()), has(ModItems.VANADIUM_DUST.get())).group("vanadium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_VANADIUM.get(), 9).requires(ModBlocks.RAW_VANADIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_VANADIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_VANADIUM_BLOCK.block().get())).group("vanadium").save(output,"megalosaio:raw_vanadium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get(), 9).requires(ModBlocks.VANADIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.VANADIUM_BLOCK.block().get())
                , has(ModBlocks.VANADIUM_BLOCK.block().get())).group("vanadium").save(output, "megalosaio:vanadium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.VANADIUM_NUGGET.get(), 9).requires(ModItems.VANADIUM_INGOT.get()).unlockedBy(getHasName(ModItems.VANADIUM_INGOT.get()), has(ModItems.VANADIUM_INGOT.get()))
                .group("vanadium").save(output, "megalosaio:vanadium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.VANADIUM_DUST.get(), 9).requires(ModItems.VANADIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.VANADIUM_NUGGET.get()), has(ModItems.VANADIUM_NUGGET.get()))
                .group("vanadium").save(output, "megalosaio:vanadium_dust_shapeless");

//Zirconium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIRCONIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ZIRCONIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_INGOT.get()), has(ModItems.ZIRCONIUM_INGOT.get())).group("zirconium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ZIRCONIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_ZIRCONIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_ZIRCONIUM.get()), has(ModItems.RAW_ZIRCONIUM.get())).group("zirconium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ZIRCONIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ZIRCONIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_NUGGET.get()), has(ModItems.ZIRCONIUM_NUGGET.get())).group("zirconium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.ZIRCONIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.ZIRCONIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_DUST.get()), has(ModItems.ZIRCONIUM_DUST.get())).group("zirconium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_ZIRCONIUM.get(), 9).requires(ModBlocks.RAW_ZIRCONIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_ZIRCONIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_ZIRCONIUM_BLOCK.block().get())).group("zirconium").save(output,"megalosaio:raw_zirconium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(), 9).requires(ModBlocks.ZIRCONIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.ZIRCONIUM_BLOCK.block().get())
                , has(ModBlocks.ZIRCONIUM_BLOCK.block().get())).group("zirconium").save(output, "megalosaio:zirconium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ZIRCONIUM_NUGGET.get(), 9).requires(ModItems.ZIRCONIUM_INGOT.get()).unlockedBy(getHasName(ModItems.ZIRCONIUM_INGOT.get()), has(ModItems.ZIRCONIUM_INGOT.get()))
                .group("zirconium").save(output, "megalosaio:zirconium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.ZIRCONIUM_DUST.get(), 9).requires(ModItems.ZIRCONIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.ZIRCONIUM_NUGGET.get()), has(ModItems.ZIRCONIUM_NUGGET.get()))
                .group("zirconium").save(output, "megalosaio:zirconium_dust_shapeless");


//Beryllium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BERYLLIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BERYLLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_INGOT.get()), has(ModItems.BERYLLIUM_INGOT.get())).group("beryllium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_BERYLLIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_BERYLLIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_BERYLLIUM.get()), has(ModItems.RAW_BERYLLIUM.get())).group("beryllium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BERYLLIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BERYLLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_NUGGET.get()), has(ModItems.BERYLLIUM_NUGGET.get())).group("beryllium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BERYLLIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.BERYLLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_DUST.get()), has(ModItems.BERYLLIUM_DUST.get())).group("beryllium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_BERYLLIUM.get(), 9).requires(ModBlocks.RAW_BERYLLIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_BERYLLIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_BERYLLIUM_BLOCK.block().get())).group("beryllium").save(output,"megalosaio:raw_beryllium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BERYLLIUM_INGOT.get(), 9).requires(ModBlocks.BERYLLIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.BERYLLIUM_BLOCK.block().get())
                , has(ModBlocks.BERYLLIUM_BLOCK.block().get())).group("beryllium").save(output, "megalosaio:beryllium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BERYLLIUM_NUGGET.get(), 9).requires(ModItems.BERYLLIUM_INGOT.get()).unlockedBy(getHasName(ModItems.BERYLLIUM_INGOT.get()), has(ModItems.BERYLLIUM_INGOT.get()))
                .group("beryllium").save(output, "megalosaio:beryllium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.BERYLLIUM_DUST.get(), 9).requires(ModItems.BERYLLIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.BERYLLIUM_NUGGET.get()), has(ModItems.BERYLLIUM_NUGGET.get()))
                .group("beryllium").save(output, "megalosaio:beryllium_dust_shapeless");

//Germanium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GERMANIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.GERMANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_INGOT.get()), has(ModItems.GERMANIUM_INGOT.get())).group("germanium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_GERMANIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_GERMANIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_GERMANIUM.get()), has(ModItems.RAW_GERMANIUM.get())).group("germanium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.GERMANIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.GERMANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_NUGGET.get()), has(ModItems.GERMANIUM_NUGGET.get())).group("germanium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.GERMANIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.GERMANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_DUST.get()), has(ModItems.GERMANIUM_DUST.get())).group("germanium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_GERMANIUM.get(), 9).requires(ModBlocks.RAW_GERMANIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_GERMANIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_GERMANIUM_BLOCK.block().get())).group("germanium").save(output,"megalosaio:raw_germanium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.GERMANIUM_INGOT.get(), 9).requires(ModBlocks.GERMANIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.GERMANIUM_BLOCK.block().get())
                , has(ModBlocks.GERMANIUM_BLOCK.block().get())).group("germanium").save(output, "megalosaio:germanium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.GERMANIUM_NUGGET.get(), 9).requires(ModItems.GERMANIUM_INGOT.get()).unlockedBy(getHasName(ModItems.GERMANIUM_INGOT.get()), has(ModItems.GERMANIUM_INGOT.get()))
                .group("germanium").save(output, "megalosaio:germanium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.GERMANIUM_DUST.get(), 9).requires(ModItems.GERMANIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.GERMANIUM_NUGGET.get()), has(ModItems.GERMANIUM_NUGGET.get()))
                .group("germanium").save(output, "megalosaio:germanium_dust_shapeless");

//Phosphorus
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PHOSPHORUS_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PHOSPHORUS_INGOT.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_INGOT.get()), has(ModItems.PHOSPHORUS_INGOT.get())).group("phosphorus").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_PHOSPHORUS_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_PHOSPHORUS.get())
                .unlockedBy(getHasName(ModItems.RAW_PHOSPHORUS.get()), has(ModItems.RAW_PHOSPHORUS.get())).group("phosphorus").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.PHOSPHORUS_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PHOSPHORUS_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_NUGGET.get()), has(ModItems.PHOSPHORUS_NUGGET.get())).group("phosphorus").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.PHOSPHORUS_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.PHOSPHORUS_DUST.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_DUST.get()), has(ModItems.PHOSPHORUS_DUST.get())).group("phosphorus").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_PHOSPHORUS.get(), 9).requires(ModBlocks.RAW_PHOSPHORUS_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_PHOSPHORUS_BLOCK.block().get())
                , has(ModBlocks.RAW_PHOSPHORUS_BLOCK.block().get())).group("phosphorus").save(output,"megalosaio:raw_phosphorus_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PHOSPHORUS_INGOT.get(), 9).requires(ModBlocks.PHOSPHORUS_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.PHOSPHORUS_BLOCK.block().get())
                , has(ModBlocks.PHOSPHORUS_BLOCK.block().get())).group("phosphorus").save(output, "megalosaio:phosphorus_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PHOSPHORUS_NUGGET.get(), 9).requires(ModItems.PHOSPHORUS_INGOT.get()).unlockedBy(getHasName(ModItems.PHOSPHORUS_INGOT.get()), has(ModItems.PHOSPHORUS_INGOT.get()))
                .group("phosphorus").save(output, "megalosaio:phosphorus_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.PHOSPHORUS_DUST.get(), 9).requires(ModItems.PHOSPHORUS_NUGGET.get()).unlockedBy(getHasName(ModItems.PHOSPHORUS_NUGGET.get()), has(ModItems.PHOSPHORUS_NUGGET.get()))
                .group("phosphorus").save(output, "megalosaio:phosphorus_dust_shapeless");

//Rhenium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RHENIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RHENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_INGOT.get()), has(ModItems.RHENIUM_INGOT.get())).group("rhenium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RHENIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_RHENIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RHENIUM.get()), has(ModItems.RAW_RHENIUM.get())).group("rhenium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RHENIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RHENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_NUGGET.get()), has(ModItems.RHENIUM_NUGGET.get())).group("rhenium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RHENIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RHENIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_DUST.get()), has(ModItems.RHENIUM_DUST.get())).group("rhenium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_RHENIUM.get(), 9).requires(ModBlocks.RAW_RHENIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_RHENIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_RHENIUM_BLOCK.block().get())).group("rhenium").save(output,"megalosaio:raw_rhenium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get(), 9).requires(ModBlocks.RHENIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RHENIUM_BLOCK.block().get())
                , has(ModBlocks.RHENIUM_BLOCK.block().get())).group("rhenium").save(output, "megalosaio:rhenium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RHENIUM_NUGGET.get(), 9).requires(ModItems.RHENIUM_INGOT.get()).unlockedBy(getHasName(ModItems.RHENIUM_INGOT.get()), has(ModItems.RHENIUM_INGOT.get()))
                .group("rhenium").save(output, "megalosaio:rhenium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RHENIUM_DUST.get(), 9).requires(ModItems.RHENIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.RHENIUM_NUGGET.get()), has(ModItems.RHENIUM_NUGGET.get()))
                .group("rhenium").save(output, "megalosaio:rhenium_dust_shapeless");


//Rhodium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RHODIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RHODIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_INGOT.get()), has(ModItems.RHODIUM_INGOT.get())).group("rhodium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RHODIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_RHODIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RHODIUM.get()), has(ModItems.RAW_RHODIUM.get())).group("rhodium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RHODIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RHODIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_NUGGET.get()), has(ModItems.RHODIUM_NUGGET.get())).group("rhodium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RHODIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RHODIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_DUST.get()), has(ModItems.RHODIUM_DUST.get())).group("rhodium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_RHODIUM.get(), 9).requires(ModBlocks.RAW_RHODIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_RHODIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_RHODIUM_BLOCK.block().get())).group("rhodium").save(output,"megalosaio:raw_rhodium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get(), 9).requires(ModBlocks.RHODIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RHODIUM_BLOCK.block().get())
                , has(ModBlocks.RHODIUM_BLOCK.block().get())).group("rhodium").save(output, "megalosaio:rhodium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RHODIUM_NUGGET.get(), 9).requires(ModItems.RHODIUM_INGOT.get()).unlockedBy(getHasName(ModItems.RHODIUM_INGOT.get()), has(ModItems.RHODIUM_INGOT.get()))
                .group("rhodium").save(output, "megalosaio:rhodium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RHODIUM_DUST.get(), 9).requires(ModItems.RHODIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.RHODIUM_NUGGET.get()), has(ModItems.RHODIUM_NUGGET.get()))
                .group("rhodium").save(output, "megalosaio:rhodium_dust_shapeless");

//Ruthenium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUTHENIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RUTHENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_INGOT.get()), has(ModItems.RUTHENIUM_INGOT.get())).group("ruthenium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_RUTHENIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_RUTHENIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RUTHENIUM.get()), has(ModItems.RAW_RUTHENIUM.get())).group("ruthenium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUTHENIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RUTHENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_NUGGET.get()), has(ModItems.RUTHENIUM_NUGGET.get())).group("ruthenium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUTHENIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RUTHENIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_DUST.get()), has(ModItems.RUTHENIUM_DUST.get())).group("ruthenium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_RUTHENIUM.get(), 9).requires(ModBlocks.RAW_RUTHENIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_RUTHENIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_RUTHENIUM_BLOCK.block().get())).group("ruthenium").save(output,"megalosaio:raw_ruthenium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get(), 9).requires(ModBlocks.RUTHENIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RUTHENIUM_BLOCK.block().get())
                , has(ModBlocks.RUTHENIUM_BLOCK.block().get())).group("ruthenium").save(output, "megalosaio:ruthenium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RUTHENIUM_NUGGET.get(), 9).requires(ModItems.RUTHENIUM_INGOT.get()).unlockedBy(getHasName(ModItems.RUTHENIUM_INGOT.get()), has(ModItems.RUTHENIUM_INGOT.get()))
                .group("ruthenium").save(output, "megalosaio:ruthenium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.RUTHENIUM_DUST.get(), 9).requires(ModItems.RUTHENIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.RUTHENIUM_NUGGET.get()), has(ModItems.RUTHENIUM_NUGGET.get()))
                .group("ruthenium").save(output, "megalosaio:ruthenium_dust_shapeless");

//Selenium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SELENIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SELENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_INGOT.get()), has(ModItems.SELENIUM_INGOT.get())).group("selenium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SELENIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_SELENIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_SELENIUM.get()), has(ModItems.RAW_SELENIUM.get())).group("selenium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SELENIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SELENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_NUGGET.get()), has(ModItems.SELENIUM_NUGGET.get())).group("selenium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SELENIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.SELENIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_DUST.get()), has(ModItems.SELENIUM_DUST.get())).group("selenium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_SELENIUM.get(), 9).requires(ModBlocks.RAW_SELENIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_SELENIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_SELENIUM_BLOCK.block().get())).group("selenium").save(output,"megalosaio:raw_selenium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SELENIUM_INGOT.get(), 9).requires(ModBlocks.SELENIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.SELENIUM_BLOCK.block().get())
                , has(ModBlocks.SELENIUM_BLOCK.block().get())).group("selenium").save(output, "megalosaio:selenium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SELENIUM_NUGGET.get(), 9).requires(ModItems.SELENIUM_INGOT.get()).unlockedBy(getHasName(ModItems.SELENIUM_INGOT.get()), has(ModItems.SELENIUM_INGOT.get()))
                .group("selenium").save(output, "megalosaio:selenium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.SELENIUM_DUST.get(), 9).requires(ModItems.SELENIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.SELENIUM_NUGGET.get()), has(ModItems.SELENIUM_NUGGET.get()))
                .group("selenium").save(output, "megalosaio:selenium_dust_shapeless");

//Technetium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TECHNETIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TECHNETIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_TECHNETIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TECHNETIUM.get()), has(ModItems.RAW_TECHNETIUM.get())).group("technetium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TECHNETIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_NUGGET.get()), has(ModItems.TECHNETIUM_NUGGET.get())).group("technetium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TECHNETIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_DUST.get()), has(ModItems.TECHNETIUM_DUST.get())).group("technetium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_TECHNETIUM.get(), 9).requires(ModBlocks.RAW_TECHNETIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_TECHNETIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_TECHNETIUM_BLOCK.block().get())).group("technetium").save(output,"megalosaio:raw_technetium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TECHNETIUM_INGOT.get(), 9).requires(ModBlocks.TECHNETIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.TECHNETIUM_BLOCK.block().get())
                , has(ModBlocks.TECHNETIUM_BLOCK.block().get())).group("technetium").save(output, "megalosaio:technetium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TECHNETIUM_NUGGET.get(), 9).requires(ModItems.TECHNETIUM_INGOT.get()).unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get()))
                .group("technetium").save(output, "megalosaio:technetium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TECHNETIUM_DUST.get(), 9).requires(ModItems.TECHNETIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.TECHNETIUM_NUGGET.get()), has(ModItems.TECHNETIUM_NUGGET.get()))
                .group("technetium").save(output, "megalosaio:technetium_dust_shapeless");

//Tellurium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TELLURIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TELLURIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_INGOT.get()), has(ModItems.TELLURIUM_INGOT.get())).group("tellurium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TELLURIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_TELLURIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TELLURIUM.get()), has(ModItems.RAW_TELLURIUM.get())).group("tellurium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TELLURIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TELLURIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_NUGGET.get()), has(ModItems.TELLURIUM_NUGGET.get())).group("tellurium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TELLURIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.TELLURIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_DUST.get()), has(ModItems.TELLURIUM_DUST.get())).group("tellurium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_TELLURIUM.get(), 9).requires(ModBlocks.RAW_TELLURIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_TELLURIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_TELLURIUM_BLOCK.block().get())).group("tellurium").save(output,"megalosaio:raw_tellurium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TELLURIUM_INGOT.get(), 9).requires(ModBlocks.TELLURIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.TELLURIUM_BLOCK.block().get())
                , has(ModBlocks.TELLURIUM_BLOCK.block().get())).group("tellurium").save(output, "megalosaio:tellurium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TELLURIUM_NUGGET.get(), 9).requires(ModItems.TELLURIUM_INGOT.get()).unlockedBy(getHasName(ModItems.TELLURIUM_INGOT.get()), has(ModItems.TELLURIUM_INGOT.get()))
                .group("tellurium").save(output, "megalosaio:tellurium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.TELLURIUM_DUST.get(), 9).requires(ModItems.TELLURIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.TELLURIUM_NUGGET.get()), has(ModItems.TELLURIUM_NUGGET.get()))
                .group("tellurium").save(output, "megalosaio:tellurium_dust_shapeless");

//Yttrium
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YTTRIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.YTTRIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_INGOT.get()), has(ModItems.YTTRIUM_INGOT.get())).group("yttrium").save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_YTTRIUM_BLOCK.block().get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.RAW_YTTRIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_YTTRIUM.get()), has(ModItems.RAW_YTTRIUM.get())).group("yttrium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.YTTRIUM_INGOT.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.YTTRIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_NUGGET.get()), has(ModItems.YTTRIUM_NUGGET.get())).group("yttrium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.YTTRIUM_NUGGET.get()).pattern("AAA").pattern("AAA").pattern("AAA").define('A', ModItems.YTTRIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_DUST.get()), has(ModItems.YTTRIUM_DUST.get())).group("yttrium").save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_YTTRIUM.get(), 9).requires(ModBlocks.RAW_YTTRIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.RAW_YTTRIUM_BLOCK.block().get())
                , has(ModBlocks.RAW_YTTRIUM_BLOCK.block().get())).group("yttrium").save(output,"megalosaio:raw_yttrium_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get(), 9).requires(ModBlocks.YTTRIUM_BLOCK.block().get()).unlockedBy(getHasName(ModBlocks.YTTRIUM_BLOCK.block().get())
                , has(ModBlocks.YTTRIUM_BLOCK.block().get())).group("yttrium").save(output, "megalosaio:yttrium_ingot_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.YTTRIUM_NUGGET.get(), 9).requires(ModItems.YTTRIUM_INGOT.get()).unlockedBy(getHasName(ModItems.YTTRIUM_INGOT.get()), has(ModItems.YTTRIUM_INGOT.get()))
                .group("yttrium").save(output, "megalosaio:yttrium_nugget_shapeless");

        shapeless(RecipeCategory.MISC, ModItems.YTTRIUM_DUST.get(), 9).requires(ModItems.YTTRIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.YTTRIUM_NUGGET.get()), has(ModItems.YTTRIUM_NUGGET.get()))
                .group("yttrium").save(output, "megalosaio:yttrium_dust_shapeless");

        //Aluminium Parts
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_AXEHEAD.get()).pattern("AAA").pattern("AA ").pattern("AA ").define('A', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_BLADE.get()).pattern(" A ").pattern(" A ").pattern(" A ").define('A', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_GUARD.get()).pattern("A A").pattern("AAA").pattern("A A").define('A', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_HILT.get()).pattern(" G ").pattern(" X ").pattern(" P ").define('G', ModItems.ALUMINIUM_INGOT.get())
                .define('X', ModItems.FABRIC_GRIP.get()).define('P', ModItems.ALUMINIUM_POMMEL.get()).unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_PICK.get()).pattern("AAA").pattern("  A").define('A', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_PLATE.get()).pattern("AAA").pattern("PPP").pattern("AAA").define('A', ModItems.ALUMINIUM_INGOT.get()).define('P', ModItems.ARMOUR_PADDING.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_POMMEL.get()).pattern(" A ").pattern("A A").pattern(" A ").define('A', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_SHOVELHEAD.get()).pattern(" A ").pattern("AAA").pattern("A A").define('A', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);

        //Silver Parts
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_AXEHEAD.get()).pattern("AAA").pattern("AA ").pattern("AA ").define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_BLADE.get()).pattern(" A ").pattern(" A ").pattern(" A ").define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_GUARD.get()).pattern("A A").pattern("AAA").pattern("A A").define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_HILT.get()).pattern(" G ").pattern(" X ").pattern(" P ").define('G', ModItems.SILVER_INGOT.get())
                .define('X', ModItems.FABRIC_GRIP.get()).define('P', ModItems.SILVER_POMMEL.get()).unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_PICK.get()).pattern("AAA").pattern("  A").define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_PLATE.get()).pattern("AAA").pattern("PPP").pattern("AAA").define('A', ModItems.SILVER_INGOT.get()).define('P', ModItems.ARMOUR_PADDING.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_POMMEL.get()).pattern(" A ").pattern("A A").pattern(" A ").define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_SHOVELHEAD.get()).pattern(" A ").pattern("AAA").pattern("A A").define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);

        //Technetium Parts
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_AXEHEAD.get()).pattern("AAA").pattern("AA ").pattern("AA ").define('A', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_BLADE.get()).pattern(" A ").pattern(" A ").pattern(" A ").define('A', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_GUARD.get()).pattern("A A").pattern("AAA").pattern("A A").define('A', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_HILT.get()).pattern(" G ").pattern(" X ").pattern(" P ").define('G', ModItems.TECHNETIUM_INGOT.get())
                .define('X', ModItems.FABRIC_GRIP.get()).define('P', ModItems.TECHNETIUM_POMMEL.get()).unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_PICK.get()).pattern("AAA").pattern("  A").define('A', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_PLATE.get()).pattern("AAA").pattern("PPP").pattern("AAA").define('A', ModItems.TECHNETIUM_INGOT.get()).define('P', ModItems.ARMOUR_PADDING.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_POMMEL.get()).pattern(" A ").pattern("A A").pattern(" A ").define('A', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_SHOVELHEAD.get()).pattern(" A ").pattern("AAA").pattern("A A").define('A', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);

        //Titanium Parts
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_AXEHEAD.get()).pattern("AAA").pattern("AA ").pattern("AA ").define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_BLADE.get()).pattern(" A ").pattern(" A ").pattern(" A ").define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_GUARD.get()).pattern("A A").pattern("AAA").pattern("A A").define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_HILT.get()).pattern(" G ").pattern(" X ").pattern(" P ").define('G', ModItems.TITANIUM_INGOT.get())
                .define('X', ModItems.FABRIC_GRIP.get()).define('P', ModItems.TITANIUM_POMMEL.get()).unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_PICK.get()).pattern("AAA").pattern("  A").define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_PLATE.get()).pattern("AAA").pattern("PPP").pattern("AAA").define('A', ModItems.TITANIUM_INGOT.get()).define('P', ModItems.ARMOUR_PADDING.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_POMMEL.get()).pattern(" A ").pattern("A A").pattern(" A ").define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_SHOVELHEAD.get()).pattern(" A ").pattern("AAA").pattern("A A").define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);


        //Extra Parts
        shaped(RecipeCategory.COMBAT, ModItems.FABRIC_STRAP.get(),9).pattern("WF").define('W', Blocks.WHITE_WOOL).define('F', Items.FLINT).unlockedBy(getHasName(Blocks.WHITE_WOOL),
                has(Blocks.WHITE_WOOL)).group("fabric").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.LEATHER_STRAP.get(),9).pattern("WF").define('W', Items.LEATHER).define('F', Items.FLINT).unlockedBy(getHasName(Items.LEATHER),
                has(Items.LEATHER)).group("leather").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.FABRIC_GRIP.get()).pattern("FSF").pattern("FSF").pattern("FSF").define('S', Items.STICK).define('F', ModItems.FABRIC_STRAP.get())
                .unlockedBy(getHasName(Blocks.WHITE_WOOL),has(Blocks.WHITE_WOOL)).group("fabric").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.LEATHER_GRIP.get()).pattern("LSL").pattern("LSL").pattern("LSL").define('L', Items.LEATHER).define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEATHER_STRAP.get()), has(Items.LEATHER)).group("leather").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ARMOUR_PADDING.get()).pattern("FLF").pattern("LFL").pattern("FLF").define('F', ModItems.FABRIC_STRAP.get()).define('L', ModItems.LEATHER_STRAP.get())
                .unlockedBy(getHasName(ModItems.ARMOUR_PADDING.get()), has(ModItems.ARMOUR_PADDING.get())).group("leather").save(output);

        //Armour
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_HELMET.get()).pattern("AAA").pattern("A A").define('A', ModItems.ALUMINIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_CHESTPLATE.get()).pattern("A A").pattern("AAA").pattern("AAA").define('A', ModItems.ALUMINIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_LEGGINGS.get()).pattern("AAA").pattern("A A").pattern("A A").define('A', ModItems.ALUMINIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.ALUMINIUM_BOOTS.get()).pattern("A A").pattern("A A").define('A', ModItems.ALUMINIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get())).group("aluminium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_HELMET.get()).pattern("AAA").pattern("A A").define('A', ModItems.SILVER_PLATE.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_CHESTPLATE.get()).pattern("A A").pattern("AAA").pattern("AAA").define('A', ModItems.SILVER_PLATE.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_LEGGINGS.get()).pattern("AAA").pattern("A A").pattern("A A").define('A', ModItems.SILVER_PLATE.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_BOOTS.get()).pattern("A A").pattern("A A").define('A', ModItems.SILVER_PLATE.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).group("silver").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_HELMET.get()).pattern("AAA").pattern("A A").define('A', ModItems.TECHNETIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_CHESTPLATE.get()).pattern("A A").pattern("AAA").pattern("AAA").define('A', ModItems.TECHNETIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_LEGGINGS.get()).pattern("AAA").pattern("A A").pattern("A A").define('A', ModItems.TECHNETIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TECHNETIUM_BOOTS.get()).pattern("A A").pattern("A A").define('A', ModItems.TECHNETIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get())).group("technetium").save(output);

        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_HELMET.get()).pattern("AAA").pattern("A A").define('A', ModItems.TITANIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_CHESTPLATE.get()).pattern("A A").pattern("AAA").pattern("AAA").define('A', ModItems.TITANIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_LEGGINGS.get()).pattern("AAA").pattern("A A").pattern("A A").define('A', ModItems.TITANIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);
        shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_BOOTS.get()).pattern("A A").pattern("A A").define('A', ModItems.TITANIUM_PLATE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).group("titanium").save(output);

        List<ItemLike> ALUMINIUM_ORE_SMELTABLES = List.of(ModBlocks.ALUMINIUM_ORE.block().get(), ModItems.RAW_ALUMINIUM.get());
        List<ItemLike> CALCIUM_ORE_SMELTABLES = List.of(ModBlocks.CALCIUM_ORE.block().get(), ModItems.RAW_CALCIUM.get());
        List<ItemLike> CHROMIUM_ORE_SMELTABLES = List.of(ModBlocks.CHROMIUM_ORE.block().get(), ModItems.RAW_CHROMIUM.get());
        List<ItemLike> LEAD_ORE_SMELTABLES = List.of(ModBlocks.LEAD_ORE.block().get(), ModItems.RAW_LEAD.get());
        List<ItemLike> MAGNESIUM_ORE_SMELTABLES = List.of(ModBlocks.MAGNESIUM_ORE.block().get(), ModItems.RAW_MAGNESIUM.get());
        List<ItemLike> MANGANESE_ORE_SMELTABLES = List.of(ModBlocks.MANGANESE_ORE.block().get(), ModItems.RAW_MANGANESE.get());
        List<ItemLike> NICKEL_ORE_SMELTABLES = List.of(ModBlocks.NICKEL_ORE.block().get(), ModItems.RAW_NICKEL.get());
        List<ItemLike> POTASSIUM_ORE_SMELTABLES = List.of(ModBlocks.POTASSIUM_ORE.block().get(), ModItems.RAW_POTASSIUM.get());
        List<ItemLike> SILICON_ORE_SMELTABLES = List.of(ModBlocks.SILICON_ORE.block().get(), ModItems.RAW_SILICON.get());
        List<ItemLike> SODIUM_ORE_SMELTABLES = List.of(ModBlocks.SODIUM_ORE.block().get(), ModItems.RAW_SODIUM.get());
        List<ItemLike> TIN_ORE_SMELTABLES = List.of(ModBlocks.TIN_ORE.block().get(), ModItems.RAW_TIN.get());
        List<ItemLike> TITANIUM_ORE_SMELTABLES = List.of(ModBlocks.TITANIUM_ORE.block().get(), ModItems.RAW_TITANIUM.get());
        List<ItemLike> ZINC_ORE_SMELTABLES = List.of(ModBlocks.ZINC_ORE.block().get(), ModItems.RAW_ZINC.get());

        List<ItemLike> BARIUM_ORE_SMELTABLES = List.of(ModBlocks.BARIUM_ORE.block().get(), ModItems.RAW_BARIUM.get());
        List<ItemLike> CADMIUM_ORE_SMELTABLES = List.of(ModBlocks.CADMIUM_ORE.block().get(), ModItems.RAW_CADMIUM.get());
        List<ItemLike> CAESIUM_ORE_SMELTABLES = List.of(ModBlocks.CAESIUM_ORE.block().get(), ModItems.RAW_CAESIUM.get());
        List<ItemLike> COBALT_ORE_SMELTABLES = List.of(ModBlocks.COBALT_ORE.block().get(), ModItems.RAW_COBALT.get());
        List<ItemLike> LITHIUM_ORE_SMELTABLES = List.of(ModBlocks.LITHIUM_ORE.block().get(), ModItems.RAW_LITHIUM.get());
        List<ItemLike> NIOBIUM_ORE_SMELTABLES = List.of(ModBlocks.NIOBIUM_ORE.block().get(), ModItems.RAW_NIOBIUM.get());
        List<ItemLike> RUBIDIUM_ORE_SMELTABLES = List.of(ModBlocks.RUBIDIUM_ORE.block().get(), ModItems.RAW_RUBIDIUM.get());
        List<ItemLike> SILVER_ORE_SMELTABLES = List.of(ModBlocks.SILVER_ORE.block().get(), ModItems.RAW_SILVER.get());
        List<ItemLike> SCANDIUM_ORE_SMELTABLES = List.of(ModBlocks.SCANDIUM_ORE.block().get(), ModItems.RAW_SCANDIUM.get());
        List<ItemLike> STRONTIUM_ORE_SMELTABLES = List.of(ModBlocks.STRONTIUM_ORE.block().get(), ModItems.RAW_STRONTIUM.get());

        List<ItemLike> ARSENIC_ORE_SMELTABLES = List.of(ModBlocks.ARSENIC_ORE.block().get(), ModItems.RAW_ARSENIC.get());
        List<ItemLike> BISMUTH_ORE_SMELTABLES = List.of(ModBlocks.BISMUTH_ORE.block().get(), ModItems.RAW_BISMUTH.get());
        List<ItemLike> GALLIUM_ORE_SMELTABLES = List.of(ModBlocks.GALLIUM_ORE.block().get(), ModItems.RAW_GALLIUM.get());
        List<ItemLike> HAFNIUM_ORE_SMELTABLES = List.of(ModBlocks.HAFNIUM_ORE.block().get(), ModItems.RAW_HAFNIUM.get());
        List<ItemLike> INDIUM_ORE_SMELTABLES = List.of(ModBlocks.INDIUM_ORE.block().get(), ModItems.RAW_INDIUM.get());
        List<ItemLike> IRIDIUM_ORE_SMELTABLES = List.of(ModBlocks.IRIDIUM_ORE.block().get(), ModItems.RAW_IRIDIUM.get());
        List<ItemLike> MOLYBDENUM_ORE_SMELTABLES = List.of(ModBlocks.MOLYBDENUM_ORE.block().get(), ModItems.RAW_MOLYBDENUM.get());
        List<ItemLike> CINNABAR_ORE_SMELTABLES = List.of(ModBlocks.CINNABAR_ORE.block().get(), ModItems.RAW_CINNABAR.get());
        List<ItemLike> OSMIUM_ORE_SMELTABLES = List.of(ModBlocks.OSMIUM_ORE.block().get(), ModItems.RAW_OSMIUM.get());
        List<ItemLike> PALLADIUM_ORE_SMELTABLES = List.of(ModBlocks.PALLADIUM_ORE.block().get(), ModItems.RAW_PALLADIUM.get());
        List<ItemLike> PLATINUM_ORE_SMELTABLES = List.of(ModBlocks.PLATINUM_ORE.block().get(), ModItems.RAW_PLATINUM.get());
        List<ItemLike> TANTALUM_ORE_SMELTABLES = List.of(ModBlocks.TANTALUM_ORE.block().get(), ModItems.RAW_TANTALUM.get());
        List<ItemLike> THALLIUM_ORE_SMELTABLES = List.of(ModBlocks.THALLIUM_ORE.block().get(), ModItems.RAW_THALLIUM.get());
        List<ItemLike> TUNGSTEN_ORE_SMELTABLES = List.of(ModBlocks.TUNGSTEN_ORE.block().get(), ModItems.RAW_TUNGSTEN.get());
        List<ItemLike> VANADIUM_ORE_SMELTABLES = List.of(ModBlocks.VANADIUM_ORE.block().get(), ModItems.RAW_VANADIUM.get());
        List<ItemLike> ZIRCONIUM_ORE_SMELTABLES = List.of(ModBlocks.ZIRCONIUM_ORE.block().get(), ModItems.RAW_ZIRCONIUM.get());

        List<ItemLike> ANTIMONY_ORE_SMELTABLES = List.of(ModBlocks.ANTIMONY_ORE.block().get(), ModItems.RAW_ANTIMONY.get());
        List<ItemLike> BERYLLIUM_ORE_SMELTABLES = List.of(ModBlocks.BERYLLIUM_ORE.block().get(), ModItems.RAW_BERYLLIUM.get());
        List<ItemLike> GERMANIUM_ORE_SMELTABLES = List.of(ModBlocks.GERMANIUM_ORE.block().get(), ModItems.RAW_GERMANIUM.get());
        List<ItemLike> PHOSPHORUS_ORE_SMELTABLES = List.of(ModBlocks.PHOSPHORUS_ORE.block().get(), ModItems.RAW_PHOSPHORUS.get());
        List<ItemLike> RHENIUM_ORE_SMELTABLES = List.of(ModBlocks.RHENIUM_ORE.block().get(), ModItems.RAW_RHENIUM.get());
        List<ItemLike> RHODIUM_ORE_SMELTABLES = List.of(ModBlocks.RHODIUM_ORE.block().get(), ModItems.RAW_RHODIUM.get());
        List<ItemLike> RUTHENIUM_ORE_SMELTABLES = List.of(ModBlocks.RUTHENIUM_ORE.block().get(), ModItems.RAW_RUTHENIUM.get());
        List<ItemLike> SELENIUM_ORE_SMELTABLES = List.of(ModBlocks.SELENIUM_ORE.block().get(), ModItems.RAW_SELENIUM.get());
        List<ItemLike> TECHNETIUM_ORE_SMELTABLES = List.of(ModBlocks.TECHNETIUM_ORE.block().get(), ModItems.RAW_TECHNETIUM.get());
        List<ItemLike> TELLURIUM_ORE_SMELTABLES = List.of(ModBlocks.TELLURIUM_ORE.block().get(), ModItems.RAW_TELLURIUM.get());
        List<ItemLike> YTTRIUM_ORE_SMELTABLES = List.of(ModBlocks.YTTRIUM_ORE.block().get(), ModItems.RAW_YTTRIUM.get());

        //Smelting and Blasting
        oreSmelting(ALUMINIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.7F, 150, "aluminium");
        oreBlasting(ALUMINIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.8F, 75, "aluminium");

        oreSmelting(CALCIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CALCIUM_INGOT.get(), 0.7F, 150, "calcium");
        oreBlasting(CALCIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CALCIUM_INGOT.get(), 0.8F, 75, "calcium");

        oreSmelting(CHROMIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 0.7F, 150, "chromium");
        oreBlasting(CHROMIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 0.8F, 75, "chromium");

        oreSmelting(LEAD_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LEAD_INGOT.get(), 0.7F, 150, "lead");
        oreBlasting(LEAD_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LEAD_INGOT.get(), 0.8F, 75, "lead");

        oreSmelting(MAGNESIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MAGNESIUM_INGOT.get(), 0.7F, 150, "magnesium");
        oreBlasting(MAGNESIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MAGNESIUM_INGOT.get(), 0.8F, 75, "magnesium");

        oreSmelting(MANGANESE_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MANGANESE_INGOT.get(), 0.7F, 150, "manganese");
        oreBlasting(MANGANESE_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MANGANESE_INGOT.get(), 0.8F, 75, "manganese");

        oreSmelting(NICKEL_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.7F, 150, "nickel");
        oreBlasting(NICKEL_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.8F, 75, "nickel");

        oreSmelting(POTASSIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.POTASSIUM_INGOT.get(), 0.7F, 150, "potassium");
        oreBlasting(POTASSIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.POTASSIUM_INGOT.get(), 0.8F, 75, "potassium");

        oreSmelting(SILICON_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILICON_INGOT.get(), 0.7F, 150, "silicon");
        oreBlasting(SILICON_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILICON_INGOT.get(), 0.8F, 75, "silicon");

        oreSmelting(SODIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SODIUM_INGOT.get(), 0.7F, 150, "sodium");
        oreBlasting(SODIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SODIUM_INGOT.get(), 0.8F, 75, "sodium");

        oreSmelting(TIN_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TIN_INGOT.get(), 0.7F, 150, "tin");
        oreBlasting(TIN_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TIN_INGOT.get(), 0.8F, 75, "tin");

        oreSmelting(TITANIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.7F, 150, "titanium");
        oreBlasting(TITANIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.8F, 75, "titanium");

        oreSmelting(ZINC_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ZINC_INGOT.get(), 0.7F, 150, "zinc");
        oreBlasting(ZINC_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ZINC_INGOT.get(), 0.8F, 75, "zinc");

        oreSmelting(BARIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.BARIUM_INGOT.get(), 0.7F, 150, "barium");
        oreBlasting(BARIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.BARIUM_INGOT.get(), 0.8F, 75, "barium");

        oreSmelting(CADMIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CADMIUM_INGOT.get(), 0.7F, 150, "cadmium");
        oreBlasting(CADMIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CADMIUM_INGOT.get(), 0.8F, 75, "cadmium");

        oreSmelting(CAESIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CAESIUM_INGOT.get(), 0.7F, 150, "caesium");
        oreBlasting(CAESIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CAESIUM_INGOT.get(), 0.8F, 75, "caesium");

        oreSmelting(COBALT_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.COBALT_INGOT.get(), 0.7F, 150, "cobalt");
        oreBlasting(COBALT_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.COBALT_INGOT.get(), 0.8F, 75, "cobalt");

        oreSmelting(LITHIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LITHIUM_INGOT.get(), 0.7F, 150, "lithium");
        oreBlasting(LITHIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LITHIUM_INGOT.get(), 0.8F, 75, "lithium");

        oreSmelting(NIOBIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 0.7F, 150, "niobium");
        oreBlasting(NIOBIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 0.8F, 75, "niobium");

        oreSmelting(RUBIDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUBIDIUM_INGOT.get(), 0.7F, 150, "rubidium");
        oreBlasting(RUBIDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUBIDIUM_INGOT.get(), 0.8F, 75, "rubidium");

        oreSmelting(SILVER_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILVER_INGOT.get(), 0.7F, 150, "silver");
        oreBlasting(SILVER_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILVER_INGOT.get(), 0.8F, 75, "silver");

        oreSmelting(SCANDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SCANDIUM_INGOT.get(), 0.7F, 150, "scandium");
        oreBlasting(SCANDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SCANDIUM_INGOT.get(), 0.8F, 75, "scandium");

        oreSmelting(STRONTIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.STRONTIUM_INGOT.get(), 0.7F, 150, "strontium");
        oreBlasting(STRONTIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.STRONTIUM_INGOT.get(), 0.8F, 75, "strontium");

        oreSmelting(ARSENIC_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ARSENIC_INGOT.get(), 0.7F, 150, "arsenic");
        oreBlasting(ARSENIC_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ARSENIC_INGOT.get(), 0.8F, 75, "arsenic");

        oreSmelting(BISMUTH_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.BISMUTH_INGOT.get(), 0.7F, 150, "bismuth");
        oreBlasting(BISMUTH_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.BISMUTH_INGOT.get(), 0.8F, 75, "bismuth");

        oreSmelting(GALLIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GALLIUM_INGOT.get(), 0.7F, 150, "gallium");
        oreBlasting(GALLIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GALLIUM_INGOT.get(), 0.8F, 75, "gallium");

        oreSmelting(HAFNIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.HAFNIUM_INGOT.get(), 0.7F, 150, "hafnium");
        oreBlasting(HAFNIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.HAFNIUM_INGOT.get(), 0.8F, 75, "hafnium");

        oreSmelting(INDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.INDIUM_INGOT.get(), 0.7F, 150, "indium");
        oreBlasting(INDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.INDIUM_INGOT.get(), 0.8F, 75, "indium");

        oreSmelting(IRIDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 0.7F, 150, "iridium");
        oreBlasting(IRIDIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 0.8F, 75, "iridium");

        oreSmelting(MOLYBDENUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(), 0.7F, 150, "molybdenum");
        oreBlasting(MOLYBDENUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(), 0.8F, 75, "molybdenum");

        oreSmelting(CINNABAR_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CINNABAR_INGOT.get(), 0.7F, 150, "cinnabar");
        oreBlasting(CINNABAR_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CINNABAR_INGOT.get(), 0.8F, 75, "cinnabar");

        oreSmelting(OSMIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.7F, 150, "osmium");
        oreBlasting(OSMIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.8F, 75, "osmium");

        oreSmelting(PALLADIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.7F, 150, "palladium");
        oreBlasting(PALLADIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.8F, 75, "palladium");

        oreSmelting(PLATINUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.7F, 150, "platinum");
        oreBlasting(PLATINUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.8F, 75, "platinum");

        oreSmelting(TANTALUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TANTALUM_INGOT.get(), 0.7F, 150, "tantalum");
        oreBlasting(TANTALUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TANTALUM_INGOT.get(), 0.8F, 75, "tantalum");

        oreSmelting(THALLIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.THALLIUM_INGOT.get(), 0.7F, 150, "thallium");
        oreBlasting(THALLIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.THALLIUM_INGOT.get(), 0.8F, 75, "thallium");

        oreSmelting(TUNGSTEN_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.7F, 150, "tungsten");
        oreBlasting(TUNGSTEN_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.8F, 75, "tungsten");

        oreSmelting(VANADIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.VANADIUM_INGOT.get(), 0.7F, 150, "vanadium");
        oreBlasting(VANADIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.VANADIUM_INGOT.get(), 0.8F, 75, "vanadium");

        oreSmelting(ZIRCONIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(), 0.7F, 150, "zirconium");
        oreBlasting(ZIRCONIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(), 0.8F, 75, "zirconium");

        oreSmelting(ANTIMONY_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ANTIMONY_INGOT.get(), 0.7F, 150, "antimony");
        oreBlasting(ANTIMONY_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ANTIMONY_INGOT.get(), 0.8F, 75, "antimony");

        oreSmelting(BERYLLIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.BERYLLIUM_INGOT.get(), 0.7F, 150, "beryllium");
        oreBlasting(BERYLLIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.BERYLLIUM_INGOT.get(), 0.8F, 75, "beryllium");

        oreSmelting(GERMANIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GERMANIUM_INGOT.get(), 0.7F, 150, "germanium");
        oreBlasting(GERMANIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GERMANIUM_INGOT.get(), 0.8F, 75, "germanium");

        oreSmelting(PHOSPHORUS_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PHOSPHORUS_INGOT.get(), 0.7F, 150, "phosphorus");
        oreBlasting(PHOSPHORUS_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PHOSPHORUS_INGOT.get(), 0.8F, 75, "phosphorus");

        oreSmelting(RHENIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RHENIUM_INGOT.get(), 0.7F, 150, "rhenium");
        oreBlasting(RHENIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RHENIUM_INGOT.get(), 0.8F, 75, "rhenium");

        oreSmelting(RHODIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RHODIUM_INGOT.get(), 0.7F, 150, "rhodium");
        oreBlasting(RHODIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RHODIUM_INGOT.get(), 0.8F, 75, "rhodium");

        oreSmelting(RUTHENIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUTHENIUM_INGOT.get(), 0.7F, 150, "ruthenium");
        oreBlasting(RUTHENIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUTHENIUM_INGOT.get(), 0.8F, 75, "ruthenium");

        oreSmelting(SELENIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SELENIUM_INGOT.get(), 0.7F, 150, "selenium");
        oreBlasting(SELENIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SELENIUM_INGOT.get(), 0.8F, 75, "selenium");

        oreSmelting(TECHNETIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TECHNETIUM_INGOT.get(), 0.7F, 150, "technetium");
        oreBlasting(TECHNETIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TECHNETIUM_INGOT.get(), 0.8F, 75, "technetium");

        oreSmelting(TELLURIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TELLURIUM_INGOT.get(), 0.7F, 150, "tellurium");
        oreBlasting(TELLURIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TELLURIUM_INGOT.get(), 0.8F, 75, "tellurium");

        oreSmelting(YTTRIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.YTTRIUM_INGOT.get(), 0.7F, 150, "yttrium");
        oreBlasting(YTTRIUM_ORE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.YTTRIUM_INGOT.get(), 0.8F, 75, "yttrium");
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries){
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new MegalosAIORecipeProvider(provider, recipeOutput);
        }

        @Override
        public @Nonnull String getName() {
            return Constants.MOD_NAME + " Recipes";
        }
    }
}
