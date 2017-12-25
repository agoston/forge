package org.hert.mod;

import net.minecraft.block.Block;
import net.minecraft.item.ItemLilyPad;

public class ItemObsidianLilyPad extends ItemLilyPad {
    public ItemObsidianLilyPad(Block block) {
        super(block);
        this.setRegistryName("hertmod", "obsidian_lilypad");
        this.setUnlocalizedName(getRegistryName().toString());
    }
}