package operators;
import java.util.*;
public class StudentPass {

	public static void main(String[] args) {
		// Check if a student passed both theory and practical exams using logical AND.
		// TODO Auto-generated method stub
      System.out.println("Enter marks for theory and Pratical");
      Scanner sc = new Scanner(System.in);
      int tm=sc.nextInt();
      int pm=sc.nextInt();
      if(tm >=30 && pm >=20) {
          System.out.println("Passed");
      }
      else {
          System.out.println("Fail");
      }
	}

}
