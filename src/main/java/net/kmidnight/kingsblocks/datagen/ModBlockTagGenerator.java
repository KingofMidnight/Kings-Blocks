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
             .add(ModBlocks.BLACKICE.get(),
                 ModBlocks.SLATE.get(),
                 ModBlocks.AMETHYSTTRAPDOOR.get(),
                 ModBlocks.COPPER_GATE.get(),
                 ModBlocks.IRON_GATE.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.IRON_GATE.get(),
                ModBlocks.COPPER_GATE.get(),
                ModBlocks.AMETHYSTTRAPDOOR.get());
    }
}
