package operators;
import java.util.*;
public class CompareTwoNumbers {

	public static void main(String[] args) {
		//Compare two integers and display which one is greater or if they are equal.
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
        	System.out.println("a is greater "+a);
        }
        else if(a<b){
        	System.out.println("b is greater "+b);
        }
        else {
        	System.out.println("Both are equal");
        }
	}

}
