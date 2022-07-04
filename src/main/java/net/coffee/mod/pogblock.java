package net.coffee.mod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

public class pogblock extends Block{

    /**
     * 
     */
    public pogblock(){
        super(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(20));
    }
        //TODO Auto-generated constructor stub
    }
    
