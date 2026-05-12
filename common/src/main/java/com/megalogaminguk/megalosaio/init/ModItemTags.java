package com.megalogaminguk.megalosaio.init;

import com.megalogaminguk.megalosaio.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    private ModItemTags(){

    }

    public static final TagKey<Item> ALUMINIUM_TOOL_MATERIALS = create("aluminium_tool_materials");
    public static final TagKey<Item> SILVER_TOOL_MATERIALS = create("silver_tool_materials");
    public static final TagKey<Item> TECHNETIUM_TOOL_MATERIALS = create("technetium_tool_materials");
    public static final TagKey<Item> TITANIUM_TOOL_MATERIALS = create("titanium_tool_materials");

    public static TagKey<Item> create(String name){
        return TagKey.create(Registries.ITEM, Constants.id(name));
    }
}
