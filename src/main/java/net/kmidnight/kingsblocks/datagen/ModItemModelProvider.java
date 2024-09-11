package net.kmidnight.kingsblocks.datagen;

import net.kmidnight.kingsblocks.KingsBlocksMod;
import net.kmidnight.kingsblocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, KingsBlocksMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // simpleItem(ModItems.ICESWORD);

        simplerBlockItem(ModBlocks.BOOKSHELF_SLAB);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(KingsBlocksMod.MODID, "item/" + item.getId().getPath()));
    }

    private void simplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(KingsBlocksMod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
            modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(KingsBlocksMod.MODID, "item/" + item.getId().getPath()));
    }
}
