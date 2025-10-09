package Assignments2_collection_List;

import java.util.*;

public class Present_both {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Mango", "Orange");
		Set<String> set = new HashSet<>(Arrays.asList("Banana", "Grapes", "Orange", "Apple"));

		System.out.println("Elements present in both List and Set:");

		for (String item : list) {
			if (set.contains(item)) {
				System.out.println(item);
			}
		}
	}

}
