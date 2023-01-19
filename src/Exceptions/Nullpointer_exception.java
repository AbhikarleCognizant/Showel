package Exceptions;

public class Nullpointer_exception {
	int i=10;
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Nullpointer_exception ref=null;
		System.out.println(ref.i);
	}

}
