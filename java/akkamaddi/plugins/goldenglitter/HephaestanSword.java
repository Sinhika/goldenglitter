package akkamaddi.plugins.goldenglitter;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import alexndr.api.content.items.SimpleSword;

public class HephaestanSword extends SimpleSword
{
    public HephaestanSword(ToolMaterial enumtoolmaterial)
    {
        super(enumtoolmaterial);
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        if (this == Content.hephaestanGoldSword)
        {
            par1ItemStack.damageItem(1, par3EntityLivingBase);
            par2EntityLivingBase.setFire(50);
        }

        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
}
