package date05142020;

public class Runner {

	public static void main(String[] args) {
		
		
		Car x = new BMW("car", "new", 2020, 4, 6, "Good");
        
	    Car x2 = new BMW(); //up casting  
	        
	    BMW y = (BMW) x2; //down casting

	   System.out.println(y.getModel());
	    
	    Car [] arrayOfCars = new Car[10];
	    arrayOfCars[0] = new BMW();
	    
	    Object [] data = new Object[10];
	    
	    data[0] = "String";
	    data[1] = 10;
	    data[2] = 10.25;
	    data[3] = true;
	    data[4] = new Car();
	    data[5] = new BMW();
	    
	    String xxx = "";
	    
	    
	}



}


