package akkamaddi.plugins.goldenglitter;

import akkamaddi.plugins.simpletungsten.ModInfo;
import alexndr.api.core.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
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
                GoldenGlitter.roseGoldIngot));
        OreDictionary.registerOre("ingotErubescentGold", new ItemStack(
                GoldenGlitter.erubescentGoldIngot));
        OreDictionary.registerOre("ingotScarlatiteGold", new ItemStack(
                GoldenGlitter.scarlatiteGoldIngot));
        OreDictionary.registerOre("ingotHephaestanGold", new ItemStack(
                GoldenGlitter.hephaestanGoldIngot));
    } // end addOreDictEntries()
    
    @SuppressWarnings("unchecked")
	private static void addRecipes()
    {
        // recipes: Crafting
        //Storage Block
        GameRegistry.addRecipe(new ItemStack(GoldenGlitter.blockRoseGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitter.roseGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitter.blockErubescentGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitter.erubescentGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitter.blockScarlatiteGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitter.scarlatiteGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitter.blockHephaestanGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitter.hephaestanGoldIngot});
        //Item Recipe
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitter.roseGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitter.blockRoseGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitter.erubescentGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitter.blockErubescentGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitter.scarlatiteGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitter.blockScarlatiteGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitter.hephaestanGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitter.blockHephaestanGold
                                        });
        // Tools
        //Rose Gold Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        //Rose Gold Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.roseGoldBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotRoseGold"
                }));
        //Erubescent Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.erubescentGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.erubescentGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.erubescentGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.erubescentGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        //Scarlatite Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.scarlatiteGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.scarlatiteGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.scarlatiteGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.scarlatiteGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        //Hephaestan Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.hephaestanGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.hephaestanGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.hephaestanGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitter.hephaestanGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        
        // Red Gold Rail
		GameRegistry.addShapelessRecipe(new ItemStack(
				GoldenGlitter.redGoldRail, 3), new Object[] {
				GoldenGlitter.erubescentGoldIngot, Blocks.rail, Blocks.rail,
				Blocks.rail });
		GameRegistry.addShapelessRecipe(new ItemStack(
				GoldenGlitter.redGoldRail, 8), new Object[] {
				GoldenGlitter.scarlatiteGoldIngot, Blocks.rail, Blocks.rail,
				Blocks.rail, Blocks.rail, Blocks.rail, Blocks.rail, Blocks.rail,
				Blocks.rail });

     } // end addRecipes
    
    private static void addFurnaceRecipes()
    {
        // recipes: Smelting
        GameRegistry.addSmelting(
                GoldenGlitter.largeRoseGoldChunkItem, new ItemStack(
                        GoldenGlitter.roseGoldIngot), 0.8F);
        GameRegistry.addSmelting(
                GoldenGlitter.largeErubescentGoldChunkItem,
                new ItemStack(GoldenGlitter.erubescentGoldIngot), 3.0F);
        GameRegistry.addSmelting(
                GoldenGlitter.largeScarlatiteGoldChunkItem,
                new ItemStack(GoldenGlitter.scarlatiteGoldIngot), 6.0F);
        GameRegistry.addSmelting(
                GoldenGlitter.largeHephaestanGoldChunkItem,
                new ItemStack(GoldenGlitter.hephaestanGoldIngot), 9.0F);
        
    } // end addFurnaceRecipes
    
    private static void addFusionRecipes()
    {
        // recipes: Fusion Furnace
        FusionRecipes.addSmelting(
                new ItemStack(Content.copper_ingot),
                new ItemStack(Items.gold_nugget),
                new ItemStack(Items.dye, 1, 1),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem), 6.0F);
        FusionRecipes.addSmelting(
                new ItemStack(Items.redstone), new ItemStack(Items.redstone),
                new ItemStack(Items.gold_ingot),
                new ItemStack(GoldenGlitter.largeErubescentGoldChunkItem),
                12.0F);
        FusionRecipes.addSmelting(
                new ItemStack(Items.redstone), new ItemStack(Items.redstone),
                new ItemStack(GoldenGlitter.erubescentGoldIngot),
                new ItemStack(GoldenGlitter.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionRecipes.addSmelting(
                new ItemStack(Items.lava_bucket), new ItemStack(Items.lava_bucket),
                new ItemStack(GoldenGlitter.scarlatiteGoldIngot),
                new ItemStack(GoldenGlitter.largeHephaestanGoldChunkItem),
                20.0F);
        
    } // end addFusionRecipes
    
    private static void addRecyclingRecipes()
    {
        // rose gold
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldHelm, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem),
                10.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldChest, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
                2, 0), new ItemStack(Items.coal, 2,
                OreDictionary.WILDCARD_VALUE), new ItemStack(
                GoldenGlitter.largeRoseGoldChunkItem, 2, 0), 20.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldLegs, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
                2, 0), new ItemStack(Items.coal, 2,
                OreDictionary.WILDCARD_VALUE), new ItemStack(
                GoldenGlitter.largeRoseGoldChunkItem, 2, 0), 20.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldBoots, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem),
                10.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem),
                10.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem),
                10.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem),
                10.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem),
                10.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.roseGoldHoe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(GoldenGlitter.largeRoseGoldChunkItem),
                10.0F);
        // erubescent gold
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.erubescentGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeErubescentGoldChunkItem),
                15.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.erubescentGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeErubescentGoldChunkItem),
                15.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.erubescentGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeErubescentGoldChunkItem),
                15.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.erubescentGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeErubescentGoldChunkItem),
                15.0F);
        // scarlatite gold
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.scarlatiteGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.scarlatiteGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.scarlatiteGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeScarlatiteGoldChunkItem),
                20.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.scarlatiteGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(
                        GoldenGlitter.largeScarlatiteGoldChunkItem),
                20.0F);
        // hephaestan gold
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.hephaestanGoldSword, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        GoldenGlitter.largeHephaestanGoldChunkItem),
                25.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.hephaestanGoldShovel, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        GoldenGlitter.largeHephaestanGoldChunkItem),
                25.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.hephaestanGoldAxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        GoldenGlitter.largeHephaestanGoldChunkItem),
                25.0F);
        FusionRecipes.addSmelting(new ItemStack(
                GoldenGlitter.hephaestanGoldPickaxe, 1,
                OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
                new ItemStack(Items.lava_bucket), new ItemStack(
                        GoldenGlitter.largeHephaestanGoldChunkItem),
                25.0F);
      
    } // end addRecyclingRecipes
} // end class Recipes
