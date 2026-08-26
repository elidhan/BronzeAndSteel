package net.elidhanmc.bronzeandsteel.item;

import net.elidhanmc.bronzeandsteel.tag.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class ModToolTiers {
    public static final Tier BRONZE = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            384,
            5f,
            2f,
            18,
            () -> Ingredient.of(ModTags.INGOTS_BRONZE));
    public static final Tier STEEL = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            768,
            7f,
            3f,
            12,
            () -> Ingredient.of(ModTags.INGOTS_STEEL));
}
