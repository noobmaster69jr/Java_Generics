package Generics.GenericClasses;

public class GenericClasses {
	public static void main(String[] args) {
		Box<Phone> box = new Box<>();
		box.set(new Phone("samsung"));
		System.out.print(box.get());
	}
}
