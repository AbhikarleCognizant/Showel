package Method_overloading;

public class Dog {
public void bark() {
	System.out.println("wow");
}
public void bark(int num) {
	for(int i=0; i<num; i++) {
		System.out.println("wow");
	}
}
}
