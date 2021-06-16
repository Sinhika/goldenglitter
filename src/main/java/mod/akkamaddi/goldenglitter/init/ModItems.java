package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.content.GoldenArmorMaterial;
import mod.alexndr.fusion.init.ModTabGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems
{
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, GoldenGlitter.MODID);
    
    // BASIC ITEMS
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

    public static final RegistryObject<Item> large_rose_gold_chunk = ITEMS.register("large_rose_gold_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_erubescent_gold_chunk = ITEMS.register("large_erubescent_gold_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_scarlatite_gold_chunk = ITEMS.register("large_scarlatite_gold_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> large_hephaestan_gold_chunk = ITEMS.register("large_hephaestan_gold_chunk", 
            ()-> new Item(new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
  
    // ARMORS 
    // red_gold
    public static final RegistryObject<ArmorItem> red_gold_helmet = ITEMS.register("red_gold_helmet",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> rose_gold_chestplate = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> rose_gold_leggings = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> rose_gold_boots = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
   
    
    
} // end class
