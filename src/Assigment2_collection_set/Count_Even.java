package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Count_Even {
	public static void main(String[] args) {
		Set<Integer>s=new HashSet<>();
		s.add(12);
		s.add(33);
		s.add(20);
		s.add(13);
		
		int count=0;
		
		for(int num:s) {
			if(num%2==0) {
				count++;
			}
		}
		System.out.println("Count of Even number is :"+count);
	}

}
