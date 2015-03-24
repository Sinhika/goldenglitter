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
            genericSettings(ModInfo.ID, "Tungsten & Tungsten alloys");
            
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

            // Adjustable Ore Spawn Rates
            adjustOreSpawnRates();

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
     * loads/sets the ore generation variables.
     */
    public static void adjustOreSpawnRates() {}

    /**
     * Sets the default armor stats.
     */
    public static void armorStatDefaults() {}
    
    /**
     * sets customized armor stats.
     */
    public static void customizeArmorStats() {}
    
    /**
     * Sets the default block stats.
     */
    public static void blockStatDefaults() {}

    /**
     * sets customized block stats.
     */
    public static void customizeBlockStats() {}
    
    /**
     * Sets the default tool stats.
     */
    public static void toolStatDefaults() {}

    /**
     * set customized tool stats.
     */
    public static void customizeToolStats() {}
    
    public static boolean MakeRoseHideous, MakeErubescentSparkle, 
        MakeScarlatiteSparkle, MakeHephaestanSparkle, MakeRedGoldRailSparkle,
        werewolfEffectiveness;

} // end class Settings
