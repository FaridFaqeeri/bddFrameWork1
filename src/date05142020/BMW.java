package date05142020;

public class BMW extends Car{

	private int numberOfCylenders;
    private String engineModel;
    
    
    public BMW(String name, String model, int year, int numberOfDoors, int numberOfCylenders, String engineModel) {
        super(name, model, year, numberOfDoors);
        this.numberOfCylenders = numberOfCylenders;
        this.engineModel = engineModel;
    }
    
    
    public String getModel() {
        return super.getModel() + " *The model for BMW may be a not available. Check with your agent!";

	
	
	
	
	
	
	
}
