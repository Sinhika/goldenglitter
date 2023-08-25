package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs
{

//    public static final CreativeModeTab MOD_ITEM_GROUP = 
//            new ModTabGroup(GoldenGlitter.MODID, () -> new ItemStack(ModItems.rose_gold_ingot.get()));

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GoldenGlitter.MODID);
	
	public static final RegistryObject<CreativeModeTab> GOLDENGLITTER_TAB = CREATIVE_MODE_TABS.register("goldenglitter_tab",
			() -> CreativeModeTab.builder()
				.title(Component.translatable("item_group." + GoldenGlitter.MODID + ".tab"))
				.icon(() -> new ItemStack(ModItems.rose_gold_ingot.get()))
				.displayItems((parameters, output) -> {
					output.acceptAll(ModBlocks.BLOCKS.getEntries().stream()
										.map(RegistryObject::get)
										.map(b -> (new ItemStack(b.asItem())))
										.toList()
										);
					output.acceptAll(ModItems.ITEMS.getEntries().stream()
							.map(RegistryObject::get)
							.map(b -> (new ItemStack(b)))
							.toList()
							);
				}).build());

	
}  // end class ModTabGroup
