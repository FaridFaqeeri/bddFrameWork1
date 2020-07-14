package date05072020;

public class Mammal extends Animal {
	
	public Mammal() {
		super();
		System.out.println("Mammal constructor ran");
	}

	
	//Overriding Methods
	
	public String getName() {
		return "mammal class getname method " + super.getName();
	}
	
	public String giveMeTheName() {
		return super.getName();
	}
}
