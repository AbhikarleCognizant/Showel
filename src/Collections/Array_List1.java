package Collections;

import java.util.ArrayList;

public class Array_List1 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	 ArrayList n =new ArrayList();
	    n.add("Yogesh");
	    n.add(10);
		n.add('c');
		n.add(null);
		n.add(null);
		n.add("Suresh");
	    
		//I need to print entire data inside the collection
				System.out.println(n);
				//check the size
				System.out.println(n.size());
				//check whether it is empty
				System.out.println(n.isEmpty());//false
				//contains or not
				System.out.println(n.contains(100));//true
				//get the data of particular index
				System.out.println(n.get(2));//'A'
				//insertion(right shift operator)
				n.add(2,500);
				System.out.println(n.get(2));//500
				//print entire data
				System.out.println(n);//right shift operation
				//remove the data (left shift operation)
				n.remove(2);//left shift
				System.out.println(n);

}
}
