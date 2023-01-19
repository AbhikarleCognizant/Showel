package Hashtable;

import java.util.Hashtable;

public class hashtable {
public static void main(String[] args) {
	Hashtable<Integer, String> t=new Hashtable<Integer, String>();
	t.put(101, "Nikhil");
	t.put(102, "Ruchita");
	t.put(103, "Monish");
	t.put(104, "Pavan");
	System.out.println(t);
	t.remove(104);
	System.out.println(t);
	System.out.println(t.get(102));
	System.out.println(t.containsKey(105));
	
}
}
