package prgm1;

public class Main {
	//  Main class of the program
		public static void main(String[] args) {

	//  Create two instances of the Employee class
		    Employee a1 = new Employee("Dhanu", 111, 50000);  
		    Employee a2 = new Employee("Shree", 112, 55000);  

    //  Display initial data of the Employee
		    System.out.println("Initial Employee Details:");  
		    a1.displayDetails();  
		    a2.displayDetails();  

   //  Increase the salary of Employees
		    a1.increaseSalary(20);  
		    a2.increaseSalary(15);  

  //  Display updated details of the Employees
		    System.out.println("Updated and modified Employee details:");  
		    a1.displayDetails();  
		    a2.displayDetails();  
		}


	}


