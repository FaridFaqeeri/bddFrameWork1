package date05122020;

public class Student {

	
	//Keyword Static--it only belongs to class level--not to object level variable.
	//Object variables are Dynamic variables because they can change.
	
		public String name;
		public int age;
		
		public static int numberOfStudents = 0;//numberOfStudents is a static variable
		
		public Student () {//this is a constructor
			this.name = "";
			this.age = 0;
			numberOfStudents++;
		}
	//	public double getName() {//this is a get name method. Why can not be static method?  Because 
		//	return name;
		//the method get name is belong to object not to the class.  Static is only use for the class.
		//The other reason is that name can not be static because it can change.  Static goes to different 
		//location in the memory.
			
			
			//Use of static in the customize method
			
			public static double remainderOfDivision(double x, double y) {
				return x % y;
			}	
	}
		
		
		





