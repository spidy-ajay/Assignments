package Assignments2_collection_List;
import java.util.*;

public class New_store {
public static void main(String[] args) {
	 Set<String> colors = new HashSet<>(Arrays.asList("red", "blue", "green", "yellow"));

   
     Set<String> upperColors = new HashSet<>();

     for (String color : colors) {
         upperColors.add(color.toUpperCase());  
     }

     
     System.out.println("Original Set: " + colors);
     System.out.println("Uppercase Set: " + upperColors);
}
}
