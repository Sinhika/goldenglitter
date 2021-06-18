package mod.akkamaddi.goldenglitter.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.alexndr.simplecorelib.datagen.BlockLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.util.ResourceLocation;

public class GoldenLootTableProvider extends BlockLootTableProvider
{

    public GoldenLootTableProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables()
    {
        tables.clear();
        standardDropTable(ModBlocks.rose_gold_block.get());
        standardDropTable(ModBlocks.erubescent_gold_block.get());
        standardDropTable(ModBlocks.scarlatite_gold_block.get());
        standardDropTable(ModBlocks.hephaestan_gold_block.get());
        standardDropTable(ModBlocks.red_gold_rail.get());
        return tables;
    }

}
