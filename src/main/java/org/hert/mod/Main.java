package org.hert.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "hertmod";
    public static final String MODNAME = "Hert Mod";
    public static final String VERSION = "0.0.1";

//    @Instance
//    public static Main instance = new Main();

    static Item itemObsidianLilyPad;
    static Block blockObsidianLilyPad;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        blockObsidianLilyPad = new BlockObsidianLilyPad();
        event.getRegistry().register(blockObsidianLilyPad);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        itemObsidianLilyPad = new ItemObsidianLilyPad(blockObsidianLilyPad);
        event.getRegistry().register(itemObsidianLilyPad);
    }
}
