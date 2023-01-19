package Collections;

import java.util.TreeSet;

public class Treeset23 {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	TreeSet c=new TreeSet();
	c.add("dude");
	c.add("guddi");
	c.add("soo");
	c.add("euuu");
	
	System.out.println(c);
	System.out.println(c.isEmpty());
	System.out.println(c.size());
	System.out.println(c.clone());
	System.out.println(c.ceiling("euuu"));
	System.out.println(c.contains("noo"));
	System.out.println(c.first());
	System.out.println(c.last());

}
}
