package net.kmidnight.kingsblocks.item;

import net.kmidnight.kingsblocks.KingsBlocksMod;
import net.kmidnight.kingsblocks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KingsBlocksMod.MODID);
    public static final RegistryObject<CreativeModeTab> KINGSBLOCKS_TAB = CREATIVE_MODE_TAB.register("kingsblocks_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KINGSBADGE.get()))
            .title(Component.translatable("creativetab.kingsblocks_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.KINGSBADGE.get());
                pOutput.accept(ModBlocks.AMETHYST_TRAPDOOR.get());
                pOutput.accept(ModBlocks.BLACK_ICE.get());
                pOutput.accept(ModBlocks.BOOKSHELF_SLAB.get());
                pOutput.accept(ModBlocks.SLIME_DOOR.get());
                pOutput.accept(ModBlocks.IRON_GATE.get());
                pOutput.accept(ModBlocks.COPPER_GATE.get());
                pOutput.accept(ModBlocks.SLATE.get());
                pOutput.accept(ModBlocks.MYSTIC_YIPEEE.get());
                pOutput.accept(ModBlocks.WROUGHTIRONFENCE.get());
                pOutput.accept(ModBlocks.WROUGHTIRONGATE.get());
                pOutput.accept(ModBlocks.POISONBARBWIRE.get());
                pOutput.accept(ModBlocks.HEAVENSGATE.get());
                pOutput.accept(ModBlocks.RNBOBSIDIAN.get());
                pOutput.accept(ModBlocks.RAINBOWBLOCK.get());
                pOutput.accept(ModBlocks.ETERNALFURNACE.get());
                pOutput.accept(ModBlocks.ROSEQUARTZBLOCK.get());
                pOutput.accept(ModBlocks.BEEPER.get());
                pOutput.accept(ModBlocks.BEEPERBLOCK.get());
            }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}