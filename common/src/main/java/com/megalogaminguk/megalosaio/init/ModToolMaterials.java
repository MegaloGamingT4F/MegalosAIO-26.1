package com.megalogaminguk.megalosaio.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    private ModToolMaterials(){
    }

    public static final ToolMaterial ALUMINIUM_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            400,
            7.0F,
            3.0F,
            18,
            ModItemTags.ALUMINIUM_TOOL_MATERIALS);

    public static final ToolMaterial SILVER_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            550,
            8.0F,
            3.5F,
            18,
            ModItemTags.SILVER_TOOL_MATERIALS);

    public static final ToolMaterial TECHNETIUM_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            600,
            6.0F,
            4.0F,
            20,
            ModItemTags.TECHNETIUM_TOOL_MATERIALS);

    public static final ToolMaterial TITANIUM_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            650,
            8.5F,
            5.0F,
            18,
            ModItemTags.TITANIUM_TOOL_MATERIALS);
}
