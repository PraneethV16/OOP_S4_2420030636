package stringbuffer;
import java.util.*;
public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
            StringBuffer sb= new StringBuffer("hello");            
            System.out.println("Sting before append: "+sb);
            sb=sb.append("sb");
           System.out.println("Sting after append: "+sb);
            
	}

}
