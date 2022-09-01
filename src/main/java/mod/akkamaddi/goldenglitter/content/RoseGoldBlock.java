package mod.akkamaddi.goldenglitter.content;

import java.util.Random;

import mod.akkamaddi.goldenglitter.config.GoldenConfig;
import mod.alexndr.simplecorelib.api.client.ClientUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RoseGoldBlock extends Block
{
    public RoseGoldBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand)
    {
        if (worldIn.isClientSide && GoldenConfig.makeRoseHideous) 
        {
            super.animateTick(stateIn, worldIn, pos, rand);
            double pv[] = ClientUtils.findBlockParticleVector(pos, rand);
            worldIn.addParticle(ParticleTypes.HEART, pv[0], pv[1], pv[2], pv[3], pv[4], pv[5]);
        }
    } // end animateTick

} // end class
