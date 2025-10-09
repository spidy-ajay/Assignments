package Assignments2_collection_List;

import java.util.*;

public class Present {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		Set<Integer> set = new HashSet<>(Arrays.asList(20, 40, 60));

		System.out.println("Elements in list but not in set:");

		for (int num : list) {
			if (!set.contains(num)) {
				System.out.println(num);
			}
		}
	}
}
