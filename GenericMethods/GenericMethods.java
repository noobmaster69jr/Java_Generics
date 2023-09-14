package Generics.GenericMethods;

public class GenericMethods {

	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4 };
		String[] names = { "arun", "tharun", "karan" };
		print(numbers);
		print(names);
	}

	public static <T> void print(T[] array) {
		for (T e : array) {
			System.out.print(e.getClass().getName() + " " + e + ", ");

		}
		System.out.println();
	}
}
