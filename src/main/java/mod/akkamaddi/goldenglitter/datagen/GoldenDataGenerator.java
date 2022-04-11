package mod.akkamaddi.goldenglitter.datagen;


import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

/**
 * bundles up the GatherDataEvent handler and all the necessary data providers for
 * data generation.
 * @author Sinhika
 */
@EventBusSubscriber(modid = GoldenGlitter.MODID, bus = MOD)
public class GoldenDataGenerator
{
    /**
     * GatherDataEvent handler.
     * @param event the GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer())
        {
            gen.addProvider(new Recipes(gen));
            gen.addProvider(new FusionRecipes(gen));
            gen.addProvider(new ModItemTags(gen, event.getExistingFileHelper()));
            gen.addProvider(new ModBlockTags(gen, event.getExistingFileHelper()));
            gen.addProvider(new GoldenLootTableProvider(gen));
            gen.addProvider(new GoldenLootInjectorProvider(gen));
        }
    } // end gatherData()
} // end class
