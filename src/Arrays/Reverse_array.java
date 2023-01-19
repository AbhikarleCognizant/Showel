package Arrays;
public class Reverse_array {
public static void main(String[] args) {
	Integer []array= {1,2,3,4,5};
	System.out.println("Original Array:");
    for(int i=0;i<array.length;i++)
         System.out.print(array[i]+ " ");
     
      System.out.println();
     
    //print array starting from last element
    System.out.println("Original Array printed in reverse order:");
         for(int i=array.length-1;i>=0;i--)
         System.out.print(array[i]+" " );
    
  
	
}
}