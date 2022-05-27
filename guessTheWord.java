package Application;
import java.util.Scanner;

public class guessTheWord {
	private boolean play=true;
	Scanner sc=new Scanner(System.in);
	private words randomword=new words();
	String letter;
	int rounds=10;
	char lastround;
public void start() {
	do {
		showWord();
		getInput();
		checkInput();
	}while(play);
}
void showWord() {
	System.out.println("you have "+rounds+"left");
	System.out.println(randomword);
}
void getInput() {
	System.out.println("Enter a letter");
	String userGuess=sc.nextLine();
	lastround=userGuess.charAt(0);
}
void checkInput() {
	boolean isguessRight=randomword.guess(lastround);
	if(isguessRight) {
	if(randomword.isguessRight()) {
		System.out.println("Congratulations you won the game...");
		System.out.println("your word is : "+randomword);
		play=false;
		}
		
	}else {
		rounds--;
		if(rounds==0) {
			System.out.println("Game over!!");
			play=false;
		}
	}
}
void end() {
	//Scanner.close();
}
}
