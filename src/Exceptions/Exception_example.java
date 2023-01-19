package Exceptions;

public class Exception_example {
@SuppressWarnings("unused")
public static void main(String[] args) {
	try {
		//risky code
		int a =100/0;
	}
	catch(ArithmeticException r){
		System.out.println("rest of code");
	}
}
}
