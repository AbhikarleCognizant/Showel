package Collections;

import java.util.ArrayList;

public class ArrayList1 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Abhi");
	al.add(null);
	al.add(10);
	al.add(null);
	
	System.out.println(al);
	//check the size
	System.out.println(al.size());
	//check whether it is empty
	System.out.println(al.isEmpty());//false
	//contains or not
	System.out.println(al.contains(10));//true
	//get the data of particular index
	System.out.println(al.get(2));//'A'
	//insertion(right shift operator)
	al.add(2,50);
	System.out.println(al.get(2));//500
	//print entire data
	System.out.println(al);//right shift operation
	//remove the data (left shift operation)
	al.remove(2);//left shift
	System.out.println(al);
}
}
