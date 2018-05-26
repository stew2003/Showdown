package showdown;

import java.io.*;

import creatures.*;

public class main {
	public static void main(String[] args) throws IOException {
		//mainloop goes here
		Player player1 = new Player("Jack", new File("/Users/Stewart/Desktop/hi.txt"));
		System.out.println(player1.getHand());
		Player player2 = new Player("Stew", new File("/Users/Stewart/Desktop/hi.txt"));
		Game game = new Game(player1, player2);
		while(!game.isOver()) {
			game.player1.turn();
			game.player2.turn();
		}
		System.out.println(game.whoDead());
	}

}
