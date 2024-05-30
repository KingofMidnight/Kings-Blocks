package net.kmidnight.kingsblocks.datagen.loot;

import net.kmidnight.kingsblocks.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AMETHYSTTRAPDOOR.get());
        this.dropSelf(ModBlocks.SLIMEDOOR.get());
        this.dropSelf(ModBlocks.BLACKICE.get());
        this.dropSelf(ModBlocks.MYSTICYIPEEE.get());
        this.dropSelf(ModBlocks.IRON_GATE.get());
        this.dropSelf(ModBlocks.COPPER_GATE.get());
        this.dropSelf(ModBlocks.SLATE.get());
        this.dropSelf(ModBlocks.BOOKSHELF_SLAB.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
