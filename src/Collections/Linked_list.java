package Collections;
import java.util.LinkedList;
public class Linked_list {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	l.add("Velocity");
	l.add(100);
	l.add('A');
	l.add(null);
	l.add(null);
	//print all the data
	System.out.println(l);
	//size
	System.out.println(l.size());//5
	//contains
	System.out.println(l.contains('A'));//true
	//get the data
	System.out.println(l.get(2));//
	System.out.println(l.getLast());
	System.out.println(l.isEmpty());
	//insertion(rightshift)
	l.add(2,'Z');
	System.out.println(l);//
	//left shift
	l.remove(2);
	System.out.println(l);

}
}
