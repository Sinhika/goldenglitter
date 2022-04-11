package mod.akkamaddi.goldenglitter.helpers;

import mod.alexndr.simplecorelib.helpers.IWeaponEffectHelper;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class HephaestanHandler implements IWeaponEffectHelper
{
    public static HephaestanHandler INSTANCE = new HephaestanHandler();
    
    private HephaestanHandler() {}

    /**
     * set target on fire if it's not already on fire.
     */
   @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
       if (target.getRemainingFireTicks() <= 50) {
           target.setSecondsOnFire(50);
       }
       return true;    
    }
    
} // end class
