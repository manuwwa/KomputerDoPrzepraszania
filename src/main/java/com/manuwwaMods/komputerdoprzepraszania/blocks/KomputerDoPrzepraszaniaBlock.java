package com.manuwwaMods.komputerdoprzepraszania.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class KomputerDoPrzepraszaniaBlock extends Block {
    //#todo add power usage
    public KomputerDoPrzepraszaniaBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        if( placer !=null)
        {
            worldIn.setBlockState(pos,state.with(BlockStateProperties.FACING, getFeceingFromEntity(pos, placer)),2);
        }
    }

    private Direction getFeceingFromEntity(BlockPos blockPos, LivingEntity placer) {
        return Direction.getFacingFromVector(
                (float) (placer.lastTickPosX - blockPos.getX()),
                (float) (placer.lastTickPosY - blockPos.getY()),
                (float) (placer.lastTickPosZ - blockPos.getZ()));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
    }
}
