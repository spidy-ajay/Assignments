package Assiggnment1_Collection;

import java.util.ArrayList;
import java.util.List;

public class PrintListnm {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("Ram");
	list.add("sham");
	list.add("naul");
	list.add("Sita");
	list.add(1, "Abhi"); //Ass-3: insert element in 1st position
	
	//System.out.println(list.get(2)); //Ass-4: get the element index 2 
	
     list.set(1,"Ajay"); //Ass-5:change the element at index 1
	
    list.remove(0);  //Ass-6: remove the element at index 0
    
    System.out.println(list.size()); //Ass-7 find size of Arraylist
    System.out.println(list.contains("Sita")); //Ass-8 check the centain "sita"
    
	System.out.println(list);
}
}
