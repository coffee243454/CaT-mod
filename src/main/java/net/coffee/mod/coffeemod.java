package net.coffee.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;




public class coffeemod implements ModInitializer {

    public static final Item COFFEE_ITEM = new CoffeeItem(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(10f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*20), 1.0f).build()));

    public static final Block POG_BLOCK = new pogblock();

    public static final Block TRIRITE_BLOCK = new pogblock();

    public static final Item GOLD_TRIDENT = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final Block COFFIUM_BLOCK = new coffiumblock();

    public static final Item COFFIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));



    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffee"), COFFEE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("coffeemod", "pogblock"), POG_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "pogblock"), new BlockItem(POG_BLOCK, new  Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.BLOCK, new Identifier("coffeemod", "tririteblock"), TRIRITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "tririteblock"), new BlockItem(TRIRITE_BLOCK, new  Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "goldtrident"), GOLD_TRIDENT);
        Registry.register(Registry.BLOCK, new Identifier("coffeemod", "coffiumblock"), COFFIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumblock"), new BlockItem(COFFIUM_BLOCK, new  Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumingot"), COFFIUM_INGOT);
     }
     
}