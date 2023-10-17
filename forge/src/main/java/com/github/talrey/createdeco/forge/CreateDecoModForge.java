package com.github.talrey.createdeco.forge;

import com.github.talrey.createdeco.ExampleBlocks;
import com.github.talrey.createdeco.CreateDecoMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateDecoMod.MOD_ID)
public class CreateDecoModForge {
    public CreateDecoModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreateDecoMod.init();
    }
}
