package operators;
import java.util.*;
public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Demonstrate increment and decrement operators on a variable7.
		System.out.println("Enter a number: ");
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           System.out.println("Inc "+(++a));
           System.out.println("Dec " +(--a));
	}

}
