package net.kmidnight.kingsblocks.datagen;

import net.kmidnight.kingsblocks.KingsBlocksMod;
import net.kmidnight.kingsblocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, KingsBlocksMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AMETHYST_TRAPDOOR); // blockWithItem(ModBlocks.BLOCK);
        blockWithItem(ModBlocks.BLACK_ICE);
        blockWithItem(ModBlocks.COPPER_GATE);
        blockWithItem(ModBlocks.IRON_GATE);
        blockWithItem(ModBlocks.MYSTIC_YIPEEE);
        blockWithItem(ModBlocks.SLATE);
        blockWithItem(ModBlocks.SLIME_DOOR);
        blockWithItem(ModBlocks.WROUGHTIRONFENCE);
        blockWithItem(ModBlocks.WROUGHTIRONGATE);
        blockWithItem(ModBlocks.POISONBARBWIRE);
        blockWithItem(ModBlocks.HEAVENSGATE);
        blockWithItem(ModBlocks.RNBOBSIDIAN);
        blockWithItem(ModBlocks.RAINBOWBLOCK);
        blockWithItem(ModBlocks.ETERNALFURNACE);
        blockWithItem(ModBlocks.ROSEQUARTZBLOCK);

        // simpleBlock(ModBlocks.ATM.get(),
        //     new ModelFile.UncheckedModelFile(modLoc("block/atm")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
