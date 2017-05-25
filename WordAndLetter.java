package Week2;

import java.util.Scanner;

public class WordAndLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		
		String name = input.next();
		name = name.toLowerCase();
		
		
		System.out.println("Enter a letter:");
		
		String letter = input.next();
		letter = letter.toLowerCase();
		//can also put String letter = input.next().toLowerCase; instead of using two lines.
		
		if (name.contains(letter)) {
			System.out.println("Yup, it's got one of those.");
		} else {
				System.out.println("So sorry");
				
			}
		input.close();
		}
		
	    	
	    }
		


