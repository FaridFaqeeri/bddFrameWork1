package date05122020;

public class BreakAndContinue {

	public static void main(String[] args) {
	
		//break, it is use with switch when you want to end the case you have to use the key word
		//break.  Break is also use in loops.  It would end the loop.
		
		for (int j = 0; j <10; j++) {
			if (j==7) {
				break; }
			else { System.out.println(j); }
			}
		
		System.out.println("this is after the loop ended");
		
		//continue, the keyword will skip that iteration of the loop
		
		for (int j = 0; j <10; j++) {
			if (j==7) {
				continue; }
			else { System.out.println(j); }
			}
		
		System.out.println("Print this out to make continue happy for its action");
		
		
		//I have an array of strings {"test", "automation", "job", "test", "automation2", "job2"
		//"test2"}  is there any duplicate?
		
		String data [] = {"automation","test", "job", "test", "automation2", "test", "job2","test2"};
		
		//Create a for loop and go through the length of the array
		//if the current iteration value is equal to k then break
		
	outter:	for (int k = 0; k<data.length; k++) {
		inner:	for (int m = k + 1; m < data.length; m++) {
				if (data[k].equals(data[m])) {
					// there is a duplicate
					System.out.println("there is a duplicate in the array");
					System.out.println("value = " + data[k]);
					System.out.println("indexs = " + k + " " + m);
					break outter;
					
					
					
					
				}
			}
		}
		//This is the other way (for each loop) of doing the same problem
		int count = 0;
		outter: for (String outter : data) {
				for (String inner : data) {
					if (outter.equals(inner)) {
						count++;
						if (count > 1) {
							System.out.println(inner + " value of the array is duplicate");
							break outter;
						}
					}
				count = 0;
				}
		
			//How to find the efficiency of a program you use big O notation--O(n)square.
			//n is use for the number of the runs.  If it is n square then it is nested loop.  
			//if it is just n then it is just loop
				
				
		for (int i = 0; i < 20; ++i) {
			if (i > 5 && i < 10) {
				continue;
			} else if ( i > 21 || i == 4) {
					break;
			} else {
			System.out.println(i + 1);
			}
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		// break, is use with switch
		//break, we can use the keyword in loops.  It would end the loop
//		for (int i = 0; i < 10; i++) {
//			if (i == 5) {
//				continue;
				
//			} else {
//				System.out.println(i);
			}
//		}
		
//		System.out.println("this is after the loop ended");
		
		
		
			// i have an array of strings {"test", "automation", "job", "test", "automation2", "jobs", "test2"
			// is there a duplicate
		
		String data [] = {"test", "automation", "job","test", "automation2", "job2", "test2"};
		//create a for loop and go through the length of the array
		//if the current iteration value is equal to i then break
		
//		outter: for (int i = 0; i<data.length; i++) {
//			inner: for (int j = i+1; j < data.length; j++) {
//				if (data[i].equals(data[j])) {
					//there is a duplicate
//					System.out.println("there is a duplicate in the array");
//					System.out.println("value = " + data[i]);
//					System.out.println("indexs = " + i + " " + j);
//					break outter;
					
//				}
//			}
//		
		
//		}
//		int count = 0;
//		outter: for (String inner : data) {
//			for (String inner1 : data) {
				
			}
//		}
//	}

//}
