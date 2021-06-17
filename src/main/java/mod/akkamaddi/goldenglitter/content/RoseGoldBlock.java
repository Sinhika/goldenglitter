package mod.akkamaddi.goldenglitter.content;

import java.util.Random;

import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.alexndr.simplecorelib.client.ClientUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RoseGoldBlock extends Block
{
    public RoseGoldBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (worldIn.isClientSide && GoldenConfig.makeRoseHideous) 
        {
            super.animateTick(stateIn, worldIn, pos, rand);
            double pv[] = ClientUtils.findBlockParticleVector(pos, rand);
            worldIn.addParticle(ParticleTypes.HEART, pv[0], pv[1], pv[2], pv[3], pv[4], pv[5]);
        }
    } // end animateTick

} // end class
