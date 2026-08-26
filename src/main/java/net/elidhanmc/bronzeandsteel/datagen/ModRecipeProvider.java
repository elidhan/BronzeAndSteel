package net.elidhanmc.bronzeandsteel.datagen;

import net.elidhanmc.bronzeandsteel.BronzeAndSteel;
import net.elidhanmc.bronzeandsteel.block.ModBlocks;
import net.elidhanmc.bronzeandsteel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> BRONZE_SMELTABLES = List.of(ModItems.BRONZE_MESH);
        List<ItemLike> STEEL_SMELTABLES = List.of(ModItems.CRUDE_IRON);

        oreSmelting(recipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.25f, 200, "bronze");
        oreBlasting(recipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.25f, 100, "bronze");

        oreBlasting(recipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 1f, 200, "steel");

        nineBlock(ModItems.BRONZE_INGOT.get(), ModBlocks.BRONZE_BLOCK.get(),
                "has_bronze_ingot", recipeOutput);
        nineBlock(ModItems.STEEL_INGOT.get(), ModBlocks.STEEL_BLOCK.get(),
                "has_steel_ingot", recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModBlocks.BRONZE_BLOCK)
                .unlockedBy("has_bronze_block", has(ModItems.BRONZE_BLOCK_ITEM.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK)
                .unlockedBy("has_steel_block", has(ModItems.STEEL_BLOCK_ITEM.get()))
                .save(recipeOutput);

        tools(ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_SWORD.get(),
                ModItems.BRONZE_PICKAXE.get(),
                ModItems.BRONZE_AXE.get(),
                ModItems.BRONZE_SHOVEL.get(),
                ModItems.BRONZE_HOE.get(),
                "has_bronze_ingot",
                recipeOutput);
        armor(ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_HELMET.get(),
                ModItems.BRONZE_CHESTPLATE.get(),
                ModItems.BRONZE_LEGGINGS.get(),
                ModItems.BRONZE_BOOTS.get(),
                "has_bronze_ingot",
                recipeOutput);

        tools(ModItems.STEEL_INGOT.get(),
                ModItems.STEEL_SWORD.get(),
                ModItems.STEEL_PICKAXE.get(),
                ModItems.STEEL_AXE.get(),
                ModItems.STEEL_SHOVEL.get(),
                ModItems.STEEL_HOE.get(),
                "has_steel_ingot",
                recipeOutput);
        armor(ModItems.STEEL_INGOT.get(),
                ModItems.STEEL_HELMET.get(),
                ModItems.STEEL_CHESTPLATE.get(),
                ModItems.STEEL_LEGGINGS.get(),
                ModItems.STEEL_BOOTS.get(),
                "has_steel_ingot",
                recipeOutput);
    }

    private void nineBlock(Item item, Block block, String string, RecipeOutput recipeOutput)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', item)
                .unlockedBy("", has(item))
                .save(recipeOutput);
    }
    private void tools(Item input, Item sword, Item pickaxe, Item axe, Item shovel, Item hoe, String string, RecipeOutput recipeOutput)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword)
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .define('I', input)
                .define('S', Items.STICK)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', input)
                .define('S', Items.STICK)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe)
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .define('I', input)
                .define('S', Items.STICK)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .define('I', input)
                .define('S', Items.STICK)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe)
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .define('I', input)
                .define('S', Items.STICK)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
    }
    private void armor(Item input, Item helmet, Item chestplate, Item leggings, Item boots, String string, RecipeOutput recipeOutput)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, helmet)
                .pattern("III")
                .pattern("I I")
                .define('I', input)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, chestplate)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .define('I', input)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, leggings)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .define('I', input)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, boots)
                .pattern("I I")
                .pattern("I I")
                .define('I', input)
                .unlockedBy(string, has(input))
                .save(recipeOutput);
    }
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, BronzeAndSteel.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}