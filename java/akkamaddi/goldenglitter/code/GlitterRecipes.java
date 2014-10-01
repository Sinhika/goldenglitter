package akkamaddi.goldenglitter.code;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.SimpleOres.core.Content;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class GlitterRecipes
{
    @SuppressWarnings("unchecked")
	public static void doGlitterRecipes()
    {
        // Ore Dictionary
        OreDictionary.registerOre("ingotRoseGold", new ItemStack(GoldenGlitterCore.roseGoldIngot));
        OreDictionary.registerOre("ingotErubescentGold", new ItemStack(GoldenGlitterCore.erubescentGoldIngot));
        OreDictionary.registerOre("ingotScarlatiteGold", new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot));
        OreDictionary.registerOre("ingotHephaestanGold", new ItemStack(GoldenGlitterCore.hephaestanGoldIngot));
        // recipes: Crafting
        //Storage Block
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockRoseGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.roseGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockErubescentGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.erubescentGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockScarlatiteGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.scarlatiteGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockHephaestanGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.hephaestanGoldIngot});
        //Item Recipe
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.roseGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockRoseGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.erubescentGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockErubescentGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockScarlatiteGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.hephaestanGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockHephaestanGold
                                        });
        // Tools
        //Rose Gold Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        //Rose Gold Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotRoseGold"
                }));
        //Erubescent Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        //Scarlatite Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        //Hephaestan Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        // recipes: Smelting
		GameRegistry.addSmelting(
				GoldenGlitterCore.largeRoseGoldChunkItem, new ItemStack(
						GoldenGlitterCore.roseGoldIngot), 0.8F);
		GameRegistry.addSmelting(
				GoldenGlitterCore.largeErubescentGoldChunkItem,
				new ItemStack(GoldenGlitterCore.erubescentGoldIngot), 3.0F);
		GameRegistry.addSmelting(
				GoldenGlitterCore.largeScarlatiteGoldChunkItem,
				new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot), 6.0F);
		GameRegistry.addSmelting(
				GoldenGlitterCore.largeHephaestanGoldChunkItem,
				new ItemStack(GoldenGlitterCore.hephaestanGoldIngot), 9.0F);
        
        // recipes: Fusion Furnace
		FusionRecipes.addSmelting(
				new ItemStack(Content.copper_ingot),
				new ItemStack(Items.gold_nugget),
				new ItemStack(Items.dye, 1, 1),
				new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 6.0F);
		FusionRecipes.addSmelting(
				new ItemStack(Items.redstone), new ItemStack(Items.redstone),
				new ItemStack(Items.gold_ingot),
				new ItemStack(GoldenGlitterCore.largeErubescentGoldChunkItem),
				12.0F);
		FusionRecipes.addSmelting(
				new ItemStack(Items.redstone), new ItemStack(Items.redstone),
				new ItemStack(GoldenGlitterCore.erubescentGoldIngot),
				new ItemStack(GoldenGlitterCore.largeScarlatiteGoldChunkItem),
				20.0F);
		FusionRecipes.addSmelting(
				new ItemStack(Items.lava_bucket), new ItemStack(Items.lava_bucket),
				new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot),
				new ItemStack(GoldenGlitterCore.largeHephaestanGoldChunkItem),
				20.0F);
        
        // Red Gold Rail
		GameRegistry.addShapelessRecipe(new ItemStack(
				GoldenGlitterCore.redGoldRail, 3), new Object[] {
				GoldenGlitterCore.erubescentGoldIngot, Blocks.rail, Blocks.rail,
				Blocks.rail });
		GameRegistry.addShapelessRecipe(new ItemStack(
				GoldenGlitterCore.redGoldRail, 8), new Object[] {
				GoldenGlitterCore.scarlatiteGoldIngot, Blocks.rail, Blocks.rail,
				Blocks.rail, Blocks.rail, Blocks.rail, Blocks.rail, Blocks.rail,
				Blocks.rail });

        if (GoldenGlitterCore.enableRecycling)
        {
            // rose gold
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldHelm, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem),
					10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldChest, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					GoldenGlitterCore.largeRoseGoldChunkItem, 2, 0), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldLegs, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel,
					2, 0), new ItemStack(Items.coal, 2,
					OreDictionary.WILDCARD_VALUE), new ItemStack(
					GoldenGlitterCore.largeRoseGoldChunkItem, 2, 0), 20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldBoots, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem),
					10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem),
					10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem),
					10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem),
					10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem),
					10.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.roseGoldHoe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem),
					10.0F);
			// erubescent gold
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.erubescentGoldSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeErubescentGoldChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.erubescentGoldShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeErubescentGoldChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.erubescentGoldAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeErubescentGoldChunkItem),
					15.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.erubescentGoldPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeErubescentGoldChunkItem),
					15.0F);
			// scarlatite gold
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.scarlatiteGoldSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeScarlatiteGoldChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.scarlatiteGoldShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeScarlatiteGoldChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.scarlatiteGoldAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeScarlatiteGoldChunkItem),
					20.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.scarlatiteGoldPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE),
					new ItemStack(
							GoldenGlitterCore.largeScarlatiteGoldChunkItem),
					20.0F);
			// hephaestan gold
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.hephaestanGoldSword, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							GoldenGlitterCore.largeHephaestanGoldChunkItem),
					25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.hephaestanGoldShovel, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							GoldenGlitterCore.largeHephaestanGoldChunkItem),
					25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.hephaestanGoldAxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							GoldenGlitterCore.largeHephaestanGoldChunkItem),
					25.0F);
			FusionRecipes.addSmelting(new ItemStack(
					GoldenGlitterCore.hephaestanGoldPickaxe, 1,
					OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.gravel),
					new ItemStack(Items.lava_bucket), new ItemStack(
							GoldenGlitterCore.largeHephaestanGoldChunkItem),
					25.0F);
        }
    }
}
