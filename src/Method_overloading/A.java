package Method_overloading;

public class A {
		public void addition(int a, int b){
		System.out.println(a+b);
		}
		public void addition(int a, int b,int c){
		System.out.println(a+b+c);
		}
		public static void main(String[] args){
		A o=new A();
		o.addition(10,20);
		o.addition(30,40,50);
		}
}
