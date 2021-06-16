package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems
{
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, GoldenGlitter.MODID);
    
    // ingots and nuggets
    public static final RegistryObject<Item> rose_gold_ingot = ITEMS.register("rose_gold_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> erubescent_gold_ingot = ITEMS.register("erubescent_gold_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> scarlatite_gold_ingot = ITEMS.register("scarlatite_gold_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> hephaestan_gold_ingot = ITEMS.register("hephaestan_gold_ingot", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    public static final RegistryObject<Item> rose_gold_nugget = ITEMS.register("rose_gold_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> erubescent_gold_nugget = ITEMS.register("erubescent_gold_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> scarlatite_gold_nugget = ITEMS.register("scarlatite_gold_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> hephaestan_gold_nugget = ITEMS.register("hephaestan_gold_nugget", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

   
} // end class
