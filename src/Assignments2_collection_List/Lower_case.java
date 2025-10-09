package Assignments2_collection_List;
import java.util.*;

public class Lower_case {
	public static void main(String[] args) {
        Set<String> words = new HashSet<>(Arrays.asList("Apple", "BANANA", "Orange", "Mango"));

        Set<String> lowerCaseWords = new HashSet<>();

        for (String word : words) {
            lowerCaseWords.add(word.toLowerCase()); 
        }

        System.out.println("Original Set: " + words);
        System.out.println("Lowercase Set: " + lowerCaseWords);
		
	}

}
