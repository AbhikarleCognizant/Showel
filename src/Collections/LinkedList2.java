package Collections;

import java.util.LinkedList;

public class LinkedList2 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(10);
	l.add('o');
	l.add("woo");
	l.add(null);
	l.add(null);
	System.out.println(l);
	System.out.println(l.contains(null));
	System.out.println(l.getFirst());
	System.out.println(l.getLast());
	System.out.println(l.indexOf(10));
	System.out.println(l.indexOf("woo"));
	System.out.println(l.size());
	System.out.println(l.get(3));
}
}
