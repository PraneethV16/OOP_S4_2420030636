package arrays;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
  int n=sc.nextInt();
  System.out.println("Enter array");
 int arr[]=new int[n];
 for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
 }
for(int i=0;i<n;i++) {
      for(int j=i;j<n;j++) {
    	  if(arr[i]==arr[j]&&i!=j) {
    		 arr[j]=-1;
    	  }
    	  
      }
}
System.out.println("Unique array");
for(int i=0;i<n;i++){
	if(arr[i]>=0) {
		System.out.print(arr[i]+" ");
	}
}
	}

}
