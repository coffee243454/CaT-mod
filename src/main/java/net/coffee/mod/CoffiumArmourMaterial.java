package net.coffee.mod;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class CoffiumArmourMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {1000, 1000, 1000, 1000};
    private static final int[] PROTECTION_AMOUNT = new int[] {6, 9, 10, 6};

    @Override
    public int getDurability(EquipmentSlot var1) {
        // TODO Auto-generated method stub
        return BASE_DURABILITY[var1.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot var1) {
        // TODO Auto-generated method stub
        return PROTECTION_AMOUNT[var1.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 30;
    }

    @Override
    public SoundEvent getEquipSound() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(coffeemod.COFFIUM_INGOT);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public float getToughness() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
