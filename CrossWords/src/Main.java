import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("Reading file...");

		BufferedReader inputStream = null;
		int words = 0;
		Trie t = new Trie();
		
		String currentword = "";
		try {
			
			inputStream = new BufferedReader(new FileReader("scrabble.txt"));
			int c;
			System.out.println("File read. Loading words into dictionary...");

			while ((c = inputStream.read()) != -1) {
				if(c == ' ' || c == '\n') {//if its a space
					t.insert(currentword);
					words++;
					//System.out.println(currentword);
					currentword = "";

				}
				else {
					currentword += (char) c + "";
				}
			}
		}

		finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
		System.out.println("Loaded " + words + " words into the dictionary.");
		System.out.println("Updating heights...");
		t.updateHeights();
		int length = 18;
		int lengthwords = 0;
		System.out.println("Finding "  + length + " letter words");
		
		while((t.findWord(length))!= null) {
			lengthwords++;
		}
		
		System.out.println("Total " +  length  + " letter words in dictionary: "  + lengthwords);
			
	}

}
