package controlstatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0) {
        	System.out.println("Number is "+a+" Even");
                   
        }
        else {
        	System.out.println("Number is Odd ");

        }
	}

}
