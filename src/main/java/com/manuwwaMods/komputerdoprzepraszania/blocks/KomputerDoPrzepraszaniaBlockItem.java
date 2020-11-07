package com.manuwwaMods.komputerdoprzepraszania.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class KomputerDoPrzepraszaniaBlockItem extends BlockItem {
    public KomputerDoPrzepraszaniaBlockItem(Block blockIn) {
        super(blockIn, new Item.Properties().group(net.minecraft.item.ItemGroup.MISC));
    }
}
