package net.kmidnight.kingsblocks.datagen;

import net.kmidnight.kingsblocks.KingsBlocksMod;
import net.kmidnight.kingsblocks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, KingsBlocksMod.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
             .add(ModBlocks.BLACK_ICE.get(),
                 ModBlocks.SLATE.get(),
                 ModBlocks.AMETHYST_TRAPDOOR.get(),
                 ModBlocks.COPPER_GATE.get(),
                 ModBlocks.IRON_GATE.get(),
                 ModBlocks.WROUGHTIRONFENCE.get(),
                 ModBlocks.WROUGHTIRONGATE.get(),
                 ModBlocks.RNBOBSIDIAN.get(),
                 ModBlocks.ETERNALFURNACE.get(),
                 ModBlocks.ROSEQUARTZBLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.IRON_GATE.get(),
                ModBlocks.COPPER_GATE.get(),
                ModBlocks.AMETHYST_TRAPDOOR.get(),
                ModBlocks.WROUGHTIRONFENCE.get(),
                ModBlocks.WROUGHTIRONGATE.get(),
                ModBlocks.ROSEQUARTZBLOCK.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.RNBOBSIDIAN.get());
    }
}
