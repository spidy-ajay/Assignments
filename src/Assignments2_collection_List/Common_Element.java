package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Common_Element {
public static void main(String[] args) {
	  List<String> list1 = Arrays.asList("Ajay", "Ravi", "Sita", "Anita");
      List<String> list2 = Arrays.asList("Sita", "Ravi", "John", "Anita");

      System.out.println("Common elements:");

      
      for (String str1 : list1) {
       
          for (String str2 : list2) {
              if (str1.equals(str2)) {  
                  System.out.println(str1);
              }
          }
      }
	
}
}
