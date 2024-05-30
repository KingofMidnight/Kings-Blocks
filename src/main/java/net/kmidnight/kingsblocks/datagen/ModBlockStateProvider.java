package net.kmidnight.kingsblocks.datagen;

import net.kmidnight.kingsblocks.KingsBlocksMod;
import net.kmidnight.kingsblocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, KingsBlocksMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AMETHYSTTRAPDOOR); // blockWithItem(ModBlocks.BLOCK);
        blockWithItem(ModBlocks.BLACKICE);
        blockWithItem(ModBlocks.BOOKSHELF_SLAB);
        blockWithItem(ModBlocks.COPPER_GATE);
        blockWithItem(ModBlocks.IRON_GATE);
        blockWithItem(ModBlocks.MYSTICYIPEEE);
        blockWithItem(ModBlocks.SLATE);
        blockWithItem(ModBlocks.SLIMEDOOR);

        // simpleBlock(ModBlocks.ATM.get(),
        //     new ModelFile.UncheckedModelFile(modLoc("block/atm")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
