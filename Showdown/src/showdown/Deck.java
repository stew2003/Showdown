package showdown;
import java.io.*;
import java.util.ArrayList;

public class Deck {
	ArrayList<Card> library = new ArrayList<Card>();
	public Deck(File deckFile){
		try {
			BufferedReader br = new BufferedReader(new FileReader(deckFile));		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
