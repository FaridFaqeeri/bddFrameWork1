package date05172020;

public interface Car {

	static int t = 19;
	int numberofDoors
	
	public void ReduceSpeed(double speed);
	public void IncreaseSpeed(double speed);
	
	public default void depo() {
		System.out.println("default implementation of the method depo");
	}
	
}
