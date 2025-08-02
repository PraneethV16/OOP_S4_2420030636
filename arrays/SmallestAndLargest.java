package arrays;
import java.util.*;
public class SmallestAndLargest {

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
int max=arr[0];
int min=arr[0];
for(int i=0;i<n;i++) {
	if(max<arr[i]) {
		max=arr[i];
	}
	if(min>arr[i]) {
		min=arr[i];
	}
}
System.out.println("Largest number of array: "+max);
System.out.println("Smallest number of array: "+min);
	}

}
