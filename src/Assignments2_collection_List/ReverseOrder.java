package Assignments2_collection_List;

import java.util.*;

public class ReverseOrder {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

		// Create reversed list
		List<Integer> reversed = new ArrayList<>();
		for (int i = numbers.size() - 1; i >= 0; i--) {
			reversed.add(numbers.get(i));
		}

		System.out.println("List in reverse order:");
		for (int num : reversed) { // foreach works here
			System.out.println(num);
		}
	}
}
