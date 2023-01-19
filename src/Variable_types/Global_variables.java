package Variable_types;

public class Global_variables {
	static int l=50;//static global variable
	 int i=20;// non-static global variable 
public static void main(String[] args) {
	System.out.println(l);
	Global_variables g=new Global_variables();//object creation
	System.out.println(g.i);
}

}
