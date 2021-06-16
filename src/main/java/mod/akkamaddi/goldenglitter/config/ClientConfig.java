package mod.akkamaddi.goldenglitter.config;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import net.minecraftforge.common.ForgeConfigSpec;

public final class ClientConfig
{
    final ForgeConfigSpec.BooleanValue clientMakeRoseHideous;
    final ForgeConfigSpec.BooleanValue clientMakeErubescentSparkle;
    final ForgeConfigSpec.BooleanValue clientMakeScarlatiteSparkle;
    final ForgeConfigSpec.BooleanValue clientMakeHephaestanSparkle;
    final ForgeConfigSpec.BooleanValue clientMakeRedGoldRailSparkle;
    
    ClientConfig(final ForgeConfigSpec.Builder builder) 
    {
        builder.push("General");
        clientMakeRoseHideous  = builder.comment("Make Rose Gold blocks hideous?")
                .translation(GoldenGlitter.MODID + "config.MakeRoseHideous")
                .define("MakeRoseHideous", false);
        clientMakeErubescentSparkle  = builder.comment("Make Erubescent Gold blocks sparkle?")
                .translation(GoldenGlitter.MODID + "config.MakeErubescentSparkle")
                .define("MakeErubescentSparkle", true);
        clientMakeScarlatiteSparkle  = builder.comment("Make Scarlatite Gold blocks sparkle?")
                .translation(GoldenGlitter.MODID + "config.MakeScarlatiteSparkle")
                .define("MakeScarlatiteSparkle", true);
        clientMakeHephaestanSparkle  = builder.comment("Make Hephaestan Gold blocks sparkle?")
                .translation(GoldenGlitter.MODID + "config.MakeHephaestanSparkle")
                .define("MakeHephaestanSparkle", true);
        clientMakeRedGoldRailSparkle  = builder.comment("Make Red Gold rails sparkle?")
                .translation(GoldenGlitter.MODID + "config.MakeRedGoldRailSparkle")
                .define("MakeRedGoldRailSparkle", true);
        builder.pop();
    } // end ctor
} // end-class

