package Week2;

import java.util.Scanner;

public class DogAppDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Dog fido = new Dog(); //"Dog" is a class
		writeLine("My dog is " + fido);
		
		fido.name = "Fido";
		writeLine("Her name is " + fido.name);
		
		writeLine(fido.name + " has " + fido.numberOfLegs + " legs."); //haven't yet declared number of legs
		
		fido.numberOfLegs = 3;
		writeLine(fido.name + " has " + fido.numberOfLegs + " legs.");
		
	  //Fido runs away and ends up in a shelter for three-legged dogs
	  //When Fido gets adopted...
		fido.rename("Hope");
		
		writeLine("Her name is now " + fido.name);
		fido.speak();
		
		writeLine("Bark, Hope!");
		fido.bark();	
		
		Dog myOtherDog = new Dog();
		myOtherDog.name = "Krusty";
		
		writeLine("My other dog's name is " + myOtherDog.name);
		myOtherDog.speak();
		
		writeLine("You come home. Your dogs act as if you've been gone for sooo long.");
		Dog[] myDogs = {fido, myOtherDog};
		for(Dog currentDog: myDogs) { //could have: for(int index = 0; index < myDogs.length; index++) {
			currentDog.bark();
			
		}
	} //closing bracket for main
	
	public static void writeLine(String message) {
		System.out.println(message);
	}
}
