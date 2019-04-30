package Exercises;

public class Calculator {

	public int addition(int a, int b) {
		return a + b;
	}

	public boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else
			return false;
	}

	public boolean isLessThan(int val1, int val2) {
		if (val1 < val2) {
			return true;
		} else
			return false;
	}

	public String sameObject() {
		String str4 = "WA";
		return str4;
	}

	public String objectOne() {
		String str1 = "One";
		return str1;
	}

	public Object[] states() {
		String[] states1 = { "WA", "OR", "MT" };
		return states1;
	}

	public String nothing() {
		String str3 = null;
		return str3;
	}

}
