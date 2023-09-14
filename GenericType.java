package Generics;

import java.util.LinkedList;
import java.util.List;

public class GenericType {
	public static void main(String[] args) {
		// List<E>

		// Argument type
		List<Integer> number = new LinkedList<>();
		number.add(1);
		List<String> number2 = new LinkedList<>();
		number2.add("hello");
		number2.add("3");
		// Map<Point, triplePoint> = parameter type
		System.out.print(number2);
	}
}

/*
 * Naming Convention: E - Element N - Number K - key V - values T - type
 */
