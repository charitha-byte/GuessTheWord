package Application;
import java.util.Random;

public class words {
private String[] randomWords= {"animals","happiness","indefinite","Charitha","varshitha",
		"properties","chemistry","python","java","nostalgia","impedence","tolerence"};
private String selectedWord;

private Random random=new Random();
private char[] letters;


public words() {
	selectedWord=randomWords[random.nextInt(randomWords.length)];
	letters=new char[selectedWord.length()];
}
public String toString() {
	
	String word="";
	
	for(char letter:letters) {//here the letter is looping from index 0 if it find any char it will add otherwise considered as null
		
		if(letter=='\u0000') {
			word+='-';
		}
		else {
			word+=letter;
		}
		word+=' ';
	} 
	
	return word;
}
public boolean isguessRight() {
	for(char letter:letters) {
		if(letter=='\u0000') {
			return false;
		}
	}
	return true;
}
public boolean guess(char letter) {
	boolean guessRight=false;
	for(int i=0;i<selectedWord.length();i++) {
		if(letter==selectedWord.charAt(i)) {
			letters[i]=letter;
			guessRight=true;
		}
	}
	return guessRight;
}
}

