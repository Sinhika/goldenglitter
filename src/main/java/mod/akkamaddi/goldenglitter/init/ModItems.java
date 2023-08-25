package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.content.GoldenArmorMaterial;
import mod.akkamaddi.goldenglitter.content.GoldenItemTiers;
import mod.akkamaddi.goldenglitter.content.HephaestanSwordItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems
{
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, GoldenGlitter.MODID);
    
    // BASIC ITEMS
    // ingots and nuggets
    public static final RegistryObject<Item> rose_gold_ingot = ITEMS.register("rose_gold_ingot", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> erubescent_gold_ingot = ITEMS.register("erubescent_gold_ingot", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> scarlatite_gold_ingot = ITEMS.register("scarlatite_gold_ingot", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> hephaestan_gold_ingot = ITEMS.register("hephaestan_gold_ingot", 
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> rose_gold_nugget = ITEMS.register("rose_gold_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> erubescent_gold_nugget = ITEMS.register("erubescent_gold_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> scarlatite_gold_nugget = ITEMS.register("scarlatite_gold_nugget", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> hephaestan_gold_nugget = ITEMS.register("hephaestan_gold_nugget", 
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> large_rose_gold_chunk = ITEMS.register("large_rose_gold_chunk", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_erubescent_gold_chunk = ITEMS.register("large_erubescent_gold_chunk", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_scarlatite_gold_chunk = ITEMS.register("large_scarlatite_gold_chunk", 
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> large_hephaestan_gold_chunk = ITEMS.register("large_hephaestan_gold_chunk", 
            ()-> new Item(new Item.Properties()));
  
    // ARMORS 
    // rose_gold
    public static final RegistryObject<ArmorItem> rose_gold_helmet = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> rose_gold_chestplate = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> rose_gold_leggings = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> rose_gold_boots = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(GoldenArmorMaterial.ROSE_GOLD, ArmorItem.Type.BOOTS,
                    new Item.Properties()));
   
    // TOOLS
    // rose_gold
    public static final RegistryObject<SwordItem> rose_gold_sword = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(GoldenItemTiers.ROSE_GOLD, 3, -2.4F,
                                new Item.Properties()));
    public static final RegistryObject<PickaxeItem> rose_gold_pickaxe = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTiers.ROSE_GOLD, 1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<AxeItem> rose_gold_axe = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(GoldenItemTiers.ROSE_GOLD, 7.0F, -3.1F,
                    new Item.Properties()));
    public static final RegistryObject<ShovelItem> rose_gold_shovel = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(GoldenItemTiers.ROSE_GOLD, 1.5F, -3.0F,
                    new Item.Properties()));
    public static final RegistryObject<HoeItem> rose_gold_hoe = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(GoldenItemTiers.ROSE_GOLD, -1, -2.0F,
                    new Item.Properties()) {});
   
    // erubescent_gold
    public static final RegistryObject<SwordItem> erubescent_gold_sword = ITEMS.register("erubescent_gold_sword",
            () -> new SwordItem(GoldenItemTiers.ERUBESCENT_GOLD, 3, -2.4F,
                                new Item.Properties()));
    public static final RegistryObject<PickaxeItem> erubescent_gold_pickaxe = ITEMS.register("erubescent_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTiers.ERUBESCENT_GOLD, 1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<AxeItem> erubescent_gold_axe = ITEMS.register("erubescent_gold_axe",
            () -> new AxeItem(GoldenItemTiers.ERUBESCENT_GOLD, 7.0F, -3.1F,
                    new Item.Properties()));
    public static final RegistryObject<ShovelItem> erubescent_gold_shovel = ITEMS.register("erubescent_gold_shovel",
            () -> new ShovelItem(GoldenItemTiers.ERUBESCENT_GOLD, 1.5F, -3.0F,
                    new Item.Properties()));

    // scarlatite_gold
    public static final RegistryObject<SwordItem> scarlatite_gold_sword = ITEMS.register("scarlatite_gold_sword",
            () -> new SwordItem(GoldenItemTiers.SCARLATITE_GOLD, 3, -2.4F,
                                new Item.Properties()));
    public static final RegistryObject<PickaxeItem> scarlatite_gold_pickaxe = ITEMS.register("scarlatite_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTiers.SCARLATITE_GOLD, 1, -2.8F,
                    new Item.Properties()));
    public static final RegistryObject<AxeItem> scarlatite_gold_axe = ITEMS.register("scarlatite_gold_axe",
            () -> new AxeItem(GoldenItemTiers.SCARLATITE_GOLD, 7.0F, -3.1F,
                    new Item.Properties()));
    public static final RegistryObject<ShovelItem> scarlatite_gold_shovel = ITEMS.register("scarlatite_gold_shovel",
            () -> new ShovelItem(GoldenItemTiers.SCARLATITE_GOLD, 1.5F, -3.0F,
                    new Item.Properties()));

    // hephaestan_gold
    public static final RegistryObject<HephaestanSwordItem> hephaestan_gold_sword = ITEMS.register("hephaestan_gold_sword",
            () -> new HephaestanSwordItem(GoldenItemTiers.HEPHAESTAN_GOLD, 3, -2.4F,
                                new Item.Properties()));
    public static final RegistryObject<PickaxeItem> hephaestan_gold_pickaxe = ITEMS.register("hephaestan_gold_pickaxe",
            () -> new PickaxeItem(GoldenItemTiers.HEPHAESTAN_GOLD, 1, -2.8F,
                    new Item.Properties()));
    // TODO - should there be a HephaestanAxeItem?
    public static final RegistryObject<AxeItem> hephaestan_gold_axe = ITEMS.register("hephaestan_gold_axe",
            () -> new AxeItem(GoldenItemTiers.HEPHAESTAN_GOLD, 7.0F, -3.1F,
                    new Item.Properties()));
    public static final RegistryObject<ShovelItem> hephaestan_gold_shovel = ITEMS.register("hephaestan_gold_shovel",
            () -> new ShovelItem(GoldenItemTiers.HEPHAESTAN_GOLD, 1.5F, -3.0F,
                    new Item.Properties()));
    
} // end class
