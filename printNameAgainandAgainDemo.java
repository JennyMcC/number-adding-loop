package Week2;

import java.util.Scanner;

public class printNameAgainandAgainDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your message:");
		String message = input.nextLine();
		
		int count = 1;
		while(count <= 5) {
			count++;
			System.out.println(message);
		}
		input.close();

	}

}
