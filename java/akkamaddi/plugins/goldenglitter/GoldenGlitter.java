package akkamaddi.plugins.goldenglitter;

import java.io.File;

import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.core.ContentTypes;
import alexndr.api.core.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

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
        armorRoseGold = EnumHelper.addArmorMaterial("ROSEGOLD", 10, 
                                                    new int[] { 2, 4, 2, 1 }, 14);
        
        // set tool properties
        // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage
        // to entity, enchantability)
        toolRoseGold = EnumHelper.addToolMaterial(
                "ROSEGOLD", 1, 240, 9.0F, 1, 14);
        toolErubescentGold = EnumHelper.addToolMaterial(
                "ERUBESCENTGOLD", 3, 18, 16.0F, 3, 22);
        toolScarlatiteGold = EnumHelper.addToolMaterial(
                "SCARLATITEGOLD", 5, 38, 18.0F, 4, 28);
        toolHephaestanGold = EnumHelper.addToolMaterial(
                "HEPHAESTANGOLD", 7, 222, 28.0F, 5, 30);
   } // end setToolAndArmorStats()

    
    /**
     * Sets repair materials for the tools/armor of that type. ie. Copper Ingot to repair copper tools and armor.
     */
    private static void setRepairMaterials()
    {
        // repair materials
        armorRoseGold.customCraftingMaterial = Content.roseGoldIngot;
        toolRoseGold.customCraftingMaterial = Content.roseGoldIngot;
        toolErubescentGold.customCraftingMaterial = Content.erubescentGoldIngot;
        toolScarlatiteGold.customCraftingMaterial = Content.scarlatiteGoldIngot;
        toolHephaestanGold.customCraftingMaterial = Content.hephaestanGoldIngot;

    } // end setRepairMaterials()
    
    /**
     * Creating the custom tabs using the API class "SimpleTab" and setting
     * their icon.
     */
    private void setTabIcons() {
        tabAkkamaddiGolden.setIcon(new ItemStack(Content.roseGoldIngot, 1));
    }


} // end class GoldenGlitter
