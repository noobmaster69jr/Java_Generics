package Generics;

public class ClassCastExcep {

	// Generics helps us perform compile time checking and avoid ClassCastException
	public static void main(String[] args) {
		// Comparable number = 10;
		// number.compareTo("10");
		Comparable<Integer> number = 10;
		System.out.print(number.compareTo(10));
	}

}
