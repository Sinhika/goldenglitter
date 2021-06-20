package mod.akkamaddi.goldenglitter.loot;

import mod.alexndr.simplecorelib.helpers.InjectionTableLookup;

@SuppressWarnings("serial")
public class GoldenGlitterInjectionLookup extends InjectionTableLookup
{

    public GoldenGlitterInjectionLookup()
    {
        super();
        this.put("desert_pyramid", "desert_pyramid");
        this.put("jungle_temple", "jungle_temple");
        this.put("buried_treasure", "buried_treasure");
        this.put("simple_dungeon", "simple_dungeon");
        this.put("abandoned_mineshaft", "abandoned_mineshaft");
        AddDungeonAliases();
        AddOceanAliases();
    }

} // end class
