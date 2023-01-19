package Collections;
import java.util.TreeSet;

public class Treeset_3 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	TreeSet f =new TreeSet();
	f.add("Atul");
	f.add("Sampada");
	f.add("Bhavana");
	f.add("Abhi");
	//I need to print entire data inside the collection
			System.out.println(f);
			//check the size
			System.out.println(f.size());
			//check whether it is empty
			System.out.println(f.isEmpty());//false
			//contains or not
			System.out.println(f.contains("Abhi"));//true
}
}
