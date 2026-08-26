package net.elidhanmc.bronzeandsteel.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static final TagKey<Item> INGOTS_BRONZE = tag("ingots/bronze");
    public static final TagKey<Item> INGOTS_STEEL = tag("ingots/steel");

    private static TagKey<Item> tag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
