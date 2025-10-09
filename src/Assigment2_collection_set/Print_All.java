package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Print_All {
public static void main(String[] args) {
	Set<String>s=new  HashSet<>();
	
	s.add("apple");
	s.add("banana");
	s.add("chickoo");
	s.add("mango");
	
	for(String str:s) {
		System.out.println(str);
	}
}
}
