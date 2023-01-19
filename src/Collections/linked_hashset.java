package Collections;
import java.util.LinkedHashSet;
public class linked_hashset {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("abc");
	lhs.add(100);
	lhs.add('A');
	lhs.add(null);
	//print entire data
	//System.out.println(lhs);
	
	//is empty
	System.out.println(lhs.isEmpty());//false
	
	//iscontain()
	System.out.println(lhs.contains(300));//false
	
	//size()
	System.out.println(lhs.size());//4
	

}
}
