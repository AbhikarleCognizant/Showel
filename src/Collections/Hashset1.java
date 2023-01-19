package Collections;

import java.util.HashSet;

public class Hashset1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	HashSet p=new HashSet();
	p.add(500);
	p.add('i');
	p.add(null);
	p.add(null);
	p.add("son");
	System.out.println(p);
	System.out.println(p.size());
	System.out.println(p.contains(500));
	System.out.println(p.isEmpty());

}
}
