package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(14);
	l.add("WAsgi");
	l.add("null");
	l.add("null");
	System.out.println("print the data inside the LinkedList using iterator");
	Iterator itr = l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
