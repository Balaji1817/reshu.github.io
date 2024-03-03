import java.util.*;
public class NumberGame{
    static int highScore = 0;
    static int score = 60;
    static void game(){
        System.out.println("Guess the Correct number. You have only 7 chances.");
		double rand = Math.random();
		int random = (int) (rand*100)+1;
		//System.out.println(rand);
		//System.out.println(random);
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100: ");
		int guessednum = sc.nextInt();
        int chance = 1;
		while(guessednum != random && chance < 7){
		    chance++;
		    if(guessednum < random){
		        if(random-guessednum <= 10)
		            System.out.println("You are too closer.enter a bigger one.");
		        else
		        System.out.println("too small!! enter a bigger one.");
		    }
		    if(guessednum > random){
		        if(guessednum - random <= 10)
		            System.out.println("You are too closer.enter a Smaller one.");
		        else
		        System.out.println("Too big!! Enter a Smaller one.");
		    }
		    guessednum = sc.nextInt();
		    score -= 10;
		}
		if(chance<7){
		    System.out.println("Congortulations!! you guessed Correct number. The number was: "+random);
		    if(highScore<score) highScore = score;
		    System.out.println("score: "+score+" "+"highScore: "+ highScore);
		    score = 60;
		}
	else{
	    System.out.println("Opps!! You loose. Try again.");
	    if(highScore<score) highScore = score;
		System.out.println("score: "+score+" "+"highScore: "+ highScore);
		score = 60;
	}
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to Start the game.");
		int play = sc.nextInt();
		while(true){
		   if(play == 1){
		       game();
		       System.out.println("Enter 1 to play game - 1 to quit.");
		   }else if(play == -1){
	           System.out.println("Come again.");
		       break;
		   }else{
		       System.out.println("Enter 1 or -1.");
		   }
		   play = sc.nextInt();
		}
	}
}
