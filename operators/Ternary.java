package operators;
import java.util.*;
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter 2 numbers: ");
               Scanner sc = new Scanner(System.in);
               int a=sc.nextInt();
               int b=sc.nextInt();
            int g=  a>b?a:b; 
            System.out.println("Greater number is: "+g);
            
	}

}
