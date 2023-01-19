package Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class Hasher {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add("null");
	h.add("null");
	h.add(200);
	h.add("Abhi");
	
	Iterator itr = h.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
