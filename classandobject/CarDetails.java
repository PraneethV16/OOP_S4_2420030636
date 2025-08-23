package classandobject;

import java.util.Scanner;

class Car{
	String brand;
	int price;
	
	Car(){
		brand="RR";
		price=100000;
	}
	Car(String brand){
		this();
	}
	Car(String brand,int price){
		this();
	}
	void details() {
		System.out.println("Brand of Car: "+brand);
		System.out.println("price of Car: "+price);
	}
}
public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
      Car c=new Car();
      c.details();
      System.out.println("Enter brand");
      Car c1=new Car(sc.next());
      c1.details();
      System.out.println("Enter brand,price");
      Car c2=new Car(sc.next(),sc.nextInt());
      c2.details();
	}

}
