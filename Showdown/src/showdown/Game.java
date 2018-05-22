package showdown;
//game class
public class Game {
	
	public creatureCard createSalamander(){
		return new creatureCard(60, 20, "Ember", ElementalTypes.FIRE, createKomodoDragon());		
	}
	public creatureCard createKomodoDragon(){
		return new creatureCard(90, 30, "Flamethrower", ElementalTypes.FIRE, createDragon());
	}
	public creatureCard createDragon() {
		return new creatureCard(120, 60, "Inferno", ElementalTypes.FIRE);
	}
	public static void main(String[] args) {
		System.out.println("Hello, this is a github test.");
		System.out.println("Hello, this is a your dad test ");
		System.out.println("Hello, this is a your mom test ");
	}

}
