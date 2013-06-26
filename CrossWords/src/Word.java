public class Word {// a word in the crossword
	String word;

	int direction; //1 for across, 2 for down
	
	int row, column; //the location of the word
	int clue; //the corresponding clue number
	int length; //length of the word
	
	public Word(String word, int direction,int row, int column, int clue ) { //direction 1 = across, 2 = down
		this.direction = direction;
		this.word = word;
		this.length = word.length();
		this.row = row;
		this.column = column;
		this.clue = clue;
	} 
	public Word(int length, int direction,int row, int column, int clue ) { //for when we don't know the word and we need to add it.
		this.direction = direction;
		this.word = "?"; //the word is not defined yet
		this.row = row;
		this.column = column;
		this.length = length;
		this.clue = clue;
	} 
	
	

}
