package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Logest {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Ajay", "prakash", "khairnar");
		String longest = "";
		for (String str : l) {
			if (str.length() > longest.length()) {
				longest = str;

			}
		}
		System.out.println(longest);

	}
}
