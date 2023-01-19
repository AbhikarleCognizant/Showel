package Collections;

import java.util.HashSet;

public class Hashset2 {
@SuppressWarnings({ "rawtypes", "unchecked", "unlikely-arg-type" })
public static void main(String[] args) {
	HashSet o=new HashSet();
	o.add(10);
	o.add("Abhi");
	o.add(null);
	o.add(null);
	o.add('p');
	System.out.println(o);
	System.out.println(o.size());
	System.out.println(o.contains("Abhi"));
	System.out.println(o.isEmpty());
	System.out.println(o.equals(10));
	
}
}
