package Week2;

public class EvenOrOddDemo {

	public static void main(String[] args) {

		writeLine("Message for 42: " + chooseMessage(42));
		writeLine("Message for 23: " + chooseMessage(23));
			  } // end of main
	
	public static void writeLine(String message) {
		System.out.println(message);
			} //end of writeLine method

	public static String chooseMessage(int input) {
		if(input % 2 == 0) {
			return "Even Steven!";
			    }
				return "You're odd!";
			  } //end of coding method
			

	}


