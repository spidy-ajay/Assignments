package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Centain_ing {
	public static void main(String[] args) {
		Set<String>s=new HashSet<>(Set.of("play","cycling","throw","singing"));
		
	  int count=0;
	  for(String str:s) {
		  if(str.contains("ing")) {
			  count++;
		  }
		   
	  }
	  System.out.println(count);
	}
	

}
