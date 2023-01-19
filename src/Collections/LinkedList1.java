package Collections;

import java.util.LinkedList;

public class LinkedList1 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	LinkedList f=new LinkedList();
	f.add(10);
	f.add(null);
	f.add('p');
	f.add("you are the");
	System.out.println(f);
	System.out.println(f.clone());
	System.out.println(f.contains(10));//true
	f.add(2,"z");
	System.out.println(f);
	f.remove(3);
	System.out.println(f.get(2)); //p
	System.out.println(f.getFirst());//10
	System.out.println(f.getLast());// you are the
	System.out.println(f.size());//4
	
}
}
