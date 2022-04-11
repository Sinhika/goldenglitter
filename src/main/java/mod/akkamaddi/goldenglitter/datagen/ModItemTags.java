package mod.akkamaddi.goldenglitter.datagen;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.init.ModItems;
import mod.alexndr.simplecorelib.helpers.TagUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends ItemTagsProvider
{

    public ModItemTags(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator, new ModBlockTags(dataGenerator, existingFileHelper), GoldenGlitter.MODID, 
              existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        registerNuggetTags();
        registerIngotTags();
    }

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
