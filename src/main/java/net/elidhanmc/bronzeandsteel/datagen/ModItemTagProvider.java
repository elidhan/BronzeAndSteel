package net.elidhanmc.bronzeandsteel.datagen;

import net.elidhanmc.bronzeandsteel.BronzeAndSteel;
import net.elidhanmc.bronzeandsteel.item.ModItems;
import net.elidhanmc.bronzeandsteel.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, BronzeAndSteel.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.INGOTS_BRONZE)
                .add(ModItems.BRONZE_INGOT.get());
        tag(ModTags.INGOTS_STEEL)
                .add(ModItems.STEEL_INGOT.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD.get())
                .add(ModItems.STEEL_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.STEEL_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.BRONZE_SHOVEL.get())
                .add(ModItems.STEEL_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.BRONZE_AXE.get())
                .add(ModItems.STEEL_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE.get())
                .add(ModItems.STEEL_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get())
                .add(ModItems.STEEL_HELMET.get())
                .add(ModItems.STEEL_CHESTPLATE.get())
                .add(ModItems.STEEL_LEGGINGS.get())
                .add(ModItems.STEEL_BOOTS.get());

    }
}
