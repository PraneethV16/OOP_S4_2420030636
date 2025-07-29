package controlstatements;

import java.util.Scanner;

public class DisplayDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1) {
        	System.out.println("Given number is"+a+" Day is Sunday ");
        }
        else if(a==2) {
        	System.out.println("Given number is"+a+" Day is Monday ");
        }
        else if(a==3) {
        	System.out.println("Given number is"+a+" Day is Tuesday ");
        }
        else if(a==4) {
        	System.out.println("Given number is"+a+" Day is  Wednesday ");
        }
        else if(a==5) {
        	System.out.println("Given number is"+a+" Day is Thursday");
        }
        else if(a==6) {
        	System.out.println("Given number is"+a+" Day is Friday ");
        }
        else if(a==7) {
        	System.out.println("Given number is"+a+" Day is Saturday ");
        }
	}

}
