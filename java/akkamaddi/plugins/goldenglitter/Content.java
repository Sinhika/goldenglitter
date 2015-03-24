package akkamaddi.plugins.goldenglitter;

import cpw.mods.fml.common.registry.GameRegistry;
import akkamaddi.api.core.WerewolfHandler;
import alexndr.api.core.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Content 
{
    /**
     * Loads all the Simple Tungsten content, by calling the methods below.
     */
    public static void preInitialize()
    {
        try {
            doItems();
            LogHelper.verboseInfo(ModInfo.ID,
                    "All items were added successfully");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Items were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
        try {
            doBlocks();
            LogHelper.verboseInfo(ModInfo.ID,
                    "All blocks were added successfully");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Blocks were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
        try {
            doTools();
            LogHelper.verboseInfo(ModInfo.ID,
                    "All tools were added successfully");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Tools were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
        try {
            doArmor();
            LogHelper.verboseInfo(ModInfo.ID,
                    "All armor was added successfully");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Armor was not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
        //      try{doAchievements(); LogHelper.verboseInfo(ModInfo.ID, "All achievements were added successfully");}
//          catch(Exception e){LogHelper.severe(ModInfo.ID, "Achievements were not added successfully. This is a serious problem!"); e.printStackTrace();}
    } // end preInitialize()

    public static void doArmor()
    {
        roseGoldHelm = new SimpleArmor(armorRoseGold, 0)
                .modId(ModInfo.ID).setType("roseGold")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldHelm");
        roseGoldChest = new SimpleArmor(armorRoseGold, 1)
                .modId(ModInfo.ID).setType("roseGold")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldChest");
        roseGoldLegs = new SimpleArmor(armorRoseGold, 2)
                .modId(ModInfo.ID).setType("roseGold")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldLegs");
        roseGoldBoots = new SimpleArmor(armorRoseGold, 3)
                .modId(ModInfo.ID).setType("roseGold")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldBoots");

    } // end doArmor()

    public static void doTools()
    {
        roseGoldSword = new SimpleSword(toolRoseGold).modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldSword");
        roseGoldShovel = new SimpleShovel(toolRoseGold).modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldShovel");
        roseGoldAxe = new SimpleAxe(toolRoseGold).modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldAxe");
        roseGoldPickaxe = new SimplePickaxe(toolRoseGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldPickaxe");
        roseGoldHoe = new SimpleHoe(toolRoseGold).modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldHoe");
        erubescentGoldSword = new SimpleSword(toolErubescentGold)
                .modId("goldenglitter")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("erubescentGoldSword");
        erubescentGoldShovel = new SimpleShovel(toolErubescentGold)
                .modId("goldenglitter")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("erubescentGoldShovel");
        erubescentGoldAxe = new SimpleAxe(toolErubescentGold)
                .modId("goldenglitter")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("erubescentGoldAxe");
        erubescentGoldPickaxe = new SimplePickaxe(toolErubescentGold)
                .modId("goldenglitter")
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("erubescentGoldPickaxe");

        scarlatiteGoldSword = new SimpleSword(toolScarlatiteGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("scarlatiteGoldSword");
        scarlatiteGoldShovel = new SimpleShovel(toolScarlatiteGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("scarlatiteGoldShovel");
        scarlatiteGoldAxe = new SimpleAxe(toolScarlatiteGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("scarlatiteGoldAxe");
        scarlatiteGoldPickaxe = new SimplePickaxe(toolScarlatiteGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("scarlatiteGoldPickaxe");
        hephaestanGoldSword = new HephaestanSword(toolHephaestanGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("hephaestanGoldSword");
        hephaestanGoldShovel = new SimpleShovel(toolHephaestanGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("hephaestanGoldShovel");
        hephaestanGoldAxe = new SimpleAxe(toolHephaestanGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("hephaestanGoldAxe");
        hephaestanGoldPickaxe = new SimplePickaxe(toolHephaestanGold)
                .modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("hephaestanGoldPickaxe");

        if (Settings.werewolfEffectiveness)
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

    } // end doTools()

    public static void doBlocks()
    {
        // define blocks
        blockRoseGold = new RoseStorageBlock(Material.iron, ModInfo.ID);
        blockErubescentGold = new ErubescentStorageBlock(Material.iron,
                ModInfo.ID);
        blockScarlatiteGold = new ScarlatiteStorageBlock(Material.iron,
                ModInfo.ID);
        blockHephaestanGold = new HephaestanStorageBlock(Material.iron,
                ModInfo.ID);
        redGoldRail = new RedGoldRail();
        GameRegistry.registerBlock(redGoldRail, "redGoldRail");
        
        // harvest levels
        blockRoseGold.setHarvestLevel( "pickaxe", 0);
        blockErubescentGold.setHarvestLevel( "pickaxe", 0);
        blockScarlatiteGold.setHarvestLevel( "pickaxe", 0);
        blockHephaestanGold.setHarvestLevel( "pickaxe", 0);
        redGoldRail.setHarvestLevel("pickaxe", 0);
        

    } // end doBlocks()

    /**
     * Loads SimpleOres 2 Items.
     */
    public static void doItems()
    {
        // define items
        // Rose Gold
        roseGoldIngot = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("roseGoldIngot");
        largeRoseGoldChunkItem = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("largeRoseGoldChunkItem");
        // Erubescent Gold
        erubescentGoldIngot = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("erubescentGoldIngot");
        largeErubescentGoldChunkItem = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("largeErubescentGoldChunkItem");
        // Scarlatite Gold
        scarlatiteGoldIngot = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("scarlatiteGoldIngot");
        largeScarlatiteGoldChunkItem = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("largeScarlatiteGoldChunkItem");
        // Hephaestan Gold
        hephaestanGoldIngot = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("hephaestanGoldIngot");
        largeHephaestanGoldChunkItem = new SimpleIngot().modId(ModInfo.ID)
                .setCreativeTab(GoldenGlitter.tabAkkamaddiGolden)
                .setUnlocalizedName("largeHephaestanGoldChunkItem");
        
    } // end doItems()

    public static void setLoot()
    {
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
        
    } // end setLoot()

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

} // end class Content
