package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Start_A {
	public static void main(String[] args) {
		List<String>l= Arrays.asList("Ajay","gaurav","Abhi","gopal");
		
		for(String s:l) {
			if(s.startsWith("A")) {
			  System.out.println(s);
				
			}
			}
		}
	

}
