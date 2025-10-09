package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Add_Integer {
	public static void main(String[] args) {
		Set<Integer>s=new HashSet<>();
		s.add(23);
		s.add(40);
		s.add(44);
		s.add(22);
		s.add(40);
		s.add(null);
		s.add(23);
		
		
		System.out.println(s);
	}

}
