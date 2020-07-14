package date04262020;

public class ArrayPractice01 {

	public static void main(String[] args) {
		
		// create a single dimension array of int. have the values 10, 15, 18, 25, 89
		// run a loop and print all.
		// if you like challenge, try to get the average of the numbers in the array
		
		int[] data = new int[5];
		
		data[0] = 10;
		data[1] = 15;
		data[2] = 18;
		data[3] = 25;
		data[4] = 89;
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}	
		int average = (10+15+18+25+89)/5;
		System.out.println("Average : " + average);
			
		

	}

}
