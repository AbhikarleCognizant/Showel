package Collections;
import java.util.ArrayList;
public class Array_List3 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	ArrayList o =new ArrayList();
    o.add("Abhi");
    o.add(10.0);
	o.add('o');
	o.add(null);
	o.add(null);
	System.out.println(o);
	//check the size
	System.out.println(o.size());
	//check whether it is empty
	System.out.println(o.isEmpty());//false
	//contains or not
	System.out.println(o.contains(100));//true
	//get the data of particular index
	System.out.println(o.get(2));//'A'
	//insertion(right shift operator)
	o.add(2,500);
	System.out.println(o.get(2));//500
	//print entire data
	System.out.println(o);//right shift operation
	//remove the data (left shift operation)
	o.remove(2);//left shift
	System.out.println(o);
}
}
