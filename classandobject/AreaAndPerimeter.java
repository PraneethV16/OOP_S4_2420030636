package classandobject;

import java.util.Scanner;

class Rectangle{
	int length;
	int breadth;
	void area() {
		System.out.println("area:"+(length*breadth));
	}
	void perimeter() {
		System.out.println("perimeter:"+(2*(length+breadth)));
	}
}
public class AreaAndPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Rectangle r=new Rectangle();
        System.out.println("Enter length");
        r.length=sc.nextInt();
        System.out.println("Enter breadth");
        r.breadth=sc.nextInt();
        r.area();
       r.perimeter();
	}

}
