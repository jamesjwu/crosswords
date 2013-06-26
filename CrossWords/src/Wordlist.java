import java.util.ArrayList;

public class Wordlist {
	String[][] words; // two dimensional array so we can organize the wordlist
						// by length. Row will be the length, which organizes
						// the columns to be the words
	int[] indices; //tracks which words have been used already

	String[] wordlist;

	public Wordlist(String[] word) {
		words = new String[28][];
		wordlist = word;
		this.loadWords();
		indices = new int[28];
		for(int i = 0; i < 28; i++) {
			indices[i] = 0;//start them all at 0.
		}

	}

	private void loadWords() { // We want it to be as fast
								// as possible AFTER being
								// loaded; we don't really
								// care about load times, so it's viable to
								// first load the words into a regular array

		ArrayList<ArrayList<String>> word = new ArrayList<ArrayList<String>>(28); //creates a two dimensional arraylist
		for(int x = 0; x < 28; x++) {
			ArrayList<String> newlist = new ArrayList<String>();
			word.add(newlist);
		}
		for (String x : wordlist) {
			
			word.get(x.length()-1).add(x); //adds the word to the correct location
		}
		
		for(int x= 0; x < 28; x++) { //for every list of strings, after the words have been loaded, put it into a new two dimensional array
			this.words[x] = word.get(x).toArray(new String[0]);
			
		}

	}
	
	
	public String nextWord(int length) { //returns the next unused word of length length
		if(words[length-1].length <= indices[length-1]) { //if there aren't any more words
			System.out.println("No more words of this length");
			return "";
		}
		return words[length-1][indices[length-1]++];
	}

}
