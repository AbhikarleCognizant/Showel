package Collections;

import java.util.LinkedList;

public class LinkedList3 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	LinkedList p=new LinkedList();
	p.add(900);
	p.add("Awash");
	p.add('l');
	p.add(null);
	System.out.println(p);
	System.out.println(p.clone());
	System.out.println(p.contains(400));
	System.out.println(p.get(2));
	System.out.println(p.getFirst());
	System.out.println(p.getLast());
	System.out.println(p.indexOf(null));
}
}
