package mod.akkamaddi.goldenglitter.content;

import java.util.Random;

import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.alexndr.simplecorelib.client.ClientUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class HephaestanGoldBlock extends RedstoneBlock
{
    private static final int signal_strength = 5;
    public static final int light_level = 4;

    public HephaestanGoldBlock(Properties properties)
    {
        super(properties);
    }
    
    @Override
    public int getSignal(BlockState p_180656_1_, IBlockReader p_180656_2_, BlockPos p_180656_3_, Direction p_180656_4_)
    {
        return HephaestanGoldBlock.signal_strength;
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (worldIn.isClientSide && GoldenConfig.makeHephaestanSparkle) 
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

            worldIn.addParticle(RedstoneParticleData.REDSTONE, pv[0], pv[1], pv[2], pv[3], pv[4], pv[5]);
            worldIn.addParticle(ParticleTypes.FLAME, (f1 + 0.3) + (f6 * 0.7), 
                    (f2 + 0.3) + (f4 * 0.7), (f3 + 0.3) + (f5 * 0.7), pv[3], pv[4], pv[5]);
        }
    } // end animateTick

} // class
