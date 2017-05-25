package Week2;

import java.util.Scanner;

public class ATMPinNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pinNumber = 6742;
		int guess;
		int numAttempts = 0;
		
		do {
			System.out.println("Enter your PIN:");
			guess = input.nextInt();
			
			numAttempts++;
			
			  if (guess == pinNumber) {
				System.out.println("Look at you, remembering stuff correctly.");
			} else {
				System.out.println("WRONG.");
			} if (numAttempts == 3) {
				System.out.println("You've reached maximum attempts. Try again another day, you fool.");
			}
			} while ((guess != pinNumber) && (numAttempts <= 2)); 
			
		input.close();
}}

