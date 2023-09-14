package Generics.wildcards;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnboundedWildCards {
	public static void main(String[] args) {
		// ? Wildcards
		// Unbounded Wildcards
		List<Object> list1 = Arrays.asList("11", 2, new Date());
		List<Integer> list2 = Arrays.asList(1, 2);
		List<String> list3 = Arrays.asList("1", "2");
		print(list1);
		print(list2);
		print(list3);
	}

	// cannot reference to the captured reference , also can extends/super to only
	// one type
	static void print(List<?> list) {
		list.forEach(e -> {
			System.out.println(e.getClass().getName());
			System.out.println(e);
		});
	}

}
