package com.manuwwaMods.komputerdoprzepraszania.util;

import com.manuwwaMods.komputerdoprzepraszania.blocks.KomputerDoPrzepraszaniaBlock;
import com.manuwwaMods.komputerdoprzepraszania.blocks.KomputerDoPrzepraszaniaBlockItem;
import com.manuwwaMods.komputerdoprzepraszania.komputerdoprzepraszania;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, komputerdoprzepraszania.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, komputerdoprzepraszania.MOD_ID);

    public static void init()
    {
        FMLJavaModLoadingContext loadingContext = FMLJavaModLoadingContext.get();
        ITEMS.register(loadingContext.getModEventBus());
        BLOCKS.register(loadingContext.getModEventBus());
        initRegisters();
    }

    //Blocks
    public static final RegistryObject<Block> KOMPUTER_DO_PRZEPRASZANIA_BLOCK = BLOCKS.register("komputer_do_przepraszania_block", KomputerDoPrzepraszaniaBlock::new);

    //BlockItems
    public static final RegistryObject<Item> KOMPUTER_DO_PRZEPRASZANIA_BLOCK_ITEM =
            ITEMS.register("komputer_do_przepraszania_block", () -> new KomputerDoPrzepraszaniaBlockItem(KOMPUTER_DO_PRZEPRASZANIA_BLOCK.get()));

    public static void initRegisters()
    {
    }

}
