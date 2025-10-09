package Assignments2_collection_List;

import java.util.*;

public class Last_name {
	public static void main(String[] args) {
		List<String> fullNames = Arrays.asList("John Doe", "Jane Smith", "Ajay Khairnar", "Anita Sharma");

		System.out.println("First names:");

		for (String name : fullNames) {
			String firstName = name.split(" ")[0];
			System.out.println(firstName);
		}
	}

}
