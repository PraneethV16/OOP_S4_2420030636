package stringbuffer;

import java.util.Scanner;

public class StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter 2 strings");
               String s=sc.nextLine();
               String s2=sc.nextLine();
               System.out.println("Print before change");
               System.out.println("hascode:"+s.hashCode());
               System.out.println("hascode:"+s2.hashCode());
               System.out.println("Print after change");
               s2="say hello";
               System.out.println("hascode:"+s.hashCode());
               System.out.println("hascode:"+s2.hashCode());
	}

}
