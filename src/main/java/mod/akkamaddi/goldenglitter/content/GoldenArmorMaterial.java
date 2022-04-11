package mod.akkamaddi.goldenglitter.content;

import java.util.function.Supplier;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import mod.akkamaddi.goldenglitter.init.ModItems;

public enum GoldenArmorMaterial implements ArmorMaterial 
{
    ROSE_GOLD("goldenglitter:rose_gold", 10, new int[] { 1, 2, 4, 2 }, 14, SoundEvents.ARMOR_EQUIP_GOLD, 
            0.0F, ()-> { return Ingredient.of(ModItems.rose_gold_ingot.get());}, 0.0F);
    
    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyLoadedValue<Ingredient> repairMaterial;
    private final float knockbackResist;
    
    private GoldenArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
            SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResist)
    {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
        this.knockbackResist = knockbackResist;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairMaterial.get();
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResist;
    }
    
} // end enum
