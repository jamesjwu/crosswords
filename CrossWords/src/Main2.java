import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 { //for testing

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("Reading file...");

		BufferedReader inputStream = null;
		int words = 0;
		String[] wordlist = new String[172804];
		
		String currentword = "";
		try {
			
			inputStream = new BufferedReader(new FileReader("scrabble.txt"));
			int c;
			System.out.println("File read. Loading words into dictionary...");

			while ((c = inputStream.read()) != -1) {
				if(c == ' ' || c == '\n') {//if its a space
					wordlist[words] = currentword;
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
		Wordlist list = new Wordlist(wordlist);

		
		System.out.println(list.nextWord(2));
		System.out.println(list.nextWord(2));

		System.out.println(list.nextWord(2));

		System.out.println(list.nextWord(2));

		System.out.println(list.nextWord(2));
		System.out.println(list.nextWord(25));
		System.out.println(list.nextWord(26));


		
			
	}
	
	private Grid solve(Wordlist wordlist, Grid grid) {
		return null;
	}

}