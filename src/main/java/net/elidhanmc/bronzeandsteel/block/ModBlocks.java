package net.elidhanmc.bronzeandsteel.block;

import net.elidhanmc.bronzeandsteel.BronzeAndSteel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BronzeAndSteel.MODID);

    public static final DeferredBlock<Block> BRONZE_BLOCK = BLOCKS.registerSimpleBlock("bronze_block", BlockBehaviour.Properties.of().destroyTime(1.0f));
    public static final DeferredBlock<Block> STEEL_BLOCK = BLOCKS.registerSimpleBlock("steel_block", BlockBehaviour.Properties.of().destroyTime(1.0f));

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
