package operators;

import java.util.Scanner;

public class RightOrLeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		System.out.println("Right shift by 2: "+(a>>2));
		System.out.println("Left shift by 2: "+(2<<a));
	}

}
