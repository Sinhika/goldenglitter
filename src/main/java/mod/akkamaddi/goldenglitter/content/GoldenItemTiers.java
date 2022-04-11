package mod.akkamaddi.goldenglitter.content;

import java.util.List;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public class GoldenItemTiers 
{
    public static final Tag.Named<Block> ROSE_GOLD_TAG =
            BlockTags.createOptional(new ResourceLocation(GoldenGlitter.MODID, "needs_rose_gold_tool"));
    public static final Tag.Named<Block> ERUBESCENT_GOLD_TAG =
            BlockTags.createOptional(new ResourceLocation(GoldenGlitter.MODID, "needs_erubescent_gold_tool"));
    public static final Tag.Named<Block> SCARLATITE_GOLD_TAG =
            BlockTags.createOptional(new ResourceLocation(GoldenGlitter.MODID, "needs_scarlatite_gold_tool"));
    public static final Tag.Named<Block> HEPHAESTAN_GOLD_TAG =
            BlockTags.createOptional(new ResourceLocation(GoldenGlitter.MODID, "needs_hephaestan_gold_tool"));
    
    public static final Tier ROSE_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), 240, 9.0F, 1.0F, 14, ROSE_GOLD_TAG, ()->Ingredient.of(ModItems.rose_gold_ingot.get())),
            new ResourceLocation(GoldenGlitter.MODID, "rose_gold"), List.of(Tiers.STONE), List.of(Tiers.IRON));
    public static final Tier ERUBESCENT_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 18, 16.0F, 3.0F, 22, ERUBESCENT_GOLD_TAG, ()->Ingredient.of(ModItems.erubescent_gold_ingot.get())),
            new ResourceLocation(GoldenGlitter.MODID, "erubescent_gold"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
    public static final Tier SCARLATITE_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(5, 38, 18.0F, 4.0F, 28, SCARLATITE_GOLD_TAG, ()->Ingredient.of(ModItems.scarlatite_gold_ingot.get())),
            new ResourceLocation(GoldenGlitter.MODID, "scarlatite_gold"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier HEPHAESTAN_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(7, 222, 28.0F, 5.0F, 30, HEPHAESTAN_GOLD_TAG, ()->Ingredient.of(ModItems.hephaestan_gold_ingot.get())),
            new ResourceLocation(GoldenGlitter.MODID, "HEPHAESTAN_GOLD"), List.of(SCARLATITE_GOLD), List.of());
} // end class
