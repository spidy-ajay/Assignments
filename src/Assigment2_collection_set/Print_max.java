package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Print_max {
public static void main(String[] args) {
	Set<String>s=new HashSet(Set.of("payal","shilpa","geeta"));
	
	String res="";
	int max=0;
	for(String str:s) {
	  int count=0;
	  for(char ch:str.toLowerCase().toCharArray()) {
		  if("aeiou".indexOf(ch)!=-1) {
			  count++;
		  }
		  }
	      if(count>max) {
	    	  max=count;
	    	  res=str;
	      }
	  }
	System.out.println(res);
}
}
