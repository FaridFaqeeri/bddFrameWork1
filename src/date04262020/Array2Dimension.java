package date04262020;

public class Array2Dimension {

	public static void main(String[] args) {
	
		int [][] data2x2 = new int [2][2];
		
		data2x2 [0][0] = 1;
		data2x2 [0][1] = 2;
		data2x2 [1][0] = 3;
		data2x2 [1][1] = 4;
		
		//The other way of initializing an array
		
		int [][] data2x2theotherway = {{1,2}, {3,4}};
		
		System.out.println(data2x2[0][0] + " " + data2x2[0][1]);
		System.out.println(data2x2[1][0] + " " + data2x2[1][1]);
		
		// 10 15 20
		// 25 30 35
		
		int [][] data2x3 = new int [2][3];
		
		data2x3 [0][0] = 10;
		data2x3 [0][1] = 15;
		data2x3 [0][2] = 20;
		data2x3 [1][0] = 25;
		data2x3 [1][1] = 30;
		data2x3 [1][2] = 35;
		
		System.out.println(data2x3[0][0] + " " + data2x3[0][1] + " " + data2x3[0][2]);
		System.out.println(data2x3[1][0] + " " + data2x3[1][1] + " " + data2x3[1][2]);
		
		
		
		
		
		
		
		
		
		
		
		
		// Answer to Challenging Question
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.print(" ");
//			for (int k = 1; k <= 5-i+1 ; k++) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
//		}
//		
//		//teacher question
//		for (int out = 1; out <= 5; out++) {
//			for (int in = 1; in <= out; in++) {
//				System.out.print(in + " ");
//				
//			}
//			System.out.println();
//		
		//Using For Loop to Process 2-Dimensional Array
		
		for (int row = 0; row < data2x2.length; row++) {
			for (int col = 0; col < data2x2[row].length; col++) {
				System.out.print(data2x2[row][col] + " ");
			}	
			System.out.println();
		}
		
		}
		
	}

