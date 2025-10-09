package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Vowel {
	public static void main(String[] args) {
		Set<String>s=new HashSet<>(Set.of("Abhi","nakul","gopal","gaurav"));
	    int count=0;
		for(String str:s) {
			
			for(char ch:str.toLowerCase().toCharArray()) {
				if("aeiou".indexOf(ch)!=-1) {
					count++;
				}
				
			}
			 
		 }
		
		System.out.println(count);
	}

}
