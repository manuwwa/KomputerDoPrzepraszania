package com.manuwwaMods.komputerdoprzepraszania.events;

import com.manuwwaMods.komputerdoprzepraszania.komputerdoprzepraszania;
import com.manuwwaMods.komputerdoprzepraszania.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid =komputerdoprzepraszania.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void onkomputerdoprzepraszaniaClick(PlayerInteractEvent.RightClickBlock ev)
    {
        World world = ev.getWorld();
        BlockPos blockPos = ev.getPos();
        boolean isKOMPUTER_DO_PRZEPRASZANIA_BLOCK = world.getBlockState(blockPos).getBlock() == RegistryHandler.KOMPUTER_DO_PRZEPRASZANIA_BLOCK.get();
        LivingEntity player =ev.getEntityLiving();
        ItemStack item = player.getHeldItemMainhand();
        komputerdoprzepraszania.LOGGER.info(item.getItem().getDisplayName(item));
        if(isKOMPUTER_DO_PRZEPRASZANIA_BLOCK && item == ItemStack.EMPTY)
        {
                ResourceLocation location = new ResourceLocation(komputerdoprzepraszania.MOD_ID, "block.komputer_do_przepraszania_block.voice");
                SoundEvent event = new SoundEvent(location);
                double x = ev.getPos().getX();
                double y = ev.getPos().getY();
                double z = ev.getPos().getZ();
                world.playSound(x, y, z, event, SoundCategory.VOICE, 1.0f, 1.0f, false);
                player.swing(Hand.MAIN_HAND,true);
        }
    }
}
