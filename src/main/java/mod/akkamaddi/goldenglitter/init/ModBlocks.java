package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import mod.akkamaddi.goldenglitter.content.RoseGoldBlock;
import mod.alexndr.simplecorelib.helpers.LightUtils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RailBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, GoldenGlitter.MODID);
    
    // rail - TODO change registered class when coded.
    public static final RegistryObject<RailBlock> red_gold_rail = BLOCKS.register("red_gold_rail",
            () -> new RailBlock(Block.Properties.of(Material.DECORATION)
                    .lightLevel(LightUtils.setFixedLight(15))
                    .strength(0.7F).noCollission().sound(SoundType.METAL))); 
            
    // storage blocks - TODO change registered class when coded.
    public static final RegistryObject<RoseGoldBlock> rose_gold_block = BLOCKS.register("rose_gold_block",
            () -> new RoseGoldBlock(Block.Properties.of(Material.METAL, MaterialColor.COLOR_PINK)
                    .strength(7.0F, 16.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops())); 
    public static final RegistryObject<Block> erubescent_gold_block = BLOCKS.register("erubescent_gold_block",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.GOLD)
                    .strength(9.0F, 14.0F).sound(SoundType.METAL).lightLevel(LightUtils.setFixedLight(4))
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops()
                    .isRedstoneConductor(PropertyUtils::never))); 
    public static final RegistryObject<Block> scarlatite_gold_block = BLOCKS.register("scarlatite_gold_block",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE)
                    .strength(11.0F, 18.0F).sound(SoundType.METAL).lightLevel(LightUtils.setFixedLight(15))
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops()
                    .isRedstoneConductor(PropertyUtils::never))); 
    public static final RegistryObject<Block> hephaestan_gold_block = BLOCKS.register("hephaestan_gold_block",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
                    .strength(18.0F, 24.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).requiresCorrectToolForDrops()
                    .isRedstoneConductor(PropertyUtils::never))); 
} // end class
