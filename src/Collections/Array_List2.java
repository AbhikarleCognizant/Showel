package Collections;

import java.util.ArrayList;

public class Array_List2 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	ArrayList m =new ArrayList();
    m.add("Abhi");
    m.add(10.0);
	m.add('o');
	m.add(null);
	m.add(null);
	System.out.println(m);
	System.out.println(m.contains(10.0));
	System.out.println(m.isEmpty());
	System.out.println(m.size());
	System.out.println(m.get(4));
	m.remove(2);
	System.out.println(m);
}
}
