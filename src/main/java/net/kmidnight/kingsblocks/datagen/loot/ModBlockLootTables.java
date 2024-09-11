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
        this.dropSelf(ModBlocks.AMETHYST_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SLIME_DOOR.get());
        this.dropSelf(ModBlocks.BLACK_ICE.get());
        this.dropSelf(ModBlocks.MYSTIC_YIPEEE.get());
        this.dropSelf(ModBlocks.IRON_GATE.get());
        this.dropSelf(ModBlocks.COPPER_GATE.get());
        this.dropSelf(ModBlocks.SLATE.get());
        this.dropSelf(ModBlocks.WROUGHTIRONFENCE.get());
        this.dropSelf(ModBlocks.WROUGHTIRONGATE.get());
        this.dropSelf(ModBlocks.POISONBARBWIRE.get());
        this.dropSelf(ModBlocks.HEAVENSGATE.get());
        this.dropSelf(ModBlocks.RNBOBSIDIAN.get());
        this.dropSelf(ModBlocks.RAINBOWBLOCK.get());
        this.dropSelf(ModBlocks.ETERNALFURNACE.get());
        this.dropSelf(ModBlocks.ROSEQUARTZBLOCK.get());

        this.add(ModBlocks.BOOKSHELF_SLAB.get(),
            block -> createSlabItemTable(ModBlocks.BOOKSHELF_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
