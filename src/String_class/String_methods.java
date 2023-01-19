package String_class;

public class String_methods {
public static void main(String[] args) {
	String s1= "excellent";
	String s2= "EXCELLENT";
	String s3= "lent";
	//length()
			System.out.println(s1.length());//9
			//toUppercase()
			System.out.println(s1.toUpperCase());//EXCELLENT
			//toLowercase()
			System.out.println(s2.toLowerCase());//excellent
			//equals()
			System.out.println(s1.equals(s2));//false
			//equalignorecase()
			System.out.println(s1.equalsIgnoreCase(s2));//true
			//contains()
			System.out.println(s1.contains(s3));//true
			System.out.println(s2.contains(s3));//false
			//charAt()
			System.out.println(s1.charAt(7));//n
			//indexof()
			System.out.println(s1.indexOf('t'));//8
			//concat()
			System.out.println(s1.concat(s3));//excellentlent
			//substring()
			System.out.println(s1.substring(4));//llent
			//startswith()
			System.out.println(s1.startsWith("ex"));//true
			//endswith()
			System.out.println(s1.endsWith("nt"));//true
		}
			
}

