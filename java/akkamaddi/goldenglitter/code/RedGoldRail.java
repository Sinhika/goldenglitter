package akkamaddi.goldenglitter.code;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedGoldRail extends BlockRail
{
    @SideOnly(Side.CLIENT)
    private IIcon theIcon;
    private IIcon blockIcon;

    protected RedGoldRail()
    {
        super();
		setHardness(1.0F);
		setResistance(1.0F);
		setStepSound(Block.soundTypeMetal);
		setBlockName("redGoldRail");
		setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden);
		setLightLevel(1.0F);
		setBlockTextureName("redGoldRail");
    }

    /**
     * Returns true if the block is emitting indirect/weak redstone power on the specified side. If isBlockNormalCube
     * returns true, standard redstone propagation rules will apply instead and this will not be called. Args: World, X,
     * Y, Z, side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    @Override
	public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return 15;
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public IIcon getIcon(int par1, int par2)
    {
        return par2 >= 6 ? this.theIcon : this.blockIcon;
    }

    @Override
	@SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.theIcon = par1IconRegister.registerIcon("goldenglitter" + ":" + (this.getUnlocalizedName()) + "_turned");
        this.blockIcon = par1IconRegister.registerIcon("goldenglitter" + ":" + (this.getTextureName()));
    }

    @Override
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (GoldenGlitterCore.MakeRedGoldRailSparkle == true)
        {
            float f1 = x;
            float f2 = y - 0.1F;
            float f3 = z;
            float f4 = random.nextFloat();
            float f5 = random.nextFloat() * .4f;
            float f6 = random.nextFloat();
            world.spawnParticle("reddust", f1 + f4, f2 + f5 , f3 + f6, 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
    }
} // end class RedGoldRail
