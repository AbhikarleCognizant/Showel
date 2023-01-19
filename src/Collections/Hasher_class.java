package Collections;
 import java.util.HashSet;
public class Hasher_class {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("Pranav");
	hs.add(200);
	hs.add('A');
	hs.add(null);
	hs.add(null);
	hs.add("Pranav");
	//print entire data
	System.out.println(hs);
	
	//is empty
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(200));
	System.out.println(hs.size());
	hs.remove(3);
	System.out.println(hs);

	

}
}
