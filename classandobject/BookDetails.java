package classandobject;

import java.util.Scanner;

class Book{
	String title;
	String author;
	int price;
	Book(String n,String w,int i){
		title =	n;
		author =w;
		price=i;
	}
	void details() {
		System.out.println("title : "+title);
		System.out.println("author: "+author);
		System.out.println("price : "+price);
	}
}

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Details:name,author,price ");
          Book b=new Book(sc.next(),sc.next(),sc.nextInt());
          b.details();
	}

}
