package akkamaddi.plugins.goldenglitter;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import alexndr.api.content.blocks.SimpleBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HephaestanStorageBlock extends SimpleBlock
{
    /**
     * The main constructor for the blocks.
     *
     * @param par1 = ID of the block.
     * @param material = The material of the block. This sets what tools are effective against it, the sounds it makes, etc.
     */

    public HephaestanStorageBlock(Material material, String mod)
    {
        super(material);
        modId(mod);
		setHardness(Settings.hephaestanGoldHardness);
		setResistance(Settings.hephaestanGoldResistance);
		setStepSound(Block.soundTypeMetal);
		setBlockName("blockHephaestanGold");
		setCreativeTab(GoldenGlitter.tabAkkamaddiGolden);
		setLightLevel(1.0F);
		setBeaconBase(true);
    }

    @Override
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (Settings.MakeHephaestanSparkle == true)
        {
            float f1 = x - 0.5F;
            float f2 = y - 0.5F;
            float f3 = z - 0.5F;
            float f4 = random.nextFloat() * 2.0f;
            float f5 = random.nextFloat() * 2.0f;
            float f6 = random.nextFloat() * 2.0f;
            world.spawnParticle("reddust", f1 + f4, f2 + f5 , f3 + f6, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", (f1 + 0.3) + (f6 * 0.7), (f2 + 0.3) + (f4 * 0.7) , (f3 + 0.3) + (f5 * 0.7), 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
    }

    /**
    * Can this block provide power. Only wire currently seems to have this change based on its state.
    */
    @Override
	public boolean canProvidePower()
    {
        return true;
    }

    /**
     * Returns true if the block is emitting indirect/weak redstone power on the specified side. If isBlockNormalCube
     * returns true, standard redstone propagation rules will apply instead and this will not be called. Args: World, X,
     * Y, Z, side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    @Override
	public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return 5;
    }
}
