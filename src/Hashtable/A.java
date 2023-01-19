package Hashtable;

import java.util.Hashtable;

public class A {
public static void main(String[] args) {
	Hashtable<Character, Integer> h=new Hashtable<Character, Integer>();
	h.put('A', 20);
	h.put('B', 21);
	h.put('C', 22);
	h.put('D', 23);
	System.out.println(h);
	h.remove('C');
	System.out.println(h);
	System.out.println(h.contains(23));
	System.out.println(h.clone());
	System.out.println(h.isEmpty());
	System.out.println(h.containsKey('B'));
	System.out.println(h.containsValue(25));
	
}
}
