package wrappclasses;

import java.util.Scanner;

public class AllDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n=sc.nextInt();
		 System.out.println("Enter a charcater: ");
		 char c=sc.next().charAt(0);
		 System.out.println("Enter a decimal number: ");
		 float f=sc.nextFloat();
		 System.out.println("Enter a double number: ");
		 double d=sc.nextDouble();
		 System.out.println("Enter a boolean: ");
		 boolean b=sc.nextBoolean();
		 System.out.println("Enter a Long number");
		 long l=sc.nextLong();
		 System.out.println("integer: "+n);
		 System.out.println("character: "+c);
		 System.out.println("float: "+f);
		 System.out.println("double: "+d);
		 System.out.println("boolean: "+b);
		 System.out.println("Long: "+l);
	}
}
