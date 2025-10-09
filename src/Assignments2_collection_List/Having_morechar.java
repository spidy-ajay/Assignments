package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Having_morechar {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Ajay", "gopal", "chandrakant", "Abhimanyu","Akansha");
		int count = 0;
		for (String str : l) {
			if (str.length() > 5) {
				count++;
			}
		}
		System.out.println("elements having more than 5 char : "+count);

	}

}
