package akkamaddi.plugins.goldenglitter;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import alexndr.api.content.blocks.SimpleBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RoseStorageBlock extends SimpleBlock
{
    /**
     * The main constructor for the blocks.
     *
     * @param par1 = ID of the block.
     * @param material = The material of the block. This sets what tools are effective against it, the sounds it makes, etc.
     */
    public RoseStorageBlock(Material material, String mod)
    {
        super(material);
        modId(mod);
		setHardness(Settings.roseGoldHardness);
		setResistance(Settings.roseGoldResistance);
		setStepSound(Block.soundTypeMetal);
		setBlockName("blockRoseGold");
		setCreativeTab(GoldenGlitter.tabAkkamaddiGolden);
		setBeaconBase(true);
    }

    @Override
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (Settings.MakeRoseHideous == true)
        {
            float f1 = x - 0.5F;
            float f2 = y - 0.5F;
            float f3 = z - 0.5F;
            float f4 = random.nextFloat() * 2.0f;
            float f5 = random.nextFloat() * 2.0f;
            float f6 = random.nextFloat() * 2.0f;
            world.spawnParticle("heart", f1 + f4, f2 + f5 , f3 + f6, 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
    }
}
