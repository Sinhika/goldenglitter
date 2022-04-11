package mod.akkamaddi.goldenglitter.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

import mod.akkamaddi.goldenglitter.GoldenGlitter;

import java.util.function.Supplier;

public final class ModTabGroups
{

    public static final CreativeModeTab MOD_ITEM_GROUP = 
            new ModTabGroup(GoldenGlitter.MODID, () -> new ItemStack(ModItems.rose_gold_ingot.get()));

    public static final class ModTabGroup extends CreativeModeTab
    {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return iconSupplier.get();
        }

    } // end ModTabGroup()

}  // end class ModTabGroup
