package Collections;

import java.util.Vector;
public class Vector_12 {
@SuppressWarnings({ "unlikely-arg-type", "unchecked", "rawtypes" })
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(70);
	v.add('y');
	v.add(null);
	v.add("power");
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.contains('y'));
	System.out.println(v.get(3));
	System.out.println(v.capacity());
	System.out.println(v.clone());
	System.out.println(v.equals(70));
	System.out.println(v.firstElement());
	System.out.println(v.isEmpty());
	System.out.println(v.lastElement());
	
	}
}

