package Assignments2_collection_List;

import java.util.Arrays;
import java.util.List;

public class Double_list {
	public static void main(String[] args) {
		List<Double>l=Arrays.asList(55.0,100.10,20.22,130.90);
		
		for(Double price:l) {
			if(price>100) {
				System.out.println("a prices greater than 100: "+price);
			}
		}
	}

}
