package arrays;
import java.util.*;
public class SearchElement {

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
             System.out.println("Enter a element");
             int ele=sc.nextInt();
             boolean f=false;
             for(int i=0;i<n;i++) {
            	 if(arr[i]==ele) {
            		 f=true;
            		 break;
            	 }
             }
             if(f==true) {
            	 System.out.println("Found element: "+ele);
             }
             else {
            	 System.out.println("Not found element"+ele);
             }
	}

}
