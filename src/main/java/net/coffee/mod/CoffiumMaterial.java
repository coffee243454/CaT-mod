package net.coffee.mod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CoffiumMaterial implements ToolMaterial {
    public static final CoffiumMaterial INSTANCE = new CoffiumMaterial();
    
    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 4.0f;
    }

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 30;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 13.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(coffeemod.COFFIUM_INGOT);
    }
    
}
