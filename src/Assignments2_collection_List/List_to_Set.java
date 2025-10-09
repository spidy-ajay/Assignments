package Assignments2_collection_List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_to_Set {
	public static void main(String[] args) {
		List<Integer>l= Arrays.asList(12,23,44,55,22,55,22,12);
		
		Set<Integer>s=new HashSet<>(l);
		
		System.out.println(l);
		System.out.println(s);
	}

}
