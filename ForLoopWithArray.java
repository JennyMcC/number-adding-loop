package Week2;

public class ForLoopWithArray {

	public static void main(String[] args) {
		
		String[] roygbivColors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
		
		//if I need to know an index or count or...
		for(int index = 0; index < roygbivColors.length; index++) {
			System.out.println("The color for index is " + index + " is " + roygbivColors[index]);
		}
		
		System.out.println("With an enhanced for (for each):");
		//if I only need to do something with every element in my array
		//enhanced for
		for(String color: roygbivColors) {
			System.out.println("The color is " + color);
		}
		
		char[] alphabet = {'a', 'b', 'c'};
		for(char letter: alphabet) {
			System.out.println(letter);
		}
	
	}

}
