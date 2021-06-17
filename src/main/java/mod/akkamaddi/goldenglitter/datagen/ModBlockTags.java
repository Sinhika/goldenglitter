package mod.akkamaddi.goldenglitter.datagen;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends BlockTagsProvider
{
    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, GoldenGlitter.MODID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        registerStorageBlockTags();
        registerBeaconBlockTags();
        registerRailTags();
    } // end registerTags()
 
    /**
     * Create standard forge tags for storage blocks.
     */
    private void registerStorageBlockTags()
    {
        this.tag(TagUtils.forgeBlockTag("storage_blocks"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/rose_gold_block"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/erubescent_gold_block"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/scarlatite_gold_block"))
            .addTag(TagUtils.forgeBlockTag("storage_blocks/hephaestan_gold_block"));
        
        this.tag(TagUtils.forgeBlockTag("storage_blocks/rose_gold_block"))
            .add(ModBlocks.rose_gold_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/erubescent_gold_block"))
            .add(ModBlocks.erubescent_gold_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/scarlatite_gold_block"))
            .add(ModBlocks.scarlatite_gold_block.get());
        this.tag(TagUtils.forgeBlockTag("storage_blocks/hephaestan_gold_block"))
            .add(ModBlocks.hephaestan_gold_block.get());
    } // end registerStorageBlockTags
    
    /**
     * Identify metal blocks as beacon block bases.
     */
    private void registerBeaconBlockTags()
    {
        this.tag(BlockTags.BEACON_BASE_BLOCKS)
            .add(ModBlocks.rose_gold_block.get())
            .add(ModBlocks.erubescent_gold_block.get())
            .add(ModBlocks.scarlatite_gold_block.get())
            .add(ModBlocks.hephaestan_gold_block.get());
    }
    
    /**
     * Identify rails as rails.
     */
    private void registerRailTags()
    {
        this.tag(BlockTags.RAILS)
            .add(ModBlocks.red_gold_rail.get());
    }
     
} // end class
