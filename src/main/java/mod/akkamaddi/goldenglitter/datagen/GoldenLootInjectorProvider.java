package mod.akkamaddi.goldenglitter.datagen;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;

import mod.alexndr.simplecorelib.datagen.LootTableInjectorProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.util.ResourceLocation;

public class GoldenLootInjectorProvider extends LootTableInjectorProvider
{

    public GoldenLootInjectorProvider(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables()
    {
        tables.clear();
        // TODO
        // buried_treasure
        // simple_dungeon
        // shipwreck
        // desert_pyramid
        // jungle_temple
        // bastion
        // underwater_ruin
        
        return tables;
    }

} // end class
