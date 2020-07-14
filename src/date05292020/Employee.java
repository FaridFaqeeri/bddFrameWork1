package date05292020;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

//Create a class Employee
//Create three employee name, age, and department
//Create Constructor

		public class Employee {
			String name;
			int age;
			String department;
		
		Employee() {
			this.name = name;
			this.age = age;
			this.department = department;
		}
		
		Employee(String name,  int age,  String department) {
			this.name = name;
			this.age = age;
			this.department = department;
			}

//Create Employee object at least three of them, provide values in the constructor
//Store values of them into an ArrayList
//Traverse through the ArrayList
		public static void main (String [] args) {
		Employee emp1 = new Employee ("Mike", 34, "QA");
		Employee emp2 = new Employee ("Mustafa", 30, "BA");
		Employee emp3 = new Employee("Gopi", 25, "OPS");
		
			//	System.out.println(emp1.name + " " + emp1.age +" " + emp1.department);
			//	System.out.println(emp2.name + " " + emp2.age +" " + emp2.department);
			//	System.out.println(emp3.name + " " + emp3.age +" " + emp3.department);
			
				ArrayList<Employee> ar2 = new ArrayList<Employee>();
				
				ar2.add(emp1);
				ar2.add(emp2);
				ar2.add(emp3);
				
				
		
		
		
		}
		
	

}
