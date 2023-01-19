package Collections;

import java.util.HashSet;

public class Hash_set {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add(null);
	h.add('E');
	h.add("Cat");
	h.add(200);
	System.out.println(h);
	System.out.println(h.contains(300));
	System.out.println(h.size());
	
}
}
