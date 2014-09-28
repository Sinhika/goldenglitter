package akkamaddi.goldenglitter.code;

public class ClientProxy extends akkamaddi.akkamaddiCore.api.ClientProxy
{
    @Override
    public void registerRenderers()
    {
        // This is for rendering entities and so forth later on
		// Armor Renderers
		GoldenGlitterCore.rendererRoseGold = addArmor("roseGold");
    }

} // end class ClientProxy
