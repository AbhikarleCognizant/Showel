package Collections;
import java.util.ArrayList;
public class ArrayList4 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	ArrayList y =new ArrayList();
    y.add("Nill");
    y.add(25);
	y.add('p');
	y.add(null);
	y.add(null);
	System.out.println(y);
	//check the size
	System.out.println(y.size());
	//check whether it is empty
	System.out.println(y.isEmpty());//false
	//contains or not
	System.out.println(y.contains(100));//true
	//get the data of particular index
	System.out.println(y.get(2));//'A'
	//insertion(right shift operator)
	y.add(2,500);
	System.out.println(y.get(2));//500
	//print entire data
	System.out.println(y);//right shift operation
	//remove the data (left shift operation)
	y.remove(2);//left shift
	System.out.println(y);
}
}
