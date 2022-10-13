package de.ellpeck.actuallyadditions.mod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AASounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ActuallyAdditions.MODID);

    public static RegistryObject<SoundEvent> RECONSTRUCTOR = SOUNDS.register("reconstructor", () -> new SoundEvent(new ResourceLocation(ActuallyAdditions.MODID, "reconstructor")));
    public static RegistryObject<SoundEvent> CRUSHER = SOUNDS.register("crusher", () -> new SoundEvent(new ResourceLocation(ActuallyAdditions.MODID, "crusher")));
    public static RegistryObject<SoundEvent> COFFEE_MACHINE = SOUNDS.register("coffee_machine", () -> new SoundEvent(new ResourceLocation(ActuallyAdditions.MODID, "coffee_machine")));
    public static RegistryObject<SoundEvent> DUH_DUH_DUH_DUUUH = SOUNDS.register("duh_duh_duh_duuuh", () -> new SoundEvent(new ResourceLocation(ActuallyAdditions.MODID, "duh_duh_duh_duuuh")));


    public static void init(IEventBus bus) {
        SOUNDS.register(bus);
    }
}