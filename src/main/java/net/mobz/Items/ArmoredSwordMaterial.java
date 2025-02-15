package net.mobz.Items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ArmoredSwordMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 251;
    }

    @Override
    public float getMiningSpeed() {
        return 1.0F;
    }

    @Override
    public float getAttackDamage() {
        return 6;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.EMPTY;
    }
}