package net.kmidnight.kingsblocks.block;

import net.kmidnight.kingsblocks.KingsBlocksMod;
import net.kmidnight.kingsblocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KingsBlocksMod.MODID);

    public static final RegistryObject<Block> AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> SLIME_DOOR = registerBlock("slime_door", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> BLACK_ICE = registerBlock("black_ice", () -> new HalfTransparentBlock(BlockBehaviour.Properties.of().mapColor(MapColor.ICE).strength(3F).friction(1.5F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MYSTIC_YIPEEE = registerBlock("mystic_yipeee", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> IRON_GATE = registerBlock("iron_gate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> COPPER_GATE = registerBlock("copper_gate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> SLATE = registerBlock("slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BOOKSHELF_SLAB = registerBlock("bookshelf_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(1.5F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> WROUGHTIRONFENCE = registerBlock("wroughtironfence",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> WROUGHTIRONGATE = registerBlock("wroughtirongate",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> POISONBARBWIRE = registerBlock("poisonbarbwire",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBWEB)));
    public static final RegistryObject<Block> HEAVENSGATE = registerBlock("heavensgate",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RNBOBSIDIAN = registerBlock("redandblueobsidian",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> RAINBOWBLOCK = registerBlock("rainbowblock",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ETERNALFURNACE = registerBlock("eternalfurnace",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> ROSEQUARTZBLOCK = registerBlock("rosequartzblock",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BEEPER = registerBlock("beeper",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
