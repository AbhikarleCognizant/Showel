package Arrays;

public class Reverse$array {
public static void main(String[] args) {
	char array[]= {'P','Q','S','R'};
	System.out.println("original array:");
	for(int i=0;i<array.length;i++)
		System.out.println(array[i]+" ");
	System.out.println("reverse array:");
	for(int i=array.length-1;i>=0;i--)
		System.out.println(array[i]+" ");
}
}
