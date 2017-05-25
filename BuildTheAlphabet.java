package Week2;

public class BuildTheAlphabet {

	public static void main(String[] args) {
		
		byte letter = 'a';
		
		System.out.println(letter); // prints 97. WAT.
		
		char[] alphabet = new char[26];
		for (char ltr = 'a'; ltr <= 'z'; ltr++) {
			int index = ltr - 'a';
			alphabet[index] = ltr;
	}

}}
