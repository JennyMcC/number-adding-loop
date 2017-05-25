package Week2;

import java.util.Scanner;

public class GuessANumberDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Random generator = new Random();  to generate a "random" number. "Generator" is your named variable.
		
		int secretNumber = 11; //If you're using Random then change 11 to generator.nextInt(100) + 1; (to make the range 1-100)
		int guess;
		
		do {
			System.out.println("Pick a number from 1 to 100:");
			guess = input.nextInt();
			
			if(guess == secretNumber) {
				System.out.println("You guessed the right number");
			} else {
				System.out.println("You are WRONG, sir.");
			
			}
			
		} while (guess != secretNumber);
		
		input.close();
	}

}
