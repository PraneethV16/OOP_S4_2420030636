package classandobject;

import java.util.Scanner;

class Box{
	int length;
	int width;
	int heigth;
	Box(){
		length=1;
		width=1;
		heigth=1;
	}
	Box(int length,int width){
		this();
		System.out.println("length: "+length+" width: "+width+" heigth: "+heigth);
	}
	Box(int length,int width,int heigth){
		this();
		System.out.println("length: "+length+" width: "+width+" heigth: "+heigth);
	}
	void details(){
		System.out.println("length: "+length+" width: "+width+" heigth: "+heigth);
}
	
}
public class BoxDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Box b=new Box();
        b.details();
        System.out.println("length,width");
        Box b1=new Box(sc.nextInt(),sc.nextInt());
        System.out.println("length,width,heigth");
        Box b2=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
	}

}
