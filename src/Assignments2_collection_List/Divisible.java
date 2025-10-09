package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Divisible {
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(22,9,90,50,900,70);
	    int count=0;
		for(int div:l) {
			if(div%3==0 && div%5==0) {
				System.out.println(div+" :-is divisible by 3 and 5 both");
				
				 count++;
				
			}
		} 
		System.out.println("Count is"+count);
	}

}
