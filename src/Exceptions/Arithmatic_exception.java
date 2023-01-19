package Exceptions;

public class Arithmatic_exception {
@SuppressWarnings("unused")
public static void main(String[] args) {
	try {
		int e= 45/0;
	}
	catch(Throwable r) {
		System.out.println("code is visible");
	}
}
}
