package wrappclasses;

import java.util.Scanner;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in); 
		 System.out.println("Enter a number");
  int a=sc.nextInt();
  Integer i=a;
  System.out.println("Autoboxing: "+i);

	}
}
