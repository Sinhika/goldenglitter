package mod.akkamaddi.goldenglitter.content;

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
        // TODO Auto-generated method stub
        return super.hurtEnemy(stack, target, attacker);
    }

} // end class
