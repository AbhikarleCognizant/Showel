package Collections;

import java.util.Vector;

public class Vector_32 {
@SuppressWarnings({ "unlikely-arg-type", "unchecked", "rawtypes" })
public static void main(String[] args) {
	Vector c=new Vector();
	c.add(90);
	c.add('p');
	c.add(null);
	c.add(null);
	c.add("fooom");
	System.out.println(c);
	System.out.println(c.capacity());
	System.out.println(c.clone());
	System.out.println(c.contains(80));
	System.out.println(c.equals('p'));
	System.out.println(c.isEmpty());
	System.out.println(c.firstElement());
	System.out.println(c.get(3));
	System.out.println(c.lastElement());
	
	
}
}
