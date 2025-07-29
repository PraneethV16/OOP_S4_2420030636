package controlstatements;

import java.util.Scanner;

public class PrintUntilZero {
	public static void main(String[] agrs) {
		System.out.println("Enter a numbers: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n!=0) {
        	if(n!=0)
            	System.out.println(n);
          n=sc.nextInt();
          
        }
	}

}
