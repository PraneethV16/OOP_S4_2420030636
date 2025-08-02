package arrays;
import java.util.*;
public class ReadAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter a array");
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("Array:");
      System.out.println(Arrays.toString(arr));
	}

}
