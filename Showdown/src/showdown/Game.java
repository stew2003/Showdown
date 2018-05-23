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
	private Player player1;
	private Player player2;
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	

}
