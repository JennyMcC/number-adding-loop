package Week2;

public class CharArrayDemo {

	public static void main(String[] args) {
		String myName = "Sue";
		char[] letters = myName.toCharArray();

		System.out.println("The first letter of my name is " + letters[0]);
		
		int lastIndex = letters.length - 1;
		System.out.println("The last letter of the boy's name is " + letters[lastIndex]);
		

	}

}
