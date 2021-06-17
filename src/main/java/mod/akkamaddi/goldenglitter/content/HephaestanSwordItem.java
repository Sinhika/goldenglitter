package mod.akkamaddi.goldenglitter.content;

import mod.akkamaddi.goldenglitter.helpers.HephaestanHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class HephaestanSwordItem extends SwordItem
{

    public HephaestanSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
    {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
        return HephaestanHandler.INSTANCE.hitEntity(stack, target, attacker)
               && super.hurtEnemy(stack, target, attacker);
    }

} // end class
