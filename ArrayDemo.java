package Week2;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] cupValues = new int[5];
		cupValues[0] = 42;
		cupValues[1] = 86;
		cupValues[2] = 23;
		cupValues[3] = 8;
		cupValues[4] = 91;

		System.out.println(cupValues[0]); // prints "42"
		System.out.println(cupValues[1]); // prints "86"
		System.out.println(cupValues[2]); // prints "23"
		System.out.println(cupValues[3]); // prints "8"
		System.out.println(cupValues[4]); // prints "91"
		
		//change value for index 2
		cupValues[2] = 82;
		System.out.println("Changing value of index 2");
		cupValues[2] = 67;
		System.out.println(cupValues[2]);
		
		System.out.println("The length of my array is " + cupValues.length);
		
		String[] giantWords = { "fee", "fie", "foe", "fum" };
		// or this: String[] giantWords = new String[4];
		giantWords[0] = "fee";
		giantWords[1] = "fie";
		giantWords[2] = "foe";
		giantWords[3] = "fum";
		
	}
	

}
