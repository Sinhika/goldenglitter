package mod.akkamaddi.goldenglitter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.alexndr.simplecorelib.helpers.LootUtils;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GoldenGlitter.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
    @SuppressWarnings("unused")
    private static final Logger LOGGER = LogManager.getLogger(GoldenGlitter.MODID + " Forge Event Subscriber");
    // private static final GoldenGlitterInjectionLookup lootLookupMap = new GoldenGlitterInjectionLookup();

    /**
     * add mod loot to loot tables. Code heavily based on Botania's LootHandler, which
     * neatly solves the problem when I couldn't figure it out.
     */
    @SubscribeEvent
    public static void LootLoad(final LootTableLoadEvent event)
    {
        if (GoldenConfig.addChestLoot)
        {
            LootUtils.LootLoadHandler(GoldenGlitter.MODID, event, lootLookupMap);
        } // end-if config allows
    } // end LootLoad()

} // end class
