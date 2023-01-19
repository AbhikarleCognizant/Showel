package Collections;

import java.util.LinkedHashSet;

public class Linkedhashset1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	LinkedHashSet l=new LinkedHashSet();
	l.add(10);
	l.add("dfr");
	l.add(null);
	System.out.println(l);
	System.out.println(l.clone());
	System.out.println(l.contains(10));
	System.out.println(l.isEmpty());
}
}
