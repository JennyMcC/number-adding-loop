package Week2;

public class SplitStringList {

	public static void main(String[] args) {
		String sports = "hockey, baseball, football & basketball";
		String[] elements = sports.split(", | & "); //can also put .split("[,&]");
		
		System.out.println(elements[0]); 
		System.out.println(elements[1]);
		System.out.println(elements[2]);
		System.out.println(elements[3]);
		

	}

}
