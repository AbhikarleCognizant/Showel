package Collections;

import java.util.Vector;

public class Vectorclass2 {
@SuppressWarnings({ "unlikely-arg-type", "unchecked", "rawtypes" })
public static void main(String[] args) {
	Vector b=new Vector();
	b.add(10);
	b.add('l');
	b.add("qwer");
	b.add(null);
	b.add(null);
	System.out.println(b);
	System.out.println(b.capacity());
	System.out.println(b.clone());
	System.out.println(b.contains(null));
	System.out.println(b.equals(45));
	System.out.println(b.firstElement());
	System.out.println(b.lastElement());
	System.out.println(b.get(0));
	System.out.println(b.indexOf('l'));
	
	
}
}
