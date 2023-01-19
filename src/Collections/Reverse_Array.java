package Collections;
import java.util.*;
public class Reverse_Array {
public static void main(String[] args) {
	
	Integer array[]= {1,2,3,4,5};
	System.out.println("Given array: "+ Arrays.toString(array));
	
	Collections.reverse(Arrays.asList(array));
	
	 System.out.println("Reversed Array: " + Arrays.toString(array)); 
} 
	
}
