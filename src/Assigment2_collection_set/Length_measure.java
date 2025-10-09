package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Length_measure {
	public static void main(String[] args) {
		Set<String>s=new HashSet<>();
		
		s.add("Shilpa");
		s.add("geeta");
		s.add("payal");
		s.add("abhi");
		
		
		for(String str:s) {
			if(str.length()==4) {
				
				System.out.println(str);
				
			}
		}
		
	}

}
