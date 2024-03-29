package mod.akkamaddi.goldenglitter.datagen;

import java.util.concurrent.CompletableFuture;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.akkamaddi.goldenglitter.init.ModItems;
import mod.alexndr.simplecorelib.api.datagen.MiningItemTags;
import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends MiningItemTags
{

    public ModItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
			CompletableFuture<TagLookup<Block>> blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTagProvider, GoldenGlitter.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider)
    {
        super.addTags(lookupProvider);
        registerNuggetTags();
        registerIngotTags();
        registerStorageBlockTags();
        registerToolTags(ModItems.ITEMS);
        registerArmorTags(ModItems.ITEMS);
    }

    /**
     * Create standard forge tags for storage blocks.
     */
    private void registerStorageBlockTags()
    {
        this.tag(TagUtils.forgeTag("storage_blocks"))
            .addTag(TagUtils.forgeTag("storage_blocks/rose_gold_block"))
            .addTag(TagUtils.forgeTag("storage_blocks/erubescent_gold_block"))
            .addTag(TagUtils.forgeTag("storage_blocks/scarlatite_gold_block"))
            .addTag(TagUtils.forgeTag("storage_blocks/hephaestan_gold_block"));
        
        this.tag(TagUtils.forgeTag("storage_blocks/rose_gold_block"))
            .add(ModBlocks.rose_gold_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_blocks/erubescent_gold_block"))
            .add(ModBlocks.erubescent_gold_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_blocks/scarlatite_gold_block"))
            .add(ModBlocks.scarlatite_gold_block.get().asItem());
        this.tag(TagUtils.forgeTag("storage_blocks/hephaestan_gold_block"))
            .add(ModBlocks.hephaestan_gold_block.get().asItem());
    } // end registerStorageBlockTags

    
    private void registerNuggetTags()
    {
        this.tag(TagUtils.forgeTag("nuggets"))
            .addTag(TagUtils.forgeTag("nuggets/rose_gold"))
            .addTag(TagUtils.forgeTag("nuggets/erubescent_gold"))
            .addTag(TagUtils.forgeTag("nuggets/scarlatite_gold"))
            .addTag(TagUtils.forgeTag("nuggets/hephaestan_gold"));
    
        this.tag(TagUtils.forgeTag("nuggets/rose_gold")).add(ModItems.rose_gold_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/erubescent_gold")).add(ModItems.erubescent_gold_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/scarlatite_gold")).add(ModItems.scarlatite_gold_nugget.get());
        this.tag(TagUtils.forgeTag("nuggets/hephaestan_gold")).add(ModItems.hephaestan_gold_nugget.get());
    } // end registerNuggetTags()
    
    
    private void registerIngotTags()
    {
        this.tag(TagUtils.forgeTag("ingots"))
            .addTag(TagUtils.forgeTag("ingots/rose_gold"))
            .addTag(TagUtils.forgeTag("ingots/erubescent_gold"))
            .addTag(TagUtils.forgeTag("ingots/scarlatite_gold"))
            .addTag(TagUtils.forgeTag("ingots/hephaestan_gold"));
        
        this.tag(TagUtils.forgeTag("ingots/rose_gold")).add(ModItems.rose_gold_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/erubescent_gold")).add(ModItems.erubescent_gold_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/scarlatite_gold")).add(ModItems.scarlatite_gold_ingot.get());
        this.tag(TagUtils.forgeTag("ingots/hephaestan_gold")).add(ModItems.hephaestan_gold_ingot.get());
    } // end registerIngotTags()
    
} // end class
