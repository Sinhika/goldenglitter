package mod.akkamaddi.goldenglitter.config;

import mod.alexndr.simplecorelib.config.SimpleConfig;

public class GoldenConfig extends SimpleConfig
{
    public static GoldenConfig INSTANCE = new GoldenConfig(); 
    
    // loot
    public static boolean addChestLoot;

    // client-side shenanigans
    public static boolean makeRoseHideous;
    public static boolean makeErubescentSparkle;
    public static boolean makeScarlatiteSparkle;
    public static boolean makeHephaestanSparkle;
    public static boolean makeRedGoldRailSparkle;
    
} // end class
