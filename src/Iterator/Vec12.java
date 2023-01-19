package Iterator;

import java.util.Iterator;
import java.util.Vector;

public class Vec12 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Vector v= new Vector();
	v.add("null");
	v.add("null");
	v.add("Abhi");
	v.add('W');
	v.add(10);
	System.out.println("print the data inside the vector using iterator");
	Iterator itr = v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
