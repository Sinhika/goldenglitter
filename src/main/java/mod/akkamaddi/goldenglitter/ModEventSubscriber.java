package mod.akkamaddi.goldenglitter;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.akkamaddi.goldenglitter.config.ConfigHelper;
import mod.akkamaddi.goldenglitter.config.ConfigHolder;
import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.akkamaddi.goldenglitter.init.ModBlocks;
import mod.alexndr.simplecorelib.api.config.FlagCondition;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = GoldenGlitter.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(GoldenGlitter.MODID + " Mod Event Subscriber");

    /**
     * For best inter-mod compatibility, run ore generation in a DeferredWorkQueue, per dieseiben07.
     * @param event
     */
    @SubscribeEvent
    public static void onCommonSetup(final FMLCommonSetupEvent event)
    {
//        event.enqueueWork(() -> {
////           OreGeneration.initNetherFeatures();
//        });
        LOGGER.debug("Common setup done");
    } // end onCommonSetup    
    
    /**
     * This method will be called by Forge when it is time for the mod to register its Items.
     * This method will always be called after the Block registry method.
     */
    @SubscribeEvent
    public static void onRegisterItems(RegisterEvent event)
    {
		if (event.getRegistryKey() == Registries.ITEM)
        {
	         // Automatically register BlockItems for all our Blocks
	        ModBlocks.BLOCKS.getEntries().stream()
	                .map(RegistryObject::get)
	                // You can do extra filtering here if you don't want some blocks to have an BlockItem automatically registered for them
	                // .filter(block -> needsItemBlock(block))
	                // Register the BlockItem for the block
	                .forEach(block -> {
	                    // Create the new BlockItem with the block and it's properties
	                    final BlockItem blockItem = new BlockItem(block, new Item.Properties());
	                    // Register the BlockItem
	                    event.register(Registries.ITEM,  helper -> {
	                        helper.register(ForgeRegistries.BLOCKS.getKey(block), blockItem);
	                    });
	                });
	        LOGGER.debug("Registered BlockItems");
        }
    } // end onRegisterItems()
    
    /**
     * ModConfig.ModConfigEvent handler.
     * @param event
     */
    @SubscribeEvent
    public static void onModConfigEvent(final ModConfigEvent event)
    {
        final ModConfig config = event.getConfig();

        // Rebake the configs when they change
        if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
            ConfigHelper.bakeServer(config);
        }
        // Rebake the configs when they change
        if (config.getSpec() == ConfigHolder.CLIENT_SPEC) {
            ConfigHelper.bakeClient(config);
        }
    } // onModConfigEvent

    /**
     * Recipe Serializer event handler.
     * @param evt
     */
    @SubscribeEvent
    public static void onRegisterRecipeSerializers(@Nonnull RegisterEvent event)
    {
        if (event.getRegistryKey() == Registries.RECIPE_SERIALIZER)
        {
            CraftingHelper.register(new FlagCondition.Serializer(GoldenConfig.INSTANCE, 
                new ResourceLocation(GoldenGlitter.MODID, "flag")));
        }
    } // end onRegisterRecipeSerializers
    
} // end class
    
