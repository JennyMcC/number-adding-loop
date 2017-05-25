package Week2;

public class Calculator {

	int previousNumber;
	int currentNumber;
	char operation;
	
	int pushNumbers(int number) {
		previousNumber = currentNumber;
		currentNumber = number;
		return currentNumber;
	}
	void pushAdd() {
		operation = '+';
	}
	
	int pushEquals() {
		if(operation == '+') {
			currentNumber = currentNumber + previousNumber;
		} else {
			currentNumber = previousNumber - currentNumber;
		}
		return currentNumber;
	}
	void pushMinus() {
		operation = '-';
	}
}

