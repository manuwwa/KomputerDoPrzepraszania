package com.manuwwaMods.komputerdoprzepraszania.util;

import com.manuwwaMods.komputerdoprzepraszania.komputerdoprzepraszania;
import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundsHandler {
    public static SoundEvent KomputerDoPrzepraszania_Przepraszam;

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, komputerdoprzepraszania.MOD_ID);

public static final RegistryObject<SoundEvent> komputer_do_przepraszania_block_voice =
        SOUNDS.register("block.komputer_do_przepraszania_block.voice", () -> new SoundEvent(
                new ResourceLocation(komputerdoprzepraszania.MOD_ID, "block.komputer_do_przepraszania_block.voice")
        ));

}
