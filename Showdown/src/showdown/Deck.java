package showdown;
import java.io.*;
import creatures.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> library = new ArrayList<Card>();
	public Deck(File deckFile) throws IOException{
		try {
			BufferedReader br = new BufferedReader(new FileReader(deckFile));	
			try {
				String line = br.readLine();
				while (line != null) {
					if(line.equals("Salamander")) {
						this.library.add(new Salamander());
					}
					else if(line.equals("Phoenix")) {
						this.library.add(new Phoenix());
					}
					else if(line.equals("Seal")) {
						this.library.add(new Seal());
					}
					else if(line.equals("Seahorse")) {
						this.library.add(new Seahorse());
					}
					else if(line.equals("Goblin")) {
						this.library.add(new Goblin());
					}
					else if(line.equals("Troll")) {
						this.library.add(new Troll());
					}
					line = br.readLine();
				}
				Collections.shuffle(this.library);
			}
			finally {
				br.close();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
