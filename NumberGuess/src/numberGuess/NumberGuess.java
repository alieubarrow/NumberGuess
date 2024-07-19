package numberGuess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		final int MAX =  10;
		int guess = 0;
		int answer = 0;
		boolean correct = false;
		
		answer = rand.nextInt(MAX) + 1;
		System.out.print("Guess a number between 1 and 10: ");
		
		do {
				
		    guess = input.nextInt();
		
		    if (guess > answer) {
			System.out.print("Too high, try again: ");
		    } else if (guess < answer) {
			System.out.print("Too low, try again: ");
		    } else {
			System.out.println("Congratulations! You guessed the right number.");
			correct = true;
		    }
		
		} while (!correct);
			
		input.close();
	}
}
