package controlstatements;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a marks: ");
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        if(m>75) {
        	System.out.println("Grade is A ");
        }
        else if (m<=75 & m>55){
        	System.out.println("Grade is B ");
        }
        else if(m<=55 & m>30 ) {
        	System.out.println("Grade is C ");
        }
        else {
        	System.out.println("Grade is F");
        }
	}

}
