package Assignments2_collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manually_remove {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajay", "Ravi", "Sita", "Ajay", "Ravi", "Anita", "Sita", "John" );

        List<String> unique = new ArrayList<>();

        for (String name : names) {
            if (!unique.contains(name)) {  
                unique.add(name);
            }
        }

        System.out.println("Without duplicates: " + unique);
 

	}

}
