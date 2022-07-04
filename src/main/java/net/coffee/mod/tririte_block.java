package net.coffee.mod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

public class tririte_block extends Block{

    /**
     * 
     */
    public tririte_block()){
        super(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.CALCITE).hardness(10));
    }
        //TODO Auto-generated constructor stub
    }
    
