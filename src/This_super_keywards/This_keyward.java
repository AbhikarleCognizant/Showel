package This_super_keywards;

public class This_keyward {//BLC it doesn't have main method
	int a=45;//global var
	public void test() {
		int b=70;//local var
		System.out.println(b);//20
		//now I want to print global var from same class
		System.out.println(this.a);
	}
		

}
