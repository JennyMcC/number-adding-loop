package Week2;

public class Dog {
	String name; //defaults to null (bc String is an object)
	int numberOfLegs = 4; //setting a default for number of legs
	
	void rename(String newName) {
		//could have done this:
		//this.name = newName;
		name = newName;
	}
	
	void speak() {
		bark();
		System.out.println("My name is " + name); // name is same as this.name
	}
	void bark() {
		System.out.println("Wrrfff");
	}
}
