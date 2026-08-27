package net.elidhanmc.bronzeandsteel.item;

import net.elidhanmc.bronzeandsteel.BronzeAndSteel;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "bronzeandsteel" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BronzeAndSteel.MODID);

    // Creates a creative tab with the id "bronzeandsteel:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("bronzeandsteel",
            () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.bronzeandsteel")) //The language key for the title of your CreativeModeTab
            .icon(() -> ModItems.STEEL_SWORD.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.SILICON_MIXTURE.get());// Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(ModItems.BRONZE_MESH.get());
                output.accept(ModItems.BRONZE_INGOT.get());
                output.accept(ModItems.CRUDE_IRON.get());
                output.accept(ModItems.STEEL_INGOT.get());

                output.accept(ModItems.BRONZE_BLOCK_ITEM);
                output.accept(ModItems.STEEL_BLOCK_ITEM);

                output.accept(ModItems.BRONZE_SWORD.get());// Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(ModItems.BRONZE_PICKAXE.get());
                output.accept(ModItems.BRONZE_AXE.get());
                output.accept(ModItems.BRONZE_SHOVEL.get());
                output.accept(ModItems.BRONZE_HOE.get());
                output.accept(ModItems.BRONZE_HELMET.get());// Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(ModItems.BRONZE_CHESTPLATE.get());
                output.accept(ModItems.BRONZE_LEGGINGS.get());
                output.accept(ModItems.BRONZE_BOOTS.get());

                output.accept(ModItems.STEEL_SWORD.get());// Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(ModItems.STEEL_PICKAXE.get());
                output.accept(ModItems.STEEL_AXE.get());
                output.accept(ModItems.STEEL_SHOVEL.get());
                output.accept(ModItems.STEEL_HOE.get());
                output.accept(ModItems.STEEL_HELMET.get());// Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(ModItems.STEEL_CHESTPLATE.get());
                output.accept(ModItems.STEEL_LEGGINGS.get());
                output.accept(ModItems.STEEL_BOOTS.get());

            }).build());
    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
