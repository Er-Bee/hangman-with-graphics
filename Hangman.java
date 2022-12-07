import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Random;

public class Hangman {
	private StringBuilder word;
	private StringBuilder hidden;
	private int mistakes;
	
	public Hangman() {
		String pick = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader("word_list.txt"));
			int lines = 0;
			while (in.readLine() != null)
				lines++;
			in.close();
			int rand = new Random().nextInt(lines);
			in = new BufferedReader(new FileReader("word_list.txt"));
			for (int i = 0; i < rand; i++) {
				in.readLine();
			}
			pick = in.readLine();
			in.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		word = new StringBuilder(pick);
		hidden = new StringBuilder();
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == ' ')
				hidden.append('-');
			else
				hidden.append('_');
		}
		mistakes = 0;
	}
	
	public Boolean guess(char c) {
		Boolean res = false;
		int index;
		while(word.indexOf(c + "") != -1) {
			res = true;
			index = word.indexOf(c + "");
			hidden.setCharAt(index, c);
			word.setCharAt(index, '-');
		}
		return res;
	}
	
	public void addMistake() {
		mistakes++;
	}
	
	public int getMistakes() {
		return mistakes;
	}
	
	public String getHidden() {
		return String.valueOf(hidden);
	}
	
	public String getWord() {
		return String.valueOf(word);
	}
	
	public static void main(String[] args) {
		Hangman h = new Hangman();
	}
	
}
