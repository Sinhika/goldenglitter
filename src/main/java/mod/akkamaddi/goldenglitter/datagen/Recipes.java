package mod.akkamaddi.goldenglitter.datagen;

import java.util.function.Consumer;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.akkamaddi.goldenglitter.init.ModItems;
import mod.alexndr.simplecorelib.datagen.ISimpleConditionBuilder;
import mod.alexndr.simplecorelib.datagen.RecipeSetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class Recipes extends RecipeProvider implements IConditionBuilder, ISimpleConditionBuilder
{
    private RecipeSetBuilder setbuilder;

    public Recipes(DataGenerator generatorIn)
    {
        super(generatorIn);
        setbuilder = new RecipeSetBuilder(GoldenGlitter.MODID);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        registerStorageRecipes(consumer);
        registerMiscRecipes(consumer);
        registerToolRecipes(consumer);
        registerArmorRecipes(consumer);
        registerFurnaceRecipes(consumer);
    } // end registerRecipes

    private void registerFurnaceRecipes(Consumer<FinishedRecipe> consumer)
    {
        // large chunks
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_rose_gold_chunk.get()),
                ModItems.rose_gold_ingot.get(), has(ModItems.large_rose_gold_chunk.get()), 
                0.8F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_erubescent_gold_chunk.get()),
                ModItems.erubescent_gold_ingot.get(), has(ModItems.large_erubescent_gold_chunk.get()), 
                3.0F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_scarlatite_gold_chunk.get()),
                ModItems.scarlatite_gold_ingot.get(), has(ModItems.large_scarlatite_gold_chunk.get()), 
                6.0F, 200);
        setbuilder.buildOre2IngotRecipes(consumer, Ingredient.of(ModItems.large_hephaestan_gold_chunk.get()),
                ModItems.hephaestan_gold_ingot.get(), has(ModItems.large_hephaestan_gold_chunk.get()), 
                9.0F, 200);
        
        // vanilla recycling.
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.erubescent_gold_axe.get(), 
                ModItems.erubescent_gold_pickaxe.get(),
                ModItems.erubescent_gold_shovel.get(), ModItems.erubescent_gold_sword.get()), 
                ModItems.erubescent_gold_nugget.get(), has(ModItems.erubescent_gold_axe.get()), 3.0F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.rose_gold_axe.get(), 
                ModItems.rose_gold_boots.get(), ModItems.rose_gold_chestplate.get(), ModItems.rose_gold_helmet.get(),
                ModItems.rose_gold_hoe.get(), ModItems.rose_gold_leggings.get(), ModItems.rose_gold_pickaxe.get(),
                ModItems.rose_gold_shovel.get(), ModItems.rose_gold_sword.get()), 
                ModItems.rose_gold_nugget.get(), has(ModItems.rose_gold_axe.get()), 0.8F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer, Ingredient.of(ModItems.scarlatite_gold_axe.get(), 
                ModItems.scarlatite_gold_pickaxe.get(),
                ModItems.scarlatite_gold_shovel.get(), ModItems.scarlatite_gold_sword.get()), 
                ModItems.scarlatite_gold_nugget.get(), has(ModItems.scarlatite_gold_axe.get()), 6.0F, 200);
        setbuilder.buildVanillaRecyclingRecipes(consumer,
                Ingredient.of(ModItems.hephaestan_gold_axe.get(), ModItems.hephaestan_gold_pickaxe.get(),
                        ModItems.hephaestan_gold_shovel.get(), ModItems.hephaestan_gold_sword.get()),
                ModItems.hephaestan_gold_nugget.get(), has(ModItems.hephaestan_gold_axe.get()), 9.0F, 200);
        
    } // end registerFurnaceRecipes()

    private void registerArmorRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleArmorSet(consumer, Ingredient.of(ModItems.rose_gold_ingot.get()), 
                "rose_gold", has(ModItems.rose_gold_ingot.get()), flag("rose_gold_armor"));
    } // end registerArmorRecipes()

    private void registerToolRecipes(Consumer<FinishedRecipe> consumer)
    {
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.rose_gold_ingot.get()), "rose_gold",
                has(ModItems.rose_gold_ingot.get()), flag("rose_gold_tools"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.erubescent_gold_ingot.get()), "erubescent_gold",
                has(ModItems.erubescent_gold_ingot.get()), flag("erubescent_gold_tools"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.hephaestan_gold_ingot.get()), "hephaestan_gold",
                has(ModItems.hephaestan_gold_ingot.get()), flag("hephaestan_gold_tools"), false);
        setbuilder.buildSimpleToolSet(consumer, Ingredient.of(ModItems.scarlatite_gold_ingot.get()), "scarlatite_gold",
                has(ModItems.scarlatite_gold_ingot.get()), flag("scarlatite_gold_tools"), false);
    } // end registerToolRecipes()

    /** 
     * pressure plates go here if we ever get any.
     * @param consumer
     */
    private void registerMiscRecipes(Consumer<FinishedRecipe> consumer)
    {
        ResourceLocation red_gold_rails1 = new ResourceLocation(GoldenGlitter.MODID, "red_gold_rail1");
        ResourceLocation red_gold_rails2 = new ResourceLocation(GoldenGlitter.MODID, "red_gold_rail2");
        
        ConditionalRecipe.builder().addCondition(flag("red_gold_rails"))
            .addRecipe( ShapelessRecipeBuilder.shapeless(ModBlocks.red_gold_rail.get().asItem(), 3)
                .requires(ModItems.erubescent_gold_ingot.get())
                .requires(Ingredient.of(Blocks.RAIL), 3)
                .unlockedBy("has_item", has(ModItems.erubescent_gold_ingot.get()))
                ::save)
            .setAdvancement(red_gold_rails1, 
                    setbuilder.build_advancement_with_condition(red_gold_rails1, flag("red_gold_rails"), 
                            has(ModItems.erubescent_gold_ingot.get())))
            .build(consumer, red_gold_rails1);
           
        ConditionalRecipe.builder().addCondition(flag("red_gold_rails"))
            .addRecipe( ShapelessRecipeBuilder.shapeless(ModBlocks.red_gold_rail.get().asItem(), 8)
                .requires(ModItems.scarlatite_gold_ingot.get())
                .requires(Ingredient.of(Blocks.RAIL), 8)
                .unlockedBy("has_item", has(ModItems.scarlatite_gold_ingot.get()))
                ::save)
            .setAdvancement(red_gold_rails2, 
                    setbuilder.build_advancement_with_condition(red_gold_rails2, flag("red_gold_rails"), 
                            has(ModItems.scarlatite_gold_ingot.get())))
            .build(consumer, red_gold_rails2);
       
    } // end registerMiscRecipes()

    /**
     * build and register storage recipes; i.e., nugget => ingot => block conversions.
     * @param consumer
     */
    private void registerStorageRecipes(Consumer<FinishedRecipe> consumer)
    {
        // vanilla storage recipes
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.rose_gold_ingot.get(), ModBlocks.rose_gold_block.get(),
                ModItems.rose_gold_nugget.get(), has(ModItems.rose_gold_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.erubescent_gold_ingot.get(), ModBlocks.erubescent_gold_block.get(),
                ModItems.erubescent_gold_nugget.get(), has(ModItems.erubescent_gold_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.scarlatite_gold_ingot.get(), ModBlocks.scarlatite_gold_block.get(),
                ModItems.scarlatite_gold_nugget.get(), has(ModItems.scarlatite_gold_ingot.get()));
        setbuilder.buildSimpleStorageRecipes(consumer, ModItems.hephaestan_gold_ingot.get(), ModBlocks.hephaestan_gold_block.get(),
                ModItems.hephaestan_gold_nugget.get(), has(ModItems.hephaestan_gold_ingot.get()));
        
        // chunk conversion recipes
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.rose_gold_nugget.get(),
                null, ModItems.large_rose_gold_chunk.get(), 
                has(ModItems.rose_gold_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.erubescent_gold_nugget.get(),
                null, ModItems.large_erubescent_gold_chunk.get(), 
                has(ModItems.erubescent_gold_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.scarlatite_gold_nugget.get(),
                null, ModItems.large_scarlatite_gold_chunk.get(), 
                has(ModItems.scarlatite_gold_nugget.get()));
        setbuilder.buildChunkConversionRecipes(consumer, ModItems.hephaestan_gold_nugget.get(),
                null, ModItems.large_hephaestan_gold_chunk.get(), 
                has(ModItems.hephaestan_gold_nugget.get()));
    } // end registerStorageRecipes()


    @Override
    public ICondition flag(String name)
    {
        return impl_flag(GoldenGlitter.MODID, GoldenConfig.INSTANCE, name);
    }

} // end class
