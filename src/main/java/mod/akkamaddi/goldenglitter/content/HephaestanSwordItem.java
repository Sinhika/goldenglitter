package mod.akkamaddi.goldenglitter.content;

import mod.akkamaddi.goldenglitter.helpers.HephaestanHandler;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

import net.minecraft.world.item.Item.Properties;

public class HephaestanSwordItem extends SwordItem
{

    public HephaestanSwordItem(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
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
