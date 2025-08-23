package stringbuffer;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter both strings");
     String s1=sc.nextLine();
     String s2=sc.nextLine();
     System.out.println("Compare: " +s1==s2);
     System.out.println("Compare using equals method: "+(s1.equals(s2)));
     
	}

}
