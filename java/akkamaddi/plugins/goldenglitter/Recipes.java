package akkamaddi.plugins.goldenglitter;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.api.core.LogHelper;
import alexndr.plugins.Fusion.FusionFurnaceRecipes;
import alexndr.plugins.Fusion.FusionMaterial;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
    public static void preInitialize()
    {
        try {
            addOreDictEntries();
            LogHelper.verboseInfo(ModInfo.ID,
                    "All OreDictionary entries were added successfully.");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
             "OreDictionary entries were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
    } // end preInitialize()
    
    public static void initialize()
    {
        try {
            addRecipes();
            addFurnaceRecipes();
            addFusionRecipes();
            if (Settings.enableRecycling)
            {
                addRecyclingRecipes();
            } // end if recycling
            LogHelper.verboseInfo(ModInfo.ID,
                    "All recipes were added successfully.");
        } catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Recipes were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
    } // end initialize()
    
    public static void addOreDictEntries()
    {
        // Ore Dictionary
        OreDictionary.registerOre("ingotRoseGold", new ItemStack(
                Content.roseGoldIngot));
        OreDictionary.registerOre("ingotErubescentGold", new ItemStack(
                Content.erubescentGoldIngot));
        OreDictionary.registerOre("ingotScarlatiteGold", new ItemStack(
                Content.scarlatiteGoldIngot));
        OreDictionary.registerOre("ingotHephaestanGold", new ItemStack(
                Content.hephaestanGoldIngot));
    } // end addOreDictEntries()
    
    @SuppressWarnings("unchecked")
	private static void addRecipes()
    {
        // recipes: Crafting
        //Storage Block
        GameRegistry
                .addRecipe(new ItemStack(Content.blockRoseGold, 1),
                        new Object[] { "AAA", "AAA", "AAA", 'A',
                                Content.roseGoldIngot });
        GameRegistry.addRecipe(new ItemStack(Content.blockErubescentGold, 1),
                new Object[] { "AAA", "AAA", "AAA", 'A',
                        Content.erubescentGoldIngot });
        GameRegistry.addRecipe(new ItemStack(Content.blockScarlatiteGold, 1),
                new Object[] { "AAA", "AAA", "AAA", 'A',
                        Content.scarlatiteGoldIngot });
        GameRegistry.addRecipe(new ItemStack(Content.blockHephaestanGold, 1),
                new Object[] { "AAA", "AAA", "AAA", 'A',
                        Content.hephaestanGoldIngot });
        
        //Item Recipe
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(
                new ItemStack(Content.roseGoldIngot, 9),
                new Object[] { Content.blockRoseGold });
        GameRegistry.addShapelessRecipe(new ItemStack(
                Content.erubescentGoldIngot, 9),
                new Object[] { Content.blockErubescentGold });
        GameRegistry.addShapelessRecipe(new ItemStack(
                Content.scarlatiteGoldIngot, 9),
                new Object[] { Content.blockScarlatiteGold });
        GameRegistry.addShapelessRecipe(new ItemStack(
                Content.hephaestanGoldIngot, 9),
                new Object[] { Content.blockHephaestanGold });
        
        // Tools
        //Rose Gold Tool Recipes
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldPickaxe, true,
                        new Object[] { "XXX", " Y ", " Y ", 'X',
                                "ingotRoseGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldAxe, true,
                        new Object[] { "XX ", "XY ", " Y ", 'X',
                                "ingotRoseGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldShovel, true,
                        new Object[] { "X", "Y", "Y", 'X', "ingotRoseGold",
                                'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldSword, true,
                        new Object[] { "X", "X", "Y", 'X', "ingotRoseGold",
                                'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldHoe, true,
                        new Object[] { "XX ", " Y ", " Y ", 'X',
                                "ingotRoseGold", 'Y', "stickWood" }));
        // Rose Gold Armor
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldHelm, true,
                        new Object[] { "XXX", "X X", 'X', "ingotRoseGold" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldChest, true,
                        new Object[] { "X X", "XXX", "XXX", 'X',
                                "ingotRoseGold" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldLegs, true,
                        new Object[] { "XXX", "X X", "X X", 'X',
                                "ingotRoseGold" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.roseGoldBoots, true,
                        new Object[] { "X X", "X X", 'X', "ingotRoseGold" }));
        // Erubescent Gold Tools
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.erubescentGoldPickaxe,
                        true, new Object[] { "XXX", " Y ", " Y ", 'X',
                                "ingotErubescentGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.erubescentGoldAxe, true,
                        new Object[] { "XX ", "XY ", " Y ", 'X',
                                "ingotErubescentGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.erubescentGoldShovel,
                        true, new Object[] { "X", "Y", "Y", 'X',
                                "ingotErubescentGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.erubescentGoldSword,
                        true, new Object[] { "X", "X", "Y", 'X',
                                "ingotErubescentGold", 'Y', "stickWood" }));
        
        // Scarlatite Gold Tools
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.scarlatiteGoldPickaxe, true,
                        new Object[] { "XXX", " Y ", " Y ", 'X',
                                "ingotScarlatiteGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.scarlatiteGoldAxe, true,
                        new Object[] { "XX ", "XY ", " Y ", 'X',
                                "ingotScarlatiteGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.scarlatiteGoldShovel, true,
                        new Object[] { "X", "Y", "Y", 'X',
                                "ingotScarlatiteGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.scarlatiteGoldSword, true,
                        new Object[] { "X", "X", "Y", 'X',
                                "ingotScarlatiteGold", 'Y', "stickWood" }));
        // Hephaestan Gold Tools
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.hephaestanGoldPickaxe, true,
                        new Object[] { "XXX", " Y ", " Y ", 'X',
                                "ingotHephaestanGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.hephaestanGoldAxe, true,
                        new Object[] { "XX ", "XY ", " Y ", 'X',
                                "ingotHephaestanGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.hephaestanGoldShovel, true,
                        new Object[] { "X", "Y", "Y", 'X',
                                "ingotHephaestanGold", 'Y', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(Content.hephaestanGoldSword, true,
                        new Object[] { "X", "X", "Y", 'X',
                                "ingotHephaestanGold", 'Y', "stickWood" }));
        
        // Red Gold Rail
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.redGoldRail, 3), new Object[] {
				Content.erubescentGoldIngot, Blocks.rail, Blocks.rail,
				Blocks.rail });
		GameRegistry.addShapelessRecipe(new ItemStack(
				Content.redGoldRail, 8), new Object[] {
				Content.scarlatiteGoldIngot, Blocks.rail, Blocks.rail,
				Blocks.rail, Blocks.rail, Blocks.rail, Blocks.rail, Blocks.rail,
				Blocks.rail });

     } // end addRecipes
    
    private static void addFurnaceRecipes()
    {
        // recipes: Smelting
        GameRegistry.addSmelting(Content.largeRoseGoldChunkItem, new ItemStack(
                Content.roseGoldIngot), 0.8F);
        GameRegistry.addSmelting(Content.largeErubescentGoldChunkItem,
                new ItemStack(Content.erubescentGoldIngot), 3.0F);
        GameRegistry.addSmelting(Content.largeScarlatiteGoldChunkItem,
                new ItemStack(Content.scarlatiteGoldIngot), 6.0F);
        GameRegistry.addSmelting(Content.largeHephaestanGoldChunkItem,
                new ItemStack(Content.hephaestanGoldIngot), 9.0F);
        
    } // end addFurnaceRecipes
    
    private static void addFusionRecipes()
    {
        // recipes: Fusion Furnace
        FusionFurnaceRecipes.addSmelting(
                FusionMaterial.of("ingotCopper"),
                FusionMaterial.of(new ItemStack(Items.gold_nugget)),
                FusionMaterial.of(new ItemStack(Items.dye, 1, 1)),
                new ItemStack(Content.largeRoseGoldChunkItem), 6.0F);
        FusionFurnaceRecipes.addSmelting(
                FusionMaterial.of(new ItemStack(Items.redstone)),
                FusionMaterial.of(new ItemStack(Items.redstone)),
                FusionMaterial.of(new ItemStack(Items.gold_ingot)),
                new ItemStack(Content.largeErubescentGoldChunkItem),
                12.0F);
        FusionFurnaceRecipes.addSmelting(
                FusionMaterial.of(new ItemStack(Items.redstone)), 
                FusionMaterial.of(new ItemStack(Items.redstone)),
                FusionMaterial.of(new ItemStack(Content.erubescentGoldIngot)),
                new ItemStack(Content.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionFurnaceRecipes.addSmelting(
                FusionMaterial.of(new ItemStack(Items.lava_bucket)), 
                FusionMaterial.of(new ItemStack(Items.lava_bucket)),
                FusionMaterial.of(new ItemStack(Content.scarlatiteGoldIngot)),
                new ItemStack(Content.largeHephaestanGoldChunkItem),
                20.0F);
        
    } // end addFusionRecipes
    
    private static void addRecyclingRecipes()
    {
        // rose gold
        FusionFurnaceRecipes.addSmelting(
                new ItemStack( Content.roseGoldHelm, 1, OreDictionary.WILDCARD_VALUE), 
                new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Content.largeRoseGoldChunkItem),
                10.0F);
        FusionFurnaceRecipes.addSmelting(
                new ItemStack(Content.roseGoldChest, 1,OreDictionary.WILDCARD_VALUE), 
                new ItemStack(Blocks.gravel, 2, 0), 
                new ItemStack(Items.coal, 2, OreDictionary.WILDCARD_VALUE), 
                new ItemStack(Content.largeRoseGoldChunkItem, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(
                new ItemStack(Content.roseGoldLegs, 1, OreDictionary.WILDCARD_VALUE), 
                new ItemStack(Blocks.gravel, 2, 0), 
                new ItemStack(Items.coal, 2, OreDictionary.WILDCARD_VALUE), 
                new ItemStack(Content.largeRoseGoldChunkItem, 2, 0), 20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.roseGoldBoots, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Content.largeRoseGoldChunkItem),
                10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.roseGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Content.largeRoseGoldChunkItem),
                10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.roseGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Content.largeRoseGoldChunkItem),
                10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.roseGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Content.largeRoseGoldChunkItem),
                10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.roseGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Content.largeRoseGoldChunkItem),
                10.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.roseGoldHoe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Content.largeRoseGoldChunkItem),
                10.0F);
        // erubescent gold
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.erubescentGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeErubescentGoldChunkItem),
                15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.erubescentGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeErubescentGoldChunkItem),
                15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.erubescentGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeErubescentGoldChunkItem),
                15.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.erubescentGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeErubescentGoldChunkItem),
                15.0F);
        // scarlatite gold
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.scarlatiteGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.scarlatiteGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.scarlatiteGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.scarlatiteGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        Content.largeScarlatiteGoldChunkItem),
                20.0F);
        // hephaestan gold
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.hephaestanGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        Content.largeHephaestanGoldChunkItem),
                25.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.hephaestanGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        Content.largeHephaestanGoldChunkItem),
                25.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.hephaestanGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        Content.largeHephaestanGoldChunkItem),
                25.0F);
        FusionFurnaceRecipes.addSmelting(new ItemStack(
                Content.hephaestanGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        Content.largeHephaestanGoldChunkItem),
                25.0F);
      
    } // end addRecyclingRecipes
} // end class Recipes
