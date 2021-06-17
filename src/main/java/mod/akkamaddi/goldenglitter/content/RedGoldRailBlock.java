package mod.akkamaddi.goldenglitter.content;

import java.util.Random;

import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.alexndr.simplecorelib.client.ClientUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.RailBlock;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class RedGoldRailBlock extends RailBlock
{
    public final static int light_level = 15;
    public final static int signal_strength = 15;
    
    public RedGoldRailBlock(Properties properties)
    {
        super(properties);
    }
    
    public boolean isSignalSource(BlockState p_149744_1_) {
        return true;
     }

     public int getSignal(BlockState p_180656_1_, IBlockReader p_180656_2_, BlockPos p_180656_3_, Direction p_180656_4_) {
        return RedGoldRailBlock.signal_strength;
     }

     @Override
     public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
     {
         if (worldIn.isClientSide && GoldenConfig.makeRedGoldRailSparkle) 
         {
             super.animateTick(stateIn, worldIn, pos, rand);
             double pv[] = ClientUtils.findBlockParticleVector(pos, rand, 0.0F, 1.0F);
             worldIn.addParticle(RedstoneParticleData.REDSTONE, pv[0], 
                     ((float)pos.getY() - 0.1F) + (pv[1] - (float)pos.getY()) * 0.4F,
                     pv[2], pv[3], pv[4], pv[5]);
         }
     } // end animateTick

} // end class
