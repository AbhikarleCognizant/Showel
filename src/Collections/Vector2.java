package Collections;

import java.util.Vector;

public class Vector2 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add('o');
	v.add(null);
	v.add(null);
	v.add("root");
	
	System.out.println(v.capacity());//10
	//print all data
	System.out.println(v);
	//size
	System.out.println(v.size());//5
	//isempty
	System.out.println(v.isEmpty());//false
	//get the particular data
	System.out.println(v.get(4));//Ankush
	//rightshift
	v.add(0,"Anky");
	System.out.println(v);
	//remove(left shift)
	v.remove(0);
	System.out.println(v);
	
}
}
