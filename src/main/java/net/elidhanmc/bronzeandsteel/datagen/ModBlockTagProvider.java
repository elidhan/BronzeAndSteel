package net.elidhanmc.bronzeandsteel.datagen;

import net.elidhanmc.bronzeandsteel.BronzeAndSteel;
import net.elidhanmc.bronzeandsteel.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BronzeAndSteel.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BRONZE_BLOCK.get())
                .add(ModBlocks.STEEL_BLOCK.get());
    }
}