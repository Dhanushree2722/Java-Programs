package prgm1;

public class Employee {
		String name;     // Name of the Employee
		int id;          // id of the Employee 
		double salary;   // Salary of the Employee

		Employee(String name, int id, double salary) {  
	//Variable declaration with initialization  
		    this.name = name;  
		    this.id = id;  
		    this.salary = salary;  
		}  

	//Defining a method to displayDetails 
		void displayDetails() {  
		    System.out.println("ID of the Employee: " + id);  
		    System.out.println("Name of the Employee: " + name);  
		    System.out.println("Salary of the Employee: ₹" + salary);  
		    System.out.println("*******************************************");  
		}  

		//  Method to increase the salary by given percentage
		void increaseSalary(double percentage) {  
		    double incr = (salary * percentage) / 100;  
		    salary = salary + incr;  
		    System.out.println(name + "'s salary of the Emloyee is increased by " + percentage + "%");  
		}
		
}

