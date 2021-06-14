package mod.akkamaddi.goldenglitter.config;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import net.minecraftforge.common.ForgeConfigSpec;

public final class ServerConfig
{
    // general
    final ForgeConfigSpec.BooleanValue serverAddChestLoot;

    final ForgeConfigSpec.BooleanValue serverEnableRoseGoldMaking;
    final ForgeConfigSpec.BooleanValue serverEnableErubescentMaking;
    final ForgeConfigSpec.BooleanValue serverEnableHephaestanMaking;
    final ForgeConfigSpec.BooleanValue serverEnableScarlatiteMaking;
    
    // fusion recycling
    final ForgeConfigSpec.BooleanValue serverEnableFusionFurnaceRecycling;
    
    // tool recipes
    final ForgeConfigSpec.BooleanValue serverEnableRoseGoldTools;
    final ForgeConfigSpec.BooleanValue serverEnableErubescentTools;
    final ForgeConfigSpec.BooleanValue serverEnableHephaestanTools;
    final ForgeConfigSpec.BooleanValue serverEnableScarlatiteTools;

    // armor recipes
    final ForgeConfigSpec.BooleanValue serverEnableRoseGoldArmor;
    
    // misc recipes
    final ForgeConfigSpec.BooleanValue serverEnableRails;
    
    ServerConfig(final ForgeConfigSpec.Builder builder)
    {
        builder.push("General");
        serverAddChestLoot = builder.comment("Allow Golden Glitter loot to be added to chests?")
                .translation(GoldenGlitter.MODID + ".config.addChestLoot")
                .define("AddChestLoot", true);
        builder.pop();
        
        builder.push("Alloy Recipes");
        serverEnableRoseGoldMaking = builder.comment("false disables alloy recipes")
                .translation(GoldenGlitter.MODID + ".config.enableRoseGoldMaking")
                .define("EnableRoseGoldMaking", true);
        serverEnableErubescentMaking = builder.comment("false disables alloy recipes")
                .translation(GoldenGlitter.MODID + ".config.enableErubescentGoldMaking")
                .define("EnableErubescentGoldMaking", true);
        serverEnableHephaestanMaking = builder.comment("false disables alloy recipes")
                .translation(GoldenGlitter.MODID + ".config.enableHephaestanGoldMaking")
                .define("EnableHephaestanGoldMaking", true);
        serverEnableScarlatiteMaking = builder.comment("false disables alloy recipes")
                .translation(GoldenGlitter.MODID + ".config.enableScarlatiteGoldMaking")
                .define("EnableScarlatiteGoldMaking", true);
        builder.pop();
        builder.push("Tools");
        serverEnableRoseGoldTools = builder.comment("false disables recipes")
                .translation(GoldenGlitter.MODID + ".config.enableRoseGoldTools")
                .define("EnableRoseGoldTools", true);
        serverEnableErubescentTools = builder.comment("false disables recipes")
                .translation(GoldenGlitter.MODID + ".config.enableErubescentGoldTools")
                .define("EnableErubescentGoldTools", true);
        serverEnableHephaestanTools = builder.comment("false disables recipes")
                .translation(GoldenGlitter.MODID + ".config.enableHephaestanGoldTools")
                .define("EnableHephaestanGoldTools", true);
        serverEnableScarlatiteTools = builder.comment("false disables recipes")
                .translation(GoldenGlitter.MODID + ".config.enableScarlatiteGoldTools")
                .define("EnableScarlatiteGoldTools", true);
        builder.pop();
        builder.push("Armor");
        serverEnableRoseGoldArmor = builder.comment("false disables recipes")
                .translation(GoldenGlitter.MODID + ".config.enableRoseGoldArmor")
                .define("EnableRoseGoldArmor", true);
        builder.pop();
        builder.push("Rails");
        serverEnableRails = builder.comment("false disables recipes")
                .translation(GoldenGlitter.MODID + ".config.enableGoldenRails")
                .define("EnableRailRecipes", true);
        builder.pop();
        builder.push("Fusion Recycling");
        serverEnableFusionFurnaceRecycling = builder.comment("Enable Fusion Recycling recipes for gold alloys?")
                .translation(GoldenGlitter.MODID + ".config.enableFusionFurnaceRecycling")
                .define("enableFusionFurnaceRecycling", true);
        builder.pop();
        
    } // end ctor()
    
} // end class
