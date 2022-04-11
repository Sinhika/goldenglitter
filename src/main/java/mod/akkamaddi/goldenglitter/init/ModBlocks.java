package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.content.ErubescentGoldBlock;
import mod.akkamaddi.goldenglitter.content.HephaestanGoldBlock;
import mod.akkamaddi.goldenglitter.content.RedGoldRailBlock;
import mod.akkamaddi.goldenglitter.content.RoseGoldBlock;
import mod.akkamaddi.goldenglitter.content.ScarlatiteGoldBlock;
import mod.alexndr.simplecorelib.helpers.LightUtils;
import mod.alexndr.simplecorelib.helpers.PropertyUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, GoldenGlitter.MODID);
    
    // rail
    public static final RegistryObject<RedGoldRailBlock> red_gold_rail = BLOCKS.register("red_gold_rail",
            () -> new RedGoldRailBlock(Block.Properties.of(Material.DECORATION)
                    .lightLevel(LightUtils.setFixedLight(RedGoldRailBlock.light_level))
                    .strength(0.7F).noCollission().sound(SoundType.METAL))); 
            
    // storage blocks
    public static final RegistryObject<RoseGoldBlock> rose_gold_block = BLOCKS.register("rose_gold_block",
            () -> new RoseGoldBlock(Block.Properties.of(Material.METAL, MaterialColor.COLOR_PINK)
                    .strength(7.0F, 16.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0) 
    
    public static final RegistryObject<ErubescentGoldBlock> erubescent_gold_block = BLOCKS.register("erubescent_gold_block",
            () -> new ErubescentGoldBlock(Block.Properties.of(Material.METAL, MaterialColor.GOLD)
                    .strength(9.0F, 14.0F).sound(SoundType.METAL)
                    .lightLevel(LightUtils.setFixedLight(ErubescentGoldBlock.light_level)).requiresCorrectToolForDrops()
                    .isRedstoneConductor(PropertyUtils::never)));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0) 
    public static final RegistryObject<ScarlatiteGoldBlock> scarlatite_gold_block = BLOCKS.register("scarlatite_gold_block",
            () -> new ScarlatiteGoldBlock(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE)
                    .strength(11.0F, 18.0F).sound(SoundType.METAL)
                    .lightLevel(LightUtils.setFixedLight(ScarlatiteGoldBlock.light_level)).requiresCorrectToolForDrops()
                    .isRedstoneConductor(PropertyUtils::never))); 
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)
    
    public static final RegistryObject<HephaestanGoldBlock> hephaestan_gold_block = BLOCKS.register("hephaestan_gold_block",
            () -> new HephaestanGoldBlock(Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
                    .strength(18.0F, 24.0F).sound(SoundType.METAL)
                    .lightLevel(LightUtils.setFixedLight(HephaestanGoldBlock.light_level)).requiresCorrectToolForDrops()
                    .isRedstoneConductor(PropertyUtils::never))); 
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)
} // end class
