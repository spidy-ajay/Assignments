package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Check {
	public static void main(String[] args) {
		Set<Integer>s=new HashSet<>(Set.of(12,22,10,33));
		int target=10;
		boolean found=false;
		for(int num:s) {
		    if( target==num) {
		    	found=true;
		    	break;
		    }	
		     
		}
		if(found) {
			System.out.println("No is exists : "+target);
		}
		else {
			System.out.println("No is not Exists  : "+target);
		}
		
		
	}

}
