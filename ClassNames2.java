package Week2;

import java.util.Scanner;

public class ClassNames2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a classmates name:");
		String firstName = input.next();
		System.out.println(firstName.charAt(0));
		
		System.out.println("Enter a classmates name:");
		String secondName = input.next();
		System.out.println(secondName.charAt(0));
		
		System.out.println("Enter a classmates name:");
		String thirdName = input.next();
		System.out.println(thirdName.charAt(0));
		
		System.out.println("Enter a classmates name:");
		String fourthName = input.next();
		System.out.println(fourthName.charAt(0));
		
		input.close();
	}

}
