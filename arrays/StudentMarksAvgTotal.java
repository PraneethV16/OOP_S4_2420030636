package arrays;
import java.util.*;
public class StudentMarksAvgTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number of subjects");
         int n=sc.nextInt();
         System.out.println("Enter a array");
         int mark[]=new int[n];
         for(int i=0;i<n;i++) {
        	mark[i]=sc.nextInt();
         }
         float avg=0;
         int total=0;
         for(int i=0;i<n;i++) {
        	 System.out.println("Subject "+(i+1)+" "+mark[i]);
        	 avg+=mark[i];
        	 total+=mark[i];
         }
         avg=avg/n;
         System.out.println("Average marks: "+avg);
         System.out.println("Total marks: "+total);
         
	}

}
