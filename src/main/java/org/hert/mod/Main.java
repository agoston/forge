package org.hert.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "hertmod";
    public static final String MODNAME = "Hert Mod";
    public static final String VERSION = "0.0.1";

//    @Instance
//    public static Main instance = new Main();

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.warn(" >>> running {}, preInit", VERSION);
    }
}
