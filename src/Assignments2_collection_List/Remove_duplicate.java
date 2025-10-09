package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Remove_duplicate {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Ajay", "Abhi", "nakul", "Abhi", "Ajay");
		for (String str : l) {
			if (l.indexOf(str) == l.lastIndexOf(str)) {
				System.out.println(str);
			}
		}
	}
}
