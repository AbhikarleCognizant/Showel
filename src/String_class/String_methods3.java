package String_class;

public class String_methods3 {
public static void main(String[] args) {
	String s1= "dog";
	String s2= "DOG";
	String s3= "house";
	System.out.println(s1.length());//3
	//toUppercase()
	System.out.println(s1.toUpperCase());//DOG
	//toLowercase()
	System.out.println(s2.toLowerCase());//dog
	//equals()
	System.out.println(s1.equals(s2));//false
	//equalignorecase()
	System.out.println(s1.equalsIgnoreCase(s2));//true
	//charAt()
	System.out.println(s1.charAt(2));//g
	//indexof()
	System.out.println(s1.indexOf('g'));//2
	//concat()
	System.out.println(s1.concat(s3));//doghouse
}
}
