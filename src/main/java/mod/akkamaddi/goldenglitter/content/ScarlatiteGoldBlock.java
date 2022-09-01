package mod.akkamaddi.goldenglitter.content;

import java.util.Random;

import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ScarlatiteGoldBlock extends PoweredBlock
{
    private static final int signal_strength = 11;
    public static final int light_level = 15;
    

    public ScarlatiteGoldBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public int getSignal(BlockState p_180656_1_, BlockGetter p_180656_2_, BlockPos p_180656_3_, Direction p_180656_4_)
    {
        return ScarlatiteGoldBlock.signal_strength;
    }

    @Override
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand)
    {
        if (worldIn.isClientSide && GoldenConfig.makeScarlatiteSparkle) 
        {
            super.animateTick(stateIn, worldIn, pos, rand);
            double pv[] = new double[6];

            float f1 = (float)pos.getX() - 0.5F;
            float f2 = (float)pos.getY() - 0.5F;
            float f3 = (float)pos.getZ() - 0.5F;
            float f4 = rand.nextFloat() * 2.0F;
            float f5 = rand.nextFloat() * 2.0F;
            float f6 = rand.nextFloat() * 2.0F;
            pv[0] = (double)(f1 + f4);
            pv[1] = (double)(f2 + f5);
            pv[2] = (double)(f3 + f6);
            pv[3] = 0.0D;
            pv[4] = 0.0D;
            pv[5] = 0.0D;

            worldIn.addParticle(DustParticleOptions.REDSTONE, pv[0], pv[1], pv[2], pv[3], pv[4], pv[5]);
            worldIn.addParticle(ParticleTypes.INSTANT_EFFECT, (f1 + 0.3) + (f6 * 0.7), 
                    (f2 + 0.3) + (f4 * 0.7), (f3 + 0.3) + (f5 * 0.7), pv[3], pv[4], pv[5]);
        }
    } // end animateTick


} // end class
