package net.aminium.biomerings;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BiomeRings.MODID)
public class BiomeRings
{
    // must have
    public static final String MODID = "biomerings";
    private static final Logger LOGGER = LogUtils.getLogger();
    
    // register
    public BiomeRings(FMLJavaModLoadingContext context)
    {
        context.getModEventBus().addListener(this::commonSetup);   
        // context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    // setup
    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Setting up");

    }
}
