package Week2;

import java.util.Scanner;

public class AtmDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userPin = "1234";
		
		String guess;
		int failCount = 0;
		
		do {
			
			System.out.println("Enter your PIN:");
			guess = input.next();
				
			if(!guess.equals(userPin)) { // it is wrong
				System.out.println("Sorry, wrong!");
				failCount = failCount + 1; // or failCount++
			}
			// if the user has failed 3 times
			if(failCount == 3) {
				System.out.println("So sorry. You are a failure.");
				break;
			}
		} while(!guess.equals(userPin)); // ! is NOT
		// guess == userPin would be comparing references, not values
		
		System.out.println("Congratulations!");
		
		input.close();
	}

}
