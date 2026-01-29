package net.aminium.biomerings;

import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BiomeRings.MODID)
public class BiomeRings {
    public static final String MODID = "biomerings";

    public BiomeRings(FMLJavaModLoadingContext context) {
        context.getModEventBus().addListener(this::setup);   
    }

    private void setup(ServerAboutToStartEvent event) {
        
    }
}
