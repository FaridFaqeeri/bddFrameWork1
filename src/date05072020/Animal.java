package date05072020;

public class Animal {
	
	
	private String name;
	
	public Animal() {
		name = "";
		System.out.println("Animal constructor ran");
	}
	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
