package Assignments2_collection_List;
import java.util.*;
public class Less_than {
	


	    public static void main(String[] args) {
	        // Original list
	        List<String> words = new ArrayList<>(Arrays.asList(
	                "cat", "apple", "dog", "banana", "hi", "orange"
	        ));

	        // New list to store words with length >= 4
	        List<String> filtered = new ArrayList<>();

	        for (String word : words) {
	            if (word.length() >= 4) {  // keep only words with length >= 4
	                filtered.add(word);
	            }
	        }

	        System.out.println("Original List: " + words);
	        System.out.println("Filtered List (length >= 4): " + filtered);
	    }
	}



