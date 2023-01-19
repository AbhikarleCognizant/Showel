package Collections;

import java.util.HashSet;

public class Hashset3 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	HashSet f=new HashSet();
	f.add(100);
	f.add(null);
	f.add('r');
	f.add("Sawe");
	f.add(null);
	
	System.out.println(f);
	System.out.println(f.size());
	System.out.println(f.isEmpty());
	System.out.println(f.clone());
	f.remove(3);
	System.out.println(f);
	System.out.println(f.contains(null));

	
}
}
