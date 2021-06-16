package mod.akkamaddi.goldenglitter.content;

import java.util.function.Supplier;

import mod.akkamaddi.goldenglitter.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum GoldenItemTier implements IItemTier 
{
    ROSE_GOLD(1, 240, 9.0F, 1.0F, 14, ()-> { return Ingredient.of(ModItems.rose_gold_ingot.get());}),
    ERUBESCENT_GOLD(3, 18, 16.0F, 3.0F, 22, ()-> { return Ingredient.of(ModItems.erubescent_gold_ingot.get());}),
    SCARLATITE_GOLD(5, 38, 18.0F, 4.0F, 28, ()-> { return Ingredient.of(ModItems.scarlatite_gold_ingot.get());}),
    HEPHAESTAN_GOLD(5, 38, 18.0F, 4.0F, 28, ()-> { return Ingredient.of(ModItems.hephaestan_gold_ingot.get());});
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;
    
    private GoldenItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
            Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getUses() {
       return this.maxUses;
    }

    @Override
    public float getSpeed() {
       return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
       return this.attackDamage;
    }

    @Override
    public int getLevel() {
       return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
       return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
       return this.repairMaterial.get();
    }
    
}
