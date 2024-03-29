package mod.akkamaddi.goldenglitter.datagen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.akkamaddi.goldenglitter.init.ModItems;
import mod.akkamaddi.goldenglitter.init.ModTags;
import mod.alexndr.fusion.api.datagen.AbstractFusionRecipeProvider;
import mod.alexndr.fusion.api.datagen.FusionRecipeSetBuilder;
import mod.alexndr.simplecorelib.api.datagen.ISimpleConditionBuilder;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class FusionRecipes extends AbstractFusionRecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{
    private FusionRecipeSetBuilder fusionbuilder;

    public FusionRecipes(PackOutput pOutput)
    {
        super(pOutput);
        fusionbuilder = new FusionRecipeSetBuilder(GoldenGlitter.MODID);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        registerRoseGoldRecipes(consumer);
        registerErubescentGoldRecipes(consumer);
        registerScarlatiteGoldRecipes(consumer);
        registerHephaestanGoldRecipes(consumer);
    }

    /**
     * RoseGold alloying and fusion recycling recipes.
     */
    protected void registerRoseGoldRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(ModTags.Items.INGOTS_COPPER));
        primary_inputs.add(Ingredient.of(Items.GOLD_NUGGET));
        catalysts[0] = null;
        catalysts[1] = null;
        catalysts[2] = Ingredient.of(Items.RED_DYE);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                null, null, ModItems.large_rose_gold_chunk.get(),
                1.5F, 600, flag("rose_gold_making"));
        
        // rose_gold fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.rose_gold_axe.get(), 
                ModItems.rose_gold_boots.get(), ModItems.rose_gold_helmet.get(),
                ModItems.rose_gold_hoe.get(), ModItems.rose_gold_pickaxe.get(),
                ModItems.rose_gold_shovel.get(), ModItems.rose_gold_sword.get()),
                Ingredient.of(ModItems.rose_gold_chestplate.get(), ModItems.rose_gold_leggings.get()),
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.rose_gold_ingot.get(), 10.0F, 600, flag("recycle_golden_glitter"), 
                "recycle_rose_gold_items");
    } // end registerRoseGoldRecipes

    /**
     * ErubescentGold alloying and fusion recycling recipes.
     */
    protected void registerErubescentGoldRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(Items.REDSTONE));
        primary_inputs.add(Ingredient.of(Items.REDSTONE));
        catalysts[0] = null;
        catalysts[1] = null;
        catalysts[2] = Ingredient.of(Items.GOLD_INGOT);
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                null, null, ModItems.large_erubescent_gold_chunk.get(),
                3.0F, 600, flag("erubescent_gold_making"));
        
        // erubescent_gold fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.erubescent_gold_axe.get(), 
                ModItems.erubescent_gold_pickaxe.get(),
                ModItems.erubescent_gold_shovel.get(), ModItems.erubescent_gold_sword.get()),
                null,
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.erubescent_gold_ingot.get(), 7.0F, 600, flag("recycle_golden_glitter"), 
                "recycle_erubescent_gold_items");
    } // end registerErubescentGoldRecipes
    
    /**
     * Pyropus Bronze alloying and fusion recycling recipes.
     */
    protected void registerScarlatiteGoldRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(Items.REDSTONE));
        primary_inputs.add(Ingredient.of(Items.REDSTONE));
        catalysts[0] = null;
        catalysts[1] = null;
        catalysts[2] = Ingredient.of(ModItems.erubescent_gold_ingot.get());
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                null, null, ModItems.large_scarlatite_gold_chunk.get(),
                3.0F, 600, flag("scarlatite_gold_making"));
        
        // scarlatite_gold fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.scarlatite_gold_axe.get(), 
                ModItems.scarlatite_gold_pickaxe.get(),
                ModItems.scarlatite_gold_shovel.get(), ModItems.scarlatite_gold_sword.get()),
                null,
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(ItemTags.COALS), 
                ModItems.scarlatite_gold_ingot.get(), 20.0F, 600, flag("recycle_golden_glitter"), 
                "recycle_scarlatite_gold_items");
    } // end registerScarlatiteGoldRecipes

    /**
     * Pulchrum Bronze alloying and fusion recycling recipes.
     */
    protected void registerHephaestanGoldRecipes(Consumer<FinishedRecipe> consumer)
    {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];
        
        primary_inputs.add(Ingredient.of(Items.LAVA_BUCKET));
        primary_inputs.add(Ingredient.of(Items.LAVA_BUCKET));
        catalysts[0] = null;
        catalysts[1] = null;
        catalysts[2] = Ingredient.of(ModItems.scarlatite_gold_ingot.get());
        
        fusionbuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, 
                null, null, ModItems.large_hephaestan_gold_chunk.get(),
                4.0F, 600, flag("hephaestan_gold_making"));
        
        // hephaestan_gold fusion recycling recipes
        fusionbuilder.buildFusionRecyclingRecipes(consumer, Ingredient.of(ModItems.hephaestan_gold_axe.get(), 
                ModItems.hephaestan_gold_pickaxe.get(),ModItems.hephaestan_gold_shovel.get(), ModItems.hephaestan_gold_sword.get()),
                null,
                Ingredient.of(Blocks.GRAVEL), Ingredient.of(Items.LAVA_BUCKET), 
                ModItems.hephaestan_gold_ingot.get(), 25.0F, 600, flag("recycle_golden_glitter"), 
                "recycle_hephaestan_gold_items");
    } // end registerHephaestanGoldRecipes

    
    @Override
    public ICondition flag(String name)
    {
        // TODO Auto-generated method stub
        return impl_flag(GoldenGlitter.MODID, GoldenConfig.INSTANCE, name);
    }


} // end class
