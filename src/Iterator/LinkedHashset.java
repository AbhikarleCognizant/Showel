package Iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add(10);
	lhs.add("Abhi");
	lhs.add('E');
	System.out.println("print the data using iterator");
	Iterator itr = lhs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
