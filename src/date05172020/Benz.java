package date05172020;

public class Benz implements Car {

	
	double speed = 10;
	double speedChangeFactor = 0.3;
	
	@Override
	public void ReduceSpeed(double speed) {
		this.speed -= speed * speedChangeFactor;
		
	}

	@Override
	public void IncreaseSpeed(double speed) {
		// TODO Auto-generated method stub
		
	}

}
