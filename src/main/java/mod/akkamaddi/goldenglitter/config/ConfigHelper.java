package mod.akkamaddi.goldenglitter.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper
{
    public static void bakeServer(final ModConfig config)
    {
        GoldenConfig.addChestLoot = ConfigHolder.SERVER.serverAddChestLoot.get();
        
        // fusion recycling flag
        GoldenConfig.INSTANCE.putFlag("recycle_golden_glitter", ConfigHolder.SERVER.serverEnableFusionFurnaceRecycling.get());
        
        // fusion alloy recipe flags
        GoldenConfig.INSTANCE.putFlag("rose_gold_making", ConfigHolder.SERVER.serverEnableRoseGoldMaking.get());
        GoldenConfig.INSTANCE.putFlag("erubescent_gold_making", ConfigHolder.SERVER.serverEnableErubescentMaking.get());
        GoldenConfig.INSTANCE.putFlag("hephaestan_gold_making", ConfigHolder.SERVER.serverEnableHephaestanMaking.get());
        GoldenConfig.INSTANCE.putFlag("scarlatite_gold_making", ConfigHolder.SERVER.serverEnableScarlatiteMaking.get());
        
        // tool crafting recipe flags
        GoldenConfig.INSTANCE.putFlag("rose_gold_tools", ConfigHolder.SERVER.serverEnableRoseGoldTools.get());
        GoldenConfig.INSTANCE.putFlag("erubescent_gold_tools", ConfigHolder.SERVER.serverEnableErubescentTools.get());
        GoldenConfig.INSTANCE.putFlag("hephaestan_gold_tools", ConfigHolder.SERVER.serverEnableHephaestanTools.get());
        GoldenConfig.INSTANCE.putFlag("scarlatite_gold_tools", ConfigHolder.SERVER.serverEnableScarlatiteTools.get());
        
        // armor crafting recipe flag
        GoldenConfig.INSTANCE.putFlag("rose_gold_armor", ConfigHolder.SERVER.serverEnableRoseGoldArmor.get());
        
        // rail crafting recipes.
        GoldenConfig.INSTANCE.putFlag("red_gold_rails", ConfigHolder.SERVER.serverEnableRails.get());
    } // end bakeServer()
   
    
    public static void bakeClient(final ModConfig config)
    {
        GoldenConfig.makeRoseHideous = ConfigHolder.CLIENT.clientMakeRoseHideous.get();
        GoldenConfig.makeErubescentSparkle = ConfigHolder.CLIENT.clientMakeErubescentSparkle.get();
        GoldenConfig.makeHephaestanSparkle = ConfigHolder.CLIENT.clientMakeHephaestanSparkle.get();
        GoldenConfig.makeScarlatiteSparkle = ConfigHolder.CLIENT.clientMakeScarlatiteSparkle.get();
        GoldenConfig.makeRedGoldRailSparkle = ConfigHolder.CLIENT.clientMakeRedGoldRailSparkle.get();
    } // end bakeClient
} // end class
