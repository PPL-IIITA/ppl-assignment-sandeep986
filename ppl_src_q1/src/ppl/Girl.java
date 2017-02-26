package ppl;

public class Girl {
	String name,type;
    int maintenance,intel_level,attractiveness;
    boolean relationship_status;
    Girl(String name, int attractiveness, int maintenance, int intel_level, String type)
    {
        this.name=name;
        this.attractiveness=attractiveness;
        this.maintenance=maintenance;
        this.intel_level=intel_level;
        this.type=type;
        relationship_status=false;
       
    }
}
