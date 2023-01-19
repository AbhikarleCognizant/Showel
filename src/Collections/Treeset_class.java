package Collections;
import java.util.TreeSet;
public class Treeset_class {
@SuppressWarnings({ "rawtypes", "unchecked", "unlikely-arg-type" })
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add("Atul");
	ts.add("Sampada");
	ts.add("Bhavana");
	ts.add("Abhi");
	//I need to print entire data inside the collection
			System.out.println(ts);
			//check the size
			System.out.println(ts.size());
			//check whether it is empty
			System.out.println(ts.isEmpty());//false
			//contains or not
			System.out.println(ts.contains("Abhi"));//true
			System.out.println(ts.clone());
			System.out.println(ts.equals("Atul"));
			System.out.println(ts.first());
			System.out.println(ts.last());
			
}
}
