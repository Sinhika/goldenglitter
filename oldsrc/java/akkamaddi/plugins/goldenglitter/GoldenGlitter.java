package akkamaddi.plugins.goldenglitter;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.core.ContentTypes;
import alexndr.api.core.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
// used in 1.6.2

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION, 
dependencies = "required-after:simplecore; required-after:simpleores ; required-after:fusion ; required-after:akkamaddicore")
public class GoldenGlitter 
{
	// tab
	public static SimpleTab tabAkkamaddiGolden;
	public static ArmorMaterial armorRoseGold;
	public static ToolMaterial toolRoseGold, toolErubescentGold, toolScarlatiteGold,
	    toolHephaestanGold;

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and 
     * register them with the GameRegistry. Register recipes.
     */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
        // Tab
        LogHelper.info("Loading Golden Glitter...");
        tabAkkamaddiGolden = new SimpleTab("tabAkkamaddiGolden",
                                            ContentTypes.CreativeTab.GENERAL);
      
        //Configuration
        Settings.createOrLoadSettings(event);
        
        //Content
        setToolAndArmorStats();
        Content.preInitialize();
        Recipes.preInitialize();
        Content.setLoot();
	} // end preInit()

    /**
     * Do your mod setup. Build whatever data structures you care about. 
     */
 	@EventHandler
	public void load(FMLInitializationEvent event) 
 	{
        // run tab icon call
        setTabIcons();
        setRepairMaterials();
        Recipes.initialize();
	}

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
        LogHelper.info("Golden Glitter loaded");
	}
	
    /**
     * Sets the tool and armor stats from the Settings file.
     */
    private static void setToolAndArmorStats() 
    {
        /**
         * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by
         * pieces for their max damage), new int[] {helmet defense, chestplate
         * defense, leggings defense, boots defense}, enchantability)
         */
        armorRoseGold = EnumHelper.addArmorMaterial("ROSEGOLD",
                Settings.roseGoldArmorDurability,
                Settings.roseGoldArmorDamageReduction,
                Settings.roseGoldArmorEnchantability);
        
        // set tool properties
        // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage
        // to entity, enchantability)
        toolRoseGold = EnumHelper.addToolMaterial("ROSEGOLD",
                Settings.roseGoldMiningLevel, Settings.roseGoldUsesNum,
                Settings.roseGoldMiningSpeed, Settings.roseGoldDamageVsEntity,
                Settings.roseGoldEnchantability);
        toolErubescentGold = EnumHelper.addToolMaterial("ERUBESCENTGOLD",
                Settings.erubescentGoldMiningLevel,
                Settings.erubescentGoldUsesNum,
                Settings.erubescentGoldMiningSpeed,
                Settings.erubescentGoldDamageVsEntity,
                Settings.erubescentGoldEnchantability);
        toolScarlatiteGold = EnumHelper.addToolMaterial("SCARLATITEGOLD",
                Settings.scarlatiteGoldMiningLevel,
                Settings.scarlatiteGoldUsesNum,
                Settings.scarlatiteGoldMiningSpeed,
                Settings.scarlatiteGoldDamageVsEntity,
                Settings.scarlatiteGoldEnchantability);
        toolHephaestanGold = EnumHelper.addToolMaterial("HEPHAESTANGOLD",
                Settings.hephaestanGoldMiningLevel,
                Settings.hephaestanGoldUsesNum,
                Settings.hephaestanGoldMiningSpeed,
                Settings.hephaestanGoldDamageVsEntity,
                Settings.hephaestanGoldEnchantability);
  } // end setToolAndArmorStats()

    
    /**
     * Sets repair materials for the tools/armor of that type. ie. Copper Ingot to repair copper tools and armor.
     */
    private static void setRepairMaterials()
    {
        // repair materials
        armorRoseGold.customCraftingMaterial = Content.roseGoldIngot;
        toolRoseGold.setRepairItem(new ItemStack(Content.roseGoldIngot));
        toolErubescentGold.setRepairItem(new ItemStack(Content.erubescentGoldIngot));
        toolScarlatiteGold.setRepairItem(new ItemStack(Content.scarlatiteGoldIngot));
        toolHephaestanGold.setRepairItem(new ItemStack(Content.hephaestanGoldIngot));

    } // end setRepairMaterials()
    
    /**
     * Creating the custom tabs using the API class "SimpleTab" and setting
     * their icon.
     */
    private void setTabIcons() {
        tabAkkamaddiGolden.setIcon(new ItemStack(Content.roseGoldIngot, 1));
    }


} // end class GoldenGlitter
