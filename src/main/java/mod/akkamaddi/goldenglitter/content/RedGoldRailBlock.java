package mod.akkamaddi.goldenglitter.content;

import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.alexndr.simplecorelib.api.client.ClientUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RailBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RedGoldRailBlock extends RailBlock
{
    public final static int light_level = 15;
    public final static int signal_strength = 15;
    
    public RedGoldRailBlock(Properties properties)
    {
        super(properties);
    }
    
    @Override
    public boolean isSignalSource(BlockState p_149744_1_) {
        return true;
     }

     @Override
    public int getSignal(BlockState p_180656_1_, BlockGetter p_180656_2_, BlockPos p_180656_3_, Direction p_180656_4_) {
        return RedGoldRailBlock.signal_strength;
     }

     @Override
     public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, RandomSource rand)
     {
         if (worldIn.isClientSide && GoldenConfig.makeRedGoldRailSparkle) 
         {
             super.animateTick(stateIn, worldIn, pos, rand);
             double pv[] = ClientUtils.findBlockParticleVector(pos, rand, 0.0F, 1.0F);
             worldIn.addParticle(DustParticleOptions.REDSTONE, pv[0], 
                     ((float)pos.getY() - 0.1F) + (pv[1] - (float)pos.getY()) * 0.4F,
                     pv[2], pv[3], pv[4], pv[5]);
         }
     } // end animateTick

} // end class
