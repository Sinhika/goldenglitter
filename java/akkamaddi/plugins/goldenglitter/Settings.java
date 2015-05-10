/**
 * settings class for Golden Glitter
 */
package akkamaddi.plugins.goldenglitter;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import akkamaddi.api.core.ASettings;
import alexndr.api.core.LogHelper;

/**
 * @author cyhiggin
 *
 */
public class Settings extends ASettings
{
    /** 
     * umbrella config loading routine. must be instantiated by child classes.
     * @param event
     */
    public static void createOrLoadSettings(FMLPreInitializationEvent event) 
    {
        config = GetConfig(event, "akkamaddi", "goldenglitter.cfg");

        try {
            LogHelper.verboseInfo(ModInfo.ID, "Loading Settings...");
            config.load();
            genericSettings(ModInfo.ID, ModInfo.NAME);
            
            // mod-specific booleans
            MakeRoseHideous = config.get(Configuration.CATEGORY_GENERAL,
                    "Make Rose Gold Blocks Hideous, false or true", false)
                    .getBoolean(false);
            MakeErubescentSparkle = config.get(Configuration.CATEGORY_GENERAL,
                    "Make Erubescent Gold Blocks sparkle, true or false", true)
                    .getBoolean(true);
            MakeScarlatiteSparkle = config.get(Configuration.CATEGORY_GENERAL,
                    "Make Scarlatite Gold Blocks sparkle, true or false", true)
                    .getBoolean(true);
            MakeHephaestanSparkle = config.get(Configuration.CATEGORY_GENERAL,
                    "Make Hephaestan Gold Blocks sparkle, true or false", true)
                    .getBoolean(true);
            MakeRedGoldRailSparkle = config.get(Configuration.CATEGORY_GENERAL,
                    "Make Red Gold Rails sparkle: true or false?", true)
                    .getBoolean(true);
            werewolfEffectiveness = config.get(Configuration.CATEGORY_GENERAL,
                    "Works on Mo'Creatures lycanthropes, true or false", true)
                    .getBoolean(true);

            // Armor Stat Modification
            armorStatDefaults();
            if (enableArmorStatModification) {
                LogHelper.verboseInfo(ModInfo.ID,
                        "Armor Stat Modification enabled!");
                customizeArmorStats();
            } // end-if enableArmorStatModification

            // Block Stat Modification
            blockStatDefaults();
            if (enableBlockStatModification) {
                LogHelper.verboseInfo(ModInfo.ID,
                        "Block Stat Modification enabled!");
                customizeBlockStats();
            }

            toolStatDefaults();
            if (enableToolStatModification) {
                LogHelper.verboseInfo(ModInfo.ID,
                        "Tool Stat Modification enabled!");
                customizeToolStats();
            }
        } // end-try
        catch (Exception e) {
            LogHelper
                    .severe(ModInfo.ID,
                            "Settings failed to load correctly. The plugin may not function correctly");
        }

        finally {
            config.save();
            LogHelper.verboseInfo(ModInfo.ID, "Settings loaded successfully");
        }
        
    } // end createOrLoadSettings()

    /**
     * Sets the default armor stats.
     */
    public static void armorStatDefaults() 
    {
        roseGoldArmorDurability = 10;
        roseGoldArmorDamageReduction = new int[] { 2, 4, 2, 1 };
        roseGoldArmorEnchantability = 14;
       
    }
    
    /**
     * sets customized armor stats.
     */
    public static void customizeArmorStats() 
    {
        roseGoldArmorDurability = config.getInt("Rose Gold Armor Durability",
                "Armor Stat Modification", roseGoldArmorDurability, 0, 255,
                "Controls the durability of Rose Gold Armor.");
        roseGoldArmorDamageReduction = config.get("Armor Stat Modification",
                "Rose Gold Armor Damage Reduction Array",
                roseGoldArmorDamageReduction).getIntList();
        roseGoldArmorEnchantability = config.getInt(
                "Rose Gold Armor Enchantability", "Armor Stat Modification", 
                roseGoldArmorEnchantability,
                0, 255, "Controls the enchantability of Rose Gold Armor.");        
    }
    
    /**
     * Sets the default block stats.
     */
    public static void blockStatDefaults() 
    {
        roseGoldHardness = 7.0F;
        roseGoldResistance = 16.0F;
        roseGoldHarvestLevel = 0;
        erubescentGoldHardness = 9.0F;
        erubescentGoldResistance = 14.0F;
        erubescentGoldHarvestLevel = 0;
        scarlatiteGoldHardness = 11.0F;
        scarlatiteGoldResistance = 18.0F;
        scarlatiteGoldHarvestLevel = 0;
        hephaestanGoldHardness = 18.0F;
        hephaestanGoldResistance = 24.0F;
        hephaestanGoldHarvestLevel = 0;
        
    }

    /**
     * sets customized block stats.
     */
    public static void customizeBlockStats() 
    {
        roseGoldHardness = config.getFloat("Rose Gold Hardness",
                "Block Stat Modification", roseGoldHardness, 0.0F, 32000.0F,
                "How many hits to break a block");
        roseGoldResistance = config.getFloat("Rose Gold Resistance",
                "Block Stat Modification", roseGoldResistance, 0.0F, 32000.0F,
                "Explosion Resistance");
        roseGoldHarvestLevel = config.getInt("Rose Gold Harvest Level",
                "Block Stat Modification", roseGoldHarvestLevel, 0, 255,
                "Tool level required to harvest this block");

        erubescentGoldHardness = config.getFloat("Erubescent Gold Hardness",
                "Block Stat Modification", erubescentGoldHardness, 0.0F, 32000.0F,
                "How many hits to break a block");
        erubescentGoldResistance = config.getFloat("Erubescent Gold Resistance",
                "Block Stat Modification", erubescentGoldResistance, 0.0F, 32000.0F,
                "Explosion Resistance");
        erubescentGoldHarvestLevel = config.getInt("Erubescent Gold Harvest Level",
                "Block Stat Modification", erubescentGoldHarvestLevel, 0, 255,
                "Tool level required to harvest this block");

        scarlatiteGoldHardness = config.getFloat("Scarlatite Gold Hardness",
                "Block Stat Modification", scarlatiteGoldHardness, 0.0F, 32000.0F,
                "How many hits to break a block");
        scarlatiteGoldResistance = config.getFloat("Scarlatite Gold Resistance",
                "Block Stat Modification", scarlatiteGoldResistance, 0.0F, 32000.0F,
                "Explosion Resistance");
        scarlatiteGoldHarvestLevel = config.getInt("Scarlatite Gold Harvest Level",
                "Block Stat Modification", scarlatiteGoldHarvestLevel, 0, 255,
                "Tool level required to harvest this block");

        hephaestanGoldHardness = config.getFloat("Hephaestan Gold Hardness",
                "Block Stat Modification", hephaestanGoldHardness, 0.0F, 32000.0F,
                "How many hits to break a block");
        hephaestanGoldResistance = config.getFloat("Hephaestan Gold Resistance",
                "Block Stat Modification", hephaestanGoldResistance, 0.0F, 32000.0F,
                "Explosion Resistance");
        hephaestanGoldHarvestLevel = config.getInt("Hephaestan Gold Harvest Level",
                "Block Stat Modification", hephaestanGoldHarvestLevel, 0, 255,
                "Tool level required to harvest this block");
        
    }
    
    /**
     * Sets the default tool stats.
     */
    public static void toolStatDefaults() 
    {
        roseGoldMiningLevel = 1;
        roseGoldUsesNum = 240;
        roseGoldMiningSpeed = 9.0F;
        roseGoldDamageVsEntity = 1;
        roseGoldEnchantability = 14;
        
        erubescentGoldMiningLevel = 3;
        erubescentGoldUsesNum = 18;
        erubescentGoldMiningSpeed = 16.0F;
        erubescentGoldDamageVsEntity = 3;
        erubescentGoldEnchantability = 22;

        scarlatiteGoldMiningLevel = 5;
        scarlatiteGoldUsesNum = 38;
        scarlatiteGoldMiningSpeed = 18.0F;
        scarlatiteGoldDamageVsEntity = 4;
        scarlatiteGoldEnchantability = 28;

        hephaestanGoldMiningLevel = 7;
        hephaestanGoldUsesNum = 222;
        hephaestanGoldMiningSpeed = 28.0F;
        hephaestanGoldDamageVsEntity = 5;
        hephaestanGoldEnchantability = 30;
       
    } // end toolStatDefaults

    /**
     * set customized tool stats.
     */
    public static void customizeToolStats() 
    {
        roseGoldMiningLevel = config
                .getInt("Rose Gold Mining Level",
                        "Tool Stat Modification",
                        roseGoldMiningLevel,
                        0,
                        255,
                        "Controls the mining level of Rose Gold Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
        roseGoldUsesNum = config.getInt("Rose Gold Tools Durability",
                "Tool Stat Modification", roseGoldUsesNum, 0, 32000,
                "Controls the number of uses Rose Gold Tools have.");
        roseGoldMiningSpeed = config
                .getFloat("Rose Gold Mining Speed", "Tool Stat Modification",
                        roseGoldMiningSpeed, 0, 32000,
                        "Controls the speed at which Rose Gold Tools harvest their appropriate blocks.");
        roseGoldDamageVsEntity = config
                .getFloat("Rose Gold Damage Vs. Entities",
                        "Tool Stat Modification", roseGoldDamageVsEntity, 0, 32000,
                        "Controls the amount of damage Rose Gold Tools will do to entities.");
        roseGoldEnchantability = config.getInt("Rose Gold Tools Enchantability",
                "Tool Stat Modification", roseGoldEnchantability, 0, 32000,
                "Controls the enchantability of Rose Gold Tools.");

        erubescentGoldMiningLevel = config
                .getInt("Erubescent Gold Mining Level",
                        "Tool Stat Modification",
                        erubescentGoldMiningLevel,
                        0,
                        255,
                        "Controls the mining level of Erubescent Gold Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
        erubescentGoldUsesNum = config.getInt("Erubescent Gold Tools Durability",
                "Tool Stat Modification", erubescentGoldUsesNum, 0, 32000,
                "Controls the number of uses Erubescent Gold Tools have.");
        erubescentGoldMiningSpeed = config
                .getFloat("Erubescent Gold Mining Speed", "Tool Stat Modification",
                        erubescentGoldMiningSpeed, 0, 32000,
                        "Controls the speed at which Erubescent Gold Tools harvest their appropriate blocks.");
        erubescentGoldDamageVsEntity = config
                .getFloat("Erubescent Gold Damage Vs. Entities",
                        "Tool Stat Modification", erubescentGoldDamageVsEntity, 0, 32000,
                        "Controls the amount of damage Erubescent Gold Tools will do to entities.");
        erubescentGoldEnchantability = config.getInt("Erubescent Gold Tools Enchantability",
                "Tool Stat Modification", erubescentGoldEnchantability, 0, 32000,
                "Controls the enchantability of Erubescent Gold Tools.");

        scarlatiteGoldMiningLevel = config
                .getInt("Scarlatite Gold Mining Level",
                        "Tool Stat Modification",
                        scarlatiteGoldMiningLevel,
                        0,
                        255,
                        "Controls the mining level of Scarlatite Gold Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
        scarlatiteGoldUsesNum = config.getInt("Scarlatite Gold Tools Durability",
                "Tool Stat Modification", scarlatiteGoldUsesNum, 0, 32000,
                "Controls the number of uses Scarlatite Gold Tools have.");
        scarlatiteGoldMiningSpeed = config
                .getFloat("Scarlatite Gold Mining Speed", "Tool Stat Modification",
                        scarlatiteGoldMiningSpeed, 0, 32000,
                        "Controls the speed at which Scarlatite Gold Tools harvest their appropriate blocks.");
        scarlatiteGoldDamageVsEntity = config
                .getFloat("Scarlatite Gold Damage Vs. Entities",
                        "Tool Stat Modification", scarlatiteGoldDamageVsEntity, 0, 32000,
                        "Controls the amount of damage Scarlatite Gold Tools will do to entities.");
        scarlatiteGoldEnchantability = config.getInt("Scarlatite Gold Tools Enchantability",
                "Tool Stat Modification", scarlatiteGoldEnchantability, 0, 32000,
                "Controls the enchantability of Scarlatite Gold Tools.");

        hephaestanGoldMiningLevel = config
                .getInt("Hephaestan Gold Mining Level",
                        "Tool Stat Modification",
                        hephaestanGoldMiningLevel,
                        0,
                        255,
                        "Controls the mining level of Hephaestan Gold Tools. 0 = wood, 1 = stone, 2 = iron, 3 = diamond.");
        hephaestanGoldUsesNum = config.getInt("Hephaestan Gold Tools Durability",
                "Tool Stat Modification", hephaestanGoldUsesNum, 0, 32000,
                "Controls the number of uses Hephaestan Gold Tools have.");
        hephaestanGoldMiningSpeed = config
                .getFloat("Hephaestan Gold Mining Speed", "Tool Stat Modification",
                        hephaestanGoldMiningSpeed, 0, 32000,
                        "Controls the speed at which Hephaestan Gold Tools harvest their appropriate blocks.");
        hephaestanGoldDamageVsEntity = config
                .getFloat("Hephaestan Gold Damage Vs. Entities",
                        "Tool Stat Modification", hephaestanGoldDamageVsEntity, 0, 32000,
                        "Controls the amount of damage Hephaestan Gold Tools will do to entities.");
        hephaestanGoldEnchantability = config.getInt("Hephaestan Gold Tools Enchantability",
                "Tool Stat Modification", hephaestanGoldEnchantability, 0, 32000,
                "Controls the enchantability of Hephaestan Gold Tools.");
     
    } // end customizeToolStats
    
    public static boolean MakeRoseHideous, MakeErubescentSparkle, 
        MakeScarlatiteSparkle, MakeHephaestanSparkle, MakeRedGoldRailSparkle,
        werewolfEffectiveness;
    
    // Tool Stats
    public static int roseGoldMiningLevel, erubescentGoldMiningLevel,
            scarlatiteGoldMiningLevel, hephaestanGoldMiningLevel;
    public static int roseGoldUsesNum, erubescentGoldUsesNum,
            scarlatiteGoldUsesNum, hephaestanGoldUsesNum;
    public static float roseGoldMiningSpeed, erubescentGoldMiningSpeed,
            scarlatiteGoldMiningSpeed, hephaestanGoldMiningSpeed;
    public static float roseGoldDamageVsEntity, erubescentGoldDamageVsEntity,
            scarlatiteGoldDamageVsEntity, hephaestanGoldDamageVsEntity;
    public static int roseGoldEnchantability, erubescentGoldEnchantability,
            scarlatiteGoldEnchantability, hephaestanGoldEnchantability;

    // Armor Stats
    public static int roseGoldArmorDurability;
    public static int[] roseGoldArmorDamageReduction;
    public static int roseGoldArmorEnchantability;

    // Block stats
    public static float roseGoldHardness, erubescentGoldHardness,
            scarlatiteGoldHardness, hephaestanGoldHardness;
    public static float roseGoldResistance, erubescentGoldResistance,
            scarlatiteGoldResistance, hephaestanGoldResistance;
    public static int roseGoldHarvestLevel, erubescentGoldHarvestLevel,
            scarlatiteGoldHarvestLevel, hephaestanGoldHarvestLevel;
    
} // end class Settings
