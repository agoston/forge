package org.hert.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class Registrar {
    static BlockObsidianLilyPad blockObsidianLilyPad;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        Main.logger.warn(" >>> running {}, registering block", Main.VERSION);
        blockObsidianLilyPad = new BlockObsidianLilyPad();
        event.getRegistry().register(blockObsidianLilyPad);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Main.logger.warn(" >>> running {}, registering items", Main.VERSION);
        event.getRegistry().register(new ItemObsidianLilyPad(blockObsidianLilyPad));
    }

}
