package Star_patterns;

public class starcharacter2 {
public static void main(String[] args) {
	int letter=65;
	for(int i=0;i<5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print((char)(letter+j)+" ");
		}
	System.out.println();
	}
}
}
