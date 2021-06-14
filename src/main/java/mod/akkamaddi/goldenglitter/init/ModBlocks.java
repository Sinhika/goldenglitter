package mod.akkamaddi.goldenglitter.init;

import mod.akkamaddi.goldenglitter.GoldenGlitter;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, GoldenGlitter.MODID);
} // end class
