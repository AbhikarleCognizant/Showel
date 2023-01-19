package conditional_Statements;

public class If_else_ladder {
public static void main(String[] args) {
	int marks=10;
	if(marks>=85) {
		System.out.println("pass with distinction");
	}
	else if(marks>=60) {
		System.out.println("pass with 1 st class");
	}
	else if(marks>=45) {
		System.out.println("pass with 2nd class");
	}
	else if(marks>=35) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}

}