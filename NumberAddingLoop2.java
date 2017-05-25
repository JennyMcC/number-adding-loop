package Week2;

import java.util.Scanner;

public class NumberAddingLoop2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number 1 - 30:");
		
		int firstNumber = input.nextInt();
		
		System.out.println("Enter another number 1 - 30:");
		
		int secondNumber = input.nextInt();
		
		if(firstNumber > secondNumber) {
			System.out.println("ERROR");
		} else {
			
		int count = firstNumber;	
		int sum = 0;
		for(count = firstNumber; count <= secondNumber; count++) {
			sum += count;
			}
		System.out.println("Your results are: " + sum);

	}
		input.close();

}}
