package Week2;

import java.util.Scanner;

public class NumberAddingLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number 1 - 30:");
		
		int yourNumber = input.nextInt();
		int count = 1;
		int sum = 0;
		
		for(count = 1; count <= yourNumber; count++) {
			sum += count;
			}
		System.out.println("Your results are: " + sum);
		
		input.close();
	}
	
}
