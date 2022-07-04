package net.coffee.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;




public class coffeemod implements ModInitializer {

    public static final Item COFFEE_ITEM = new CoffeeItem(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item GOLD_TRIDENT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    
    public static final Item TRIRITE_BLOCK = new BlockItem(TRIRITE_BLOCK,new FabricItemSettings().group(ItemGroup.MISC));


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffee"), COFFEE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "gold_trident"), GOLD_TRIDENT);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "tririte_block"), TRIRITE_BLOCK);

     }
     
}
