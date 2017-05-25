package Week2;

public class SkipMultiplesOfThree {

	public static void main(String[] args) {
		
		for(int count = 1; count <= 10; count++) {
			  if(count % 3 == 0) { // it's a multiple of three
			    continue;
			  }
			  System.out.println("Count is " + count);
			} // end of for loop
			System.out.println("I'm tired of counting.");
	}

}
