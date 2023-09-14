package Generics;

import java.util.LinkedList;
import java.util.List;

public class GenericType {
	public static void main(String[] args) {
		// List<E>

		// Argument
		List<Integer> number = new LinkedList<>();
		number.add(1);
		// parameter type
		List number2 = new LinkedList<>();
		number2.add("hello");
		number2.add("3");
		number2.add(2);
		System.out.print(number2);
	}
}
