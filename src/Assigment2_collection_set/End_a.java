package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class End_a {
	public static void main(String[] args) {
		Set<String>s=new HashSet<>(Set.of("INDIA","USa","GERMANY","Span"));
		
		for(String str:s) {
			String s1=str.toUpperCase();
			
			if(s1.endsWith("A")) {
				System.out.println(str);
				
			}
		}
	
	}

}
