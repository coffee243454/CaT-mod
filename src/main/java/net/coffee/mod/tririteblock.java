package net.coffee.mod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

public class tririteblock extends Block{

    /**
     * 
     */
    public tririteblock(){
        super(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(10));
    }
        //TODO Auto-generated constructor stub
    }
    
