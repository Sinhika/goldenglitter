package mod.akkamaddi.goldenglitter.datagen;

import java.util.function.BiConsumer;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.akkamaddi.goldenglitter.init.ModItems;
import mod.alexndr.simplecorelib.api.datagen.LootTableInjectorProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class GoldenLootInjectorSubprovider extends LootTableInjectorProvider
{

    @Override
    public void generate(BiConsumer<ResourceLocation, Builder> bar) 
    {
        // buried_treasure
        LootPool.Builder foo = createChestPool(1, 1, 0.25F)
                .add(LootItem.lootTableItem(ModItems.rose_gold_ingot.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.erubescent_gold_ingot.get()).setWeight(5)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.scarlatite_gold_ingot.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.hephaestan_gold_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(bar, getInjectionTableId(GoldenGlitter.MODID, "buried_treasure"), foo);
        
        // abandoned_mineshaft
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModBlocks.red_gold_rail.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(bar, getInjectionTableId(GoldenGlitter.MODID, "abandoned_mineshaft"), foo);
                   
        // simple_dungeon
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModItems.rose_gold_nugget.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.erubescent_gold_nugget.get()).setWeight(5)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.scarlatite_gold_nugget.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.hephaestan_gold_nugget.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(bar, getInjectionTableId(GoldenGlitter.MODID, "simple_dungeon"), foo);
        
        // shipwreck
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModItems.rose_gold_ingot.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.erubescent_gold_ingot.get()).setWeight(5)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.scarlatite_gold_ingot.get()).setWeight(2)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))
                .add(LootItem.lootTableItem(ModItems.hephaestan_gold_ingot.get()).setWeight(1)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));
        addInjectionTable(bar, getInjectionTableId(GoldenGlitter.MODID, "shipwreck"), foo);
        
        // underwater_ruin
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModItems.rose_gold_ingot.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.rose_gold_sword.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.rose_gold_helmet.get()).setWeight(1));
        addInjectionTable(bar, getInjectionTableId(GoldenGlitter.MODID, "underwater_ruin"), foo);
        
        // desert_pyramid
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModItems.rose_gold_ingot.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.erubescent_gold_ingot.get()).setWeight(1)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))))
                .add(LootItem.lootTableItem(ModItems.rose_gold_helmet.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.rose_gold_chestplate.get()).setWeight(1));
        addInjectionTable(bar, getInjectionTableId(GoldenGlitter.MODID, "desert_pyramid"), foo);
                
        // jungle_temple
        foo = createChestPool(1,1,0.25F)
                .add(LootItem.lootTableItem(ModItems.rose_gold_ingot.get()).setWeight(10)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                .add(LootItem.lootTableItem(ModItems.rose_gold_leggings.get()).setWeight(1))
                .add(LootItem.lootTableItem(ModItems.rose_gold_boots.get()).setWeight(1));
        addInjectionTable(bar, getInjectionTableId(GoldenGlitter.MODID, "jungle_temple"), foo);
    } // end getTables()

} // end class
