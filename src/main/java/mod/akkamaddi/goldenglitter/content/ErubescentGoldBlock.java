package mod.akkamaddi.goldenglitter.content;

import java.util.Random;

import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.alexndr.simplecorelib.client.ClientUtils;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ErubescentGoldBlock extends PoweredBlock
{
    private static final int signal_strength = 7;
    public static final int light_level = (int) (0.5F * 15);
    
    public ErubescentGoldBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public int getSignal(BlockState p_180656_1_, BlockGetter p_180656_2_, BlockPos p_180656_3_, Direction p_180656_4_)
    {
        return ErubescentGoldBlock.signal_strength;
    }

    @Override
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand)
    {
        if (worldIn.isClientSide && GoldenConfig.makeErubescentSparkle) 
        {
            super.animateTick(stateIn, worldIn, pos, rand);
            double pv[] = ClientUtils.findBlockParticleVector(pos, rand, 0.3F, 1.6F);
            worldIn.addParticle(DustParticleOptions.REDSTONE, pv[0], pv[1], pv[2], pv[3], pv[4], pv[5]);
        }
    } // end animateTick

} // end class
