package net.coffee.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;




public class coffeemod implements ModInitializer {

    public static final Item COFFEE_ITEM = new CoffeeItem(new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(10f).hunger(10).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*20), 1.0f).build()));

    public static final Block POG_BLOCK = new pogblock();

    public static final Block TRIRITE_BLOCK = new pogblock();

    public static final Item GOLD_TRIDENT = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final Block COFFIUM_BLOCK = new coffiumblock();

    public static final Item COFFIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static ToolItem COFFIUM_SHOVEL = new ShovelItem(CoffiumMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

    public static ToolItem COFFIUM_PICKAXE = new coffiumpick(CoffiumMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

    public static ToolItem COFFIUM_AXE = new coffiumaxe(CoffiumMaterial.INSTANCE, 7.0F, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));

    public static ToolItem COFFIUM_HOE = new coffiumhoe(CoffiumMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
 
    public static ToolItem COFFIUM_SWORD = new SwordItem(CoffiumMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    
    public static CoffiumArmourMaterial COFFIUM_ARMOR = new CoffiumArmourMaterial();
    

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
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumshovel"), COFFIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumpickaxe"), COFFIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumaxe"), COFFIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumhoe"), COFFIUM_HOE);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumsword"), COFFIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumhelmet"), new armorbase(COFFIUM_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumchestplate"), new armorbase(COFFIUM_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumleggings"), new armorbase(COFFIUM_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier("coffeemod", "coffiumboots"), new armorbase(COFFIUM_ARMOR, EquipmentSlot.FEET));
    }
     
}