package wrappclasses;

import java.util.*;

public class AutoUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		 System.out.println("Enter a number");
		  int n=sc.nextInt();
   Integer i = new Integer(n);
   int a=i.intValue();
   System.out.println("Autounboxing: "+a);
   
	}

}
