package String_class;

public class String_methods2 {
public static void main(String[] args) {
	String s1= "carward";
	String s2= "CARWARD";
	String s3= "ward";
	//length()
			System.out.println(s1.length());//7
			//toUppercase()
			System.out.println(s1.toUpperCase());//CARWARD
			//toLowercase()
			System.out.println(s2.toLowerCase());//carward
			//equals()
			System.out.println(s1.equals(s2));//false
			//equalignorecase()
			System.out.println(s1.equalsIgnoreCase(s2));//true
			//contains()
			System.out.println(s1.contains(s3));//true
			System.out.println(s2.contains(s3));//false
			//charAt()
			System.out.println(s1.charAt(6));//d
			//indexof()
			System.out.println(s1.indexOf('d'));//6
			//concat()
			System.out.println(s1.concat(s3));//carwardward
			//substring()
}
}
