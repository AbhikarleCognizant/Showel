package Collections;

import java.util.TreeSet;

public class Treeset2 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	TreeSet r=new TreeSet();
	r.add(10);
	r.add(200);
	r.add(1000);
	r.add(750);
	r.add(500);
	
	//
	System.out.println(r);
	System.out.println(r.first());
	System.out.println(r.last());
	System.out.println(r.isEmpty());
	System.out.println(r.clone());
	System.out.println(r.contains(1000));
	System.out.println(r.size());

}
}
