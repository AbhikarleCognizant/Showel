package String_class;

public class String_methods1 {
public static void main(String[] args) {
	String s1= "mobile";
	String s2= "MOBILE";
	String s3= "le";
	//length()
			System.out.println(s1.length());//6
			//toUppercase()
			System.out.println(s1.toUpperCase());//MOBILE
			//toLowercase()
			System.out.println(s2.toLowerCase());//mobile
			//equals()
			System.out.println(s1.equals(s2));//false
			//equalignorecase()
			System.out.println(s1.equalsIgnoreCase(s2));//true
			//contains()
			System.out.println(s1.contains(s3));//true
			System.out.println(s2.contains(s3));//false
			//charAt()
			System.out.println(s1.charAt(5));//e
			//indexof()
			System.out.println(s1.indexOf('e'));//5
			//concat()
			System.out.println(s1.concat(s3));//mobilele
			//substring()
			System.out.println(s1.substring(4));//le
			//startswith()
			System.out.println(s1.startsWith("mo"));//true
			//endswith()
			System.out.println(s1.endsWith("le"));//true
}
}
