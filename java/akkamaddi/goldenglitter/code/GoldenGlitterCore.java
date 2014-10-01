package akkamaddi.goldenglitter.code;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import akkamaddi.akkamaddiCore.api.APIcore;
import akkamaddi.akkamaddiCore.api.CommonProxy;
import akkamaddi.akkamaddiCore.api.WerewolfHandler;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleSword;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "goldenglitter", name = "Simple Golden Glitter, gold alloys", version = "1.4.0", dependencies = "required-after:simpleores ; required-after:fusionplugin ; required-after:akkamaddicore")
public class GoldenGlitterCore {
	// The instance of your mod that Forge uses.
	@Instance("goldenglitter")
	public static GoldenGlitterCore instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "akkamaddi.goldenglitter.code.ClientProxy", serverSide = "akkamaddi.akkamaddiCore.code.CommonProxy")
	public static CommonProxy proxy;

	// Rose Gold
	public static Item roseGoldIngot;
	public static Item largeRoseGoldChunkItem;

	public static Item roseGoldSword;
	public static Item roseGoldShovel;
	public static Item roseGoldAxe;
	public static Item roseGoldPickaxe;
	public static Item roseGoldHoe;

	public static Item roseGoldHelm;
	public static Item roseGoldChest;
	public static Item roseGoldLegs;
	public static Item roseGoldBoots;

	// Erubescent Gold
	public static Item erubescentGoldIngot;
	public static Item largeErubescentGoldChunkItem;

	public static Item erubescentGoldSword;
	public static Item erubescentGoldShovel;
	public static Item erubescentGoldAxe;
	public static Item erubescentGoldPickaxe;

	// Scarlatite Gold

	public static Item scarlatiteGoldIngot;
	public static Item largeScarlatiteGoldChunkItem;

	public static Item scarlatiteGoldSword;
	public static Item scarlatiteGoldShovel;
	public static Item scarlatiteGoldAxe;
	public static Item scarlatiteGoldPickaxe;

	// Hephaestan Gold

	public static Item hephaestanGoldIngot;
	public static Item largeHephaestanGoldChunkItem;

	public static Item hephaestanGoldSword;
	public static Item hephaestanGoldShovel;
	public static Item hephaestanGoldAxe;
	public static Item hephaestanGoldPickaxe;

	// set block names
	public static Block blockRoseGold;
	public static Block blockErubescentGold;
	public static Block blockScarlatiteGold;
	public static Block blockHephaestanGold;
	public static Block redGoldRail;

	public static boolean MakeRoseHideous;
	public static boolean MakeErubescentSparkle;
	public static boolean MakeScarlatiteSparkle;
	public static boolean MakeHephaestanSparkle;
	public static boolean MakeRedGoldRailSparkle;

	public static boolean werewolfEffectiveness;
	public static boolean enableRecycling;

	// tab
	public static SimpleTab tabAkkamaddiGolden = new SimpleTab(
			"tabAkkamaddiGolden");

	/**
	 * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by
	 * pieces for their max damage), new int[] {helmet defense, chestplate
	 * defense, leggings defense, boots defense}, enchantability)
	 */
	public static ArmorMaterial armorRoseGold = EnumHelper.addArmorMaterial(
			"ROSEGOLD", 10, new int[] { 2, 4, 2, 1 }, 14);

	/**
	 * Creating the Armor Renderers. This is simply so you can see the armor
	 * texture when you wear it.
	 */
	public static int rendererRoseGold;

	// set tool properties
	// EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage
	// to entity, enchantability)
	public static ToolMaterial toolRoseGold = EnumHelper.addToolMaterial(
			"ROSEGOLD", 1, 240, 9.0F, 1, 14);
	public static ToolMaterial toolErubescentGold = EnumHelper.addToolMaterial(
			"ERUBESCENTGOLD", 3, 18, 16.0F, 3, 22);
	public static ToolMaterial toolScarlatiteGold = EnumHelper.addToolMaterial(
			"SCARLATITEGOLD", 5, 38, 18.0F, 4, 28);
	public static ToolMaterial toolHephaestanGold = EnumHelper.addToolMaterial(
			"HEPHAESTANGOLD", 7, 222, 28.0F, 5, 30);

	/**
	 * Creating the custom tabs using the API class "SimpleTab" and setting
	 * their icon.
	 */
	public void setTabIcons() {
		tabAkkamaddiGolden.setIcon(new ItemStack(GoldenGlitterCore.blockRoseGold));
	}

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and 
     * register them with the GameRegistry. Register recipes.
     */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());
		config.load();
		MakeRoseHideous = config.get(Configuration.CATEGORY_GENERAL,
				"Make Rose Gold Blocks Hideous, false or true", false)
				.getBoolean(false);
		MakeErubescentSparkle = config.get(Configuration.CATEGORY_GENERAL,
				"Make Erubescent Gold Blocks sparkle, true or false", true)
				.getBoolean(true);
		MakeScarlatiteSparkle = config.get(Configuration.CATEGORY_GENERAL,
				"Make Scarlatite Gold Blocks sparkle, true or false", true)
				.getBoolean(true);
		// booleans
		MakeHephaestanSparkle = config.get(Configuration.CATEGORY_GENERAL,
				"Make Hephaestan Gold Blocks sparkle, true or false", true)
				.getBoolean(true);
		werewolfEffectiveness = config.get(Configuration.CATEGORY_GENERAL,
				"Works on Mo'Creatures lycanthropes, true or false", true)
				.getBoolean(true);
		enableRecycling = config.get(Configuration.CATEGORY_GENERAL,
				"Enable Golden item recycling recipes: false or true?", false)
				.getBoolean(false);
		MakeRedGoldRailSparkle = config.get(Configuration.CATEGORY_GENERAL,
				"Make Red Gold Rails sparkle: true or false?", true)
				.getBoolean(true);
		config.save();
		
		// define items
		// Rose Gold
		roseGoldIngot = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldIngot");
		largeRoseGoldChunkItem = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("largeRoseGoldChunkItem");
		roseGoldSword = new SimpleSword(toolRoseGold).modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldSword");
		roseGoldShovel = new SimpleShovel(toolRoseGold).modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldShovel");
		roseGoldAxe = new SimpleAxe(toolRoseGold).modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldAxe");
		roseGoldPickaxe = new SimplePickaxe(toolRoseGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldPickaxe");
		roseGoldHoe = new SimpleHoe(toolRoseGold).modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldHoe");
		roseGoldHelm = new SimpleArmor(armorRoseGold, rendererRoseGold, 0)
				.modId("goldenglitter").setType("roseGold")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldHelm");
		roseGoldChest = new SimpleArmor(armorRoseGold, rendererRoseGold, 1)
				.modId("goldenglitter").setType("roseGold")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldChest");
		roseGoldLegs = new SimpleArmor(armorRoseGold, rendererRoseGold, 2)
				.modId("goldenglitter").setType("roseGold")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldLegs");
		roseGoldBoots = new SimpleArmor(armorRoseGold, rendererRoseGold, 3)
				.modId("goldenglitter").setType("roseGold")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("roseGoldBoots");
		
		// Erubescent Gold
		erubescentGoldIngot = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("erubescentGoldIngot");
		largeErubescentGoldChunkItem = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("largeErubescentGoldChunkItem");
		erubescentGoldSword = new SimpleSword(toolErubescentGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("erubescentGoldSword");
		erubescentGoldShovel = new SimpleShovel(toolErubescentGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("erubescentGoldShovel");
		erubescentGoldAxe = new SimpleAxe(toolErubescentGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("erubescentGoldAxe");
		erubescentGoldPickaxe = new SimplePickaxe(toolErubescentGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("erubescentGoldPickaxe");
		
		// Scarlatite Gold
		scarlatiteGoldIngot = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("scarlatiteGoldIngot");
		largeScarlatiteGoldChunkItem = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("largeScarlatiteGoldChunkItem");
		scarlatiteGoldSword = new SimpleSword(toolScarlatiteGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("scarlatiteGoldSword");
		scarlatiteGoldShovel = new SimpleShovel(toolScarlatiteGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("scarlatiteGoldShovel");
		scarlatiteGoldAxe = new SimpleAxe(toolScarlatiteGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("scarlatiteGoldAxe");
		scarlatiteGoldPickaxe = new SimplePickaxe(toolScarlatiteGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("scarlatiteGoldPickaxe");
		
		// Hephaestan Gold
		hephaestanGoldIngot = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("hephaestanGoldIngot");
		largeHephaestanGoldChunkItem = new SimpleIngot().modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("largeHephaestanGoldChunkItem");
		hephaestanGoldSword = new HephaestanSword(toolHephaestanGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("hephaestanGoldSword");
		hephaestanGoldShovel = new SimpleShovel(toolHephaestanGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("hephaestanGoldShovel");
		hephaestanGoldAxe = new SimpleAxe(toolHephaestanGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("hephaestanGoldAxe");
		hephaestanGoldPickaxe = new SimplePickaxe(toolHephaestanGold)
				.modId("goldenglitter")
				.setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
				.setUnlocalizedName("hephaestanGoldPickaxe");
		
		// define blocks
		blockRoseGold = new RoseStorageBlock(Material.iron, "goldenglitter");
		blockErubescentGold = new ErubescentStorageBlock(Material.iron, "goldenglitter");
		blockScarlatiteGold = new ScarlatiteStorageBlock(Material.iron,	"goldenglitter");
		blockHephaestanGold = new HephaestanStorageBlock(Material.iron,	"goldenglitter");
		redGoldRail = new RedGoldRail();
		
		// registration
		// loot
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldIngot),
				2, 4, 4);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				largeRoseGoldChunkItem), 1, 2, 3);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldSword),
				2, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldPickaxe),
				2, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldAxe), 1,
				2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldShovel),
				1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldHelm), 1,
				4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldChest),
				1, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldLegs), 1,
				4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldBoots),
				1, 4, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				erubescentGoldPickaxe), 1, 3, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				scarlatiteGoldPickaxe), 1, 2, 1);
		LootHelper.addLoot("villageBlacksmith", new ItemStack(
				hephaestanGoldPickaxe), 1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(roseGoldIngot), 2, 4,
				6);
		LootHelper.addLoot("dungeonChest", new ItemStack(roseGoldPickaxe), 2,
				6, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(erubescentGoldIngot),
				1, 2, 2);
		LootHelper.addLoot("dungeonChest", new ItemStack(scarlatiteGoldIngot),
				1, 1, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(erubescentGoldSword),
				1, 3, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(scarlatiteGoldSword),
				1, 2, 1);
		LootHelper.addLoot("dungeonChest", new ItemStack(hephaestanGoldSword),
				1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(roseGoldSword),
				1, 3, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(roseGoldPickaxe),
				2, 4, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(roseGoldShovel),
				1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				erubescentGoldPickaxe), 1, 3, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				scarlatiteGoldPickaxe), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				hephaestanGoldPickaxe), 1, 1, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				erubescentGoldShovel), 1, 3, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				scarlatiteGoldShovel), 1, 2, 1);
		LootHelper.addLoot("mineshaftCorridor", new ItemStack(
				hephaestanGoldShovel), 1, 1, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				erubescentGoldIngot), 1, 4, 4);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				scarlatiteGoldIngot), 1, 3, 3);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				hephaestanGoldIngot), 1, 2, 2);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				erubescentGoldSword), 1, 1, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				scarlatiteGoldSword), 1, 2, 1);
		LootHelper.addLoot("pyramidDesertyChest", new ItemStack(
				hephaestanGoldSword), 1, 3, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				erubescentGoldIngot), 1, 4, 4);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				scarlatiteGoldIngot), 1, 3, 3);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				hephaestanGoldIngot), 1, 2, 2);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				erubescentGoldSword), 1, 1, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				scarlatiteGoldSword), 1, 2, 1);
		LootHelper.addLoot("pyramidJungleChest", new ItemStack(
				hephaestanGoldSword), 1, 3, 1);

		if (GoldenGlitterCore.werewolfEffectiveness)
		{
        	WerewolfHandler.Damage2Wolf.put(erubescentGoldShovel, 7.0F);
        	WerewolfHandler.Damage2Wolf.put(erubescentGoldPickaxe, 8.0F);
        	WerewolfHandler.Damage2Wolf.put(erubescentGoldAxe, 9.0F);
        	WerewolfHandler.Damage2Wolf.put(erubescentGoldSword, 10.0F);			
        	WerewolfHandler.Damage2Wolf.put(scarlatiteGoldShovel, 7.0F);
        	WerewolfHandler.Damage2Wolf.put(scarlatiteGoldPickaxe, 8.0F);
        	WerewolfHandler.Damage2Wolf.put(scarlatiteGoldAxe, 9.0F);
        	WerewolfHandler.Damage2Wolf.put(scarlatiteGoldSword, 10.0F);			
        	WerewolfHandler.Damage2Wolf.put(hephaestanGoldShovel, 7.0F);
        	WerewolfHandler.Damage2Wolf.put(hephaestanGoldPickaxe, 8.0F);
        	WerewolfHandler.Damage2Wolf.put(hephaestanGoldAxe, 9.0F);
        	WerewolfHandler.Damage2Wolf.put(hephaestanGoldSword, 10.0F);			
		}

		// run tab icon call
		setTabIcons();
		
		// recipes
		GlitterRecipes.doGlitterRecipes();
		
        APIcore.instance.joinWorldModRegistry.add(new JoinWorldHandler());

	} // end preInit()

    /**
     * Do your mod setup. Build whatever data structures you care about. 
     */
 	@EventHandler
	public void load(FMLInitializationEvent event) 
 	{
		proxy.registerRenderers();
		
		// name stuff
//		MinecraftForge.setBlockHarvestLevel(blockRoseGold, "pickaxe", 0);
//		MinecraftForge.setBlockHarvestLevel(blockErubescentGold, "pickaxe", 0);
//		MinecraftForge.setBlockHarvestLevel(blockScarlatiteGold, "pickaxe", 0);
//		MinecraftForge.setBlockHarvestLevel(blockHephaestanGold, "pickaxe", 0);
//		MinecraftForge.setBlockHarvestLevel(redGoldRail, "pickaxe", 0);
		
		toolRoseGold.customCraftingMaterial = GoldenGlitterCore.roseGoldIngot;
		armorRoseGold.customCraftingMaterial = GoldenGlitterCore.roseGoldIngot;
		toolErubescentGold.customCraftingMaterial = GoldenGlitterCore.erubescentGoldIngot;
		toolScarlatiteGold.customCraftingMaterial = GoldenGlitterCore.scarlatiteGoldIngot;
		toolHephaestanGold.customCraftingMaterial = GoldenGlitterCore.hephaestanGoldIngot;
	}

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
} // end class GoldenGlitterCore
