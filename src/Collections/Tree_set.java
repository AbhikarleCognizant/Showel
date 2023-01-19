package Collections;
import java.util.TreeSet;

public class Tree_set {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	TreeSet y=new TreeSet();
	y.add(10);
	y.add(50);
	y.add(90);
	y.add(30);
	//I need to print entire data inside the collection
	System.out.println(y);
	//check the size
	System.out.println(y.size());
	//check whether it is empty
	System.out.println(y.isEmpty());//false
	//contains or not
	System.out.println(y.contains(50));//true
}
}
