package net.coffee.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;




public class coffeemod implements ModInitializer {

    public static final Item COFFEE_ITEM = new CoffeeItem(new FabricItemSettings().group(ItemGroup.FOOD));

    public static final Block POG_BLOCK = new pogblock();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffee"), COFFEE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("coffeemod", "pogblock"), POG_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "pogblock"), new BlockItem(POG_BLOCK, new  Item.Settings().group(ItemGroup.MISC)));
     }
     
}
