package classandobject;
import java.util.*;
class Student{
	int age ;
	String name;
	int rollno;
	int marks;
	void printD() {
		System.out.println("Name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("age: "+age);
		System.out.println("marks: "+marks);
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no of students");
//		int n=sc.nextInt();
//              Student []s=new Student[n];
//              for(int i=0;i<n;i++) {
//            	  System.out.println("Enter name: ");
//            	  s[i].name=sc.next();
//            	  System.out.println("Enter roll no: ");
//            	  s[i].rollno=sc.nextInt();
//            	  System.out.println("Enter age: ");
//            	  s[i].age=sc.nextInt();
//            	  System.out.println("Enter marks: ");
//            	  s[i].marks=sc.nextInt();
//              }
//              for(int i=0;i<n;i++) {
//            	  System.out.println("Name of student "+i+ " is "+s[i].name);
//            	  System.out.println("Roll no of Student "+i+" is "+s[i].rollno);
//            	  System.out.println("age of student "+i+" is "+s[i].age);
//            	  System.out.println("marks of Student "+i+" is "+s[i].marks);
//              }
		Student s=new Student();
		System.out.println("Enter name: ");
		s.name=sc.next();
		System.out.println("Enter roll no: ");
		s.rollno=sc.nextInt();
		  System.out.println("Enter age: ");
		s.age=sc.nextInt();
		  System.out.println("Enter marks: ");
		s.marks=sc.nextInt();
		System.out.println("Student 1 details:");
		s.printD();
		Student s1=new Student();
		System.out.println("Enter name2: ");
		s1.name=sc.next();
		System.out.println("Enter roll no2: ");
		s1.rollno=sc.nextInt();
		  System.out.println("Enter age2: ");
		s1.age=sc.nextInt();
		  System.out.println("Enter marks2: ");
		s1.marks=sc.nextInt();
		System.out.println("Student 2 details:");
		s1.printD();
		Student s2=new Student();
		System.out.println("Enter name 3: ");
		s2.name=sc.next();
		System.out.println("Enter roll no 3: ");
		s2.rollno=sc.nextInt();
		  System.out.println("Enter age 3: ");
		s2.age=sc.nextInt();
		  System.out.println("Enter marks 3: ");
		s2.marks=sc.nextInt();
		System.out.println("Student 3 details:");
		s2.printD();
              
	}

}
