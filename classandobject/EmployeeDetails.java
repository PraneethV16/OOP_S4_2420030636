package classandobject;

import java.util.Scanner;

class Employee{
	int empid;
	String empname;
	int salary;
	Employee(){
		empname="james";
		empid=12;
		salary=1000;
	}
	
   Employee(int empid,String empname,int salary){
	   this();
	   System.out.println("name: "+empname);
	   System.out.println("id: "+empid);
	   System.out.println("Salary"+salary);
   }
   }


public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id ,, name ,, Salary");
          Employee e=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
          
	}

}
