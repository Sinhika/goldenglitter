package mod.akkamaddi.goldenglitter.datagen;

import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.alexndr.simplecorelib.api.datagen.SimpleBlockLootSubProvider;

public class GoldenLootTableSubprovider extends SimpleBlockLootSubProvider
{

    @Override
    protected void generate()
    {
    	dropSelf(ModBlocks.rose_gold_block.get());
    	dropSelf(ModBlocks.erubescent_gold_block.get());
    	dropSelf(ModBlocks.scarlatite_gold_block.get());
    	dropSelf(ModBlocks.hephaestan_gold_block.get());
    	dropSelf(ModBlocks.red_gold_rail.get());
    }

}
