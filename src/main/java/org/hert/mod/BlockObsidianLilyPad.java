package org.hert.mod;

import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.SoundType;

public class BlockObsidianLilyPad extends BlockLilyPad {

    public BlockObsidianLilyPad() {
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setSoundType(SoundType.STONE);
        this.setRegistryName("hertmod", "obsidian_lilyblock");
        this.setUnlocalizedName(getRegistryName().toString());
        this.setLightLevel(0.05F);
    }
}
