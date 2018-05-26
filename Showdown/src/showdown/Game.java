package showdown;
//game class
public class Game {
	public Player player1;
	public Player player2;
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	public boolean isOver() {
		if(player1.isDead() || player2.isDead()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String whoDead() {
		if(player1.isDead()) {
			return player1.getName();
		}
		else {
			return player2.getName();
		}
	}

}
