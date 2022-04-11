package mod.akkamaddi.goldenglitter.datagen;

import java.util.List;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.alexndr.simplecorelib.datagen.MiningBlockTags;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockTags extends MiningBlockTags
{
    public ModBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, GoldenGlitter.MODID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        super.addTags();
        registerStorageBlockTags();
        registerBeaconBlockTags();
        registerRailTags();
    } // end registerTags()
 
    
    
    @Override
    protected void registerMiningTags()
    {
        // all the registered blocks are mineable.
        List<Block> mineables = ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();

        // do nothing; super() generates all the vanilla blocktags, and we don't want that.
        // note: all the mineable blocks are iron-level.
        registerMineableTags(mineables, 
                List.of(), // 1 stone
                List.of(ModBlocks.erubescent_gold_block.get(), ModBlocks.hephaestan_gold_block.get(), 
                        ModBlocks.rose_gold_block.get(), ModBlocks.scarlatite_gold_block.get()), // 2 - iron
                List.of(), // 3 - diamond
                List.of()); // 4 - netherite
    }

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
