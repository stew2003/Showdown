package creatures;

import showdown.ElementalTypes;
import showdown.creatureCard;

public class Seal extends creatureCard {
	public Seal(){
		super("Seal", 100, 0, "Bark", ElementalTypes.WATER, new Selkie());
	}
}
