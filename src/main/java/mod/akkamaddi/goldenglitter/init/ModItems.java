package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.content.GoldenArmorMaterial;
import mod.akkamaddi.goldenglitter.content.GoldenItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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
    // rose_gold
    public static final RegistryObject<ArmorItem> rose_gold_helmet = ITEMS.register("rose_gold_helmet",
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
   
    // TOOLS
    // rose_gold
    public static final RegistryObject<SwordItem> rose_gold_sword = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(GoldenItemTier.ROSE_GOLD, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> rose_gold_pickaxe = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTier.ROSE_GOLD, 1, -2.8F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> rose_gold_axe = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(GoldenItemTier.ROSE_GOLD, 7.0F, -3.1F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> rose_gold_shovel = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(GoldenItemTier.ROSE_GOLD, 1.5F, -3.0F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<HoeItem> rose_gold_hoe = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(GoldenItemTier.ROSE_GOLD, -1, -2.0F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)) {});
   
    // erubescent_gold
    public static final RegistryObject<SwordItem> erubescent_gold_sword = ITEMS.register("erubescent_gold_sword",
            () -> new SwordItem(GoldenItemTier.ERUBESCENT_GOLD, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> erubescent_gold_pickaxe = ITEMS.register("erubescent_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTier.ERUBESCENT_GOLD, 1, -2.8F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> erubescent_gold_axe = ITEMS.register("erubescent_gold_axe",
            () -> new AxeItem(GoldenItemTier.ERUBESCENT_GOLD, 7.0F, -3.1F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> erubescent_gold_shovel = ITEMS.register("erubescent_gold_shovel",
            () -> new ShovelItem(GoldenItemTier.ERUBESCENT_GOLD, 1.5F, -3.0F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // scarlatite_gold
    public static final RegistryObject<SwordItem> scarlatite_gold_sword = ITEMS.register("scarlatite_gold_sword",
            () -> new SwordItem(GoldenItemTier.SCARLATITE_GOLD, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> scarlatite_gold_pickaxe = ITEMS.register("scarlatite_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTier.SCARLATITE_GOLD, 1, -2.8F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> scarlatite_gold_axe = ITEMS.register("scarlatite_gold_axe",
            () -> new AxeItem(GoldenItemTier.SCARLATITE_GOLD, 7.0F, -3.1F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> scarlatite_gold_shovel = ITEMS.register("scarlatite_gold_shovel",
            () -> new ShovelItem(GoldenItemTier.SCARLATITE_GOLD, 1.5F, -3.0F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));

    // hephaestan_gold
    // TODO - replace SwordItem with HephaestanSwordItem when it is written. 
    public static final RegistryObject<SwordItem> hephaestan_gold_sword = ITEMS.register("hephaestan_gold_sword",
            () -> new SwordItem(GoldenItemTier.HEPHAESTAN_GOLD, 3, -2.4F,
                                new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<PickaxeItem> hephaestan_gold_pickaxe = ITEMS.register("hephaestan_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTier.HEPHAESTAN_GOLD, 1, -2.8F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<AxeItem> hephaestan_gold_axe = ITEMS.register("hephaestan_gold_axe",
            () -> new AxeItem(GoldenItemTier.HEPHAESTAN_GOLD, 7.0F, -3.1F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ShovelItem> hephaestan_gold_shovel = ITEMS.register("hephaestan_gold_shovel",
            () -> new ShovelItem(GoldenItemTier.HEPHAESTAN_GOLD, 1.5F, -3.0F,
                    new Item.Properties().tab(ModTabGroups.MOD_ITEM_GROUP)));
    
} // end class
