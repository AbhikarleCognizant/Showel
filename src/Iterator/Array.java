package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("ganesh");
	al.add(100);
	al.add("null");
	al.add('A');
	//System.out.println(al);
	System.out.println("print the data inside the Array list using iterator");
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
