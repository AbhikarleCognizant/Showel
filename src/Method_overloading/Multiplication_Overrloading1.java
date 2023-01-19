package Method_overloading;

public class Multiplication_Overrloading1 {

	 public static void multiplication(int x,int y, int z) {
		 System.out.println(x*y*z);
	 }
	 public static void multiplication(int a,int b) {
		 System.out.println(a*b);
	 }
	 @SuppressWarnings("static-access")
	public static void main(String[] args) {
		 Multiplication_Overrloading1 m=new Multiplication_Overrloading1();
		 m.multiplication(8, 2, 2);
		 m.multiplication(100, 500);
	}
	}
