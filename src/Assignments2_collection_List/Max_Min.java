package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Max_Min {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(22, 44, 23, 43, 55);
		int max = l.get(0);
		int min = l.get(0);
		for (int no : l) {
			if (no > max) {
				max = no;
			}
			if (no < min) {
				min = no;
			}
		}
		System.out.println(l);
		System.out.println("maximum no:" + max);
		System.out.println("minimum no:" + min);

	}
}
