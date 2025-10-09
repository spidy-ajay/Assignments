package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Print_Sum {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12, 25, 66, 44, 34, 10, 20);
		int sm = 0;

		for (int a : l) {
			if (a % 2 == 0) {
				sm = a + sm;

			}
		}
		System.out.println(sm);
	}
}
