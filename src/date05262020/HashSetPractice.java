package date05262020;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		
		String [] data = {"Test", "Data","Automation","Job","Test","Data"};
		//How to find a duplicate in array or data set collection?
		//One option is to use loop 
		
		outter: for (int i = 0; i < data.length; i++) {
			for(int j = i+1; j < data.length; j++) {
				if (data[i].contentEquals(data[j])) {
					System.out.println("duplicate " + data[i]);
					break outter;
		//The loops use big O(n^2), which is not efficient in regarding to using processing power
		//of computer because as n increases the use of processing power of computer increases exponentially.
		//The Set, which is a type of data collection, uses big O(n) that gives a straight line.
		//y-axis is processing power of CPU and x-axis is n. In regards to processing power of CPU
		//set is using less  CPU processing power than loops.
		//The Constant variable will give a horizontal line to x-axis which is the most efficient 
		//in the use of processing power of computer.
				}
			}
		}
		
		System.out.println("**************using set to find duplicates************* ");
		//using Upcasting:  Set is the parent.  Hashset is the child. In upcasting a parent class 
		//is declared first.  Then that declared parent class is initialize with the child class.
		//Set<String> temp = new HashSet<String>();
		//or you can do it as below
		//HashSet<String> temp2 = new HashSet<String>();
		
		Set<String> temp = new HashSet<String>();
		int count = 0;
		for (String i : data) {
			if(temp.add(i) == false) {//the return is Boolean 
				count++;
				if (count > 1) {
					System.out.println("the second duplicate found using set = " + i);
				break;
				}//How do you find the second duplicate?  We use count.
		//The colon is a shortcut for iterating over a collection. The variable on the left of the
		//colon is a temporary variable containing a single element from the collection on the
		//right. With each iteration through the loop, Java pulls the next element from the
		//collection and assigns it to the temporary variable.
			}
			
		}
		
		
	}

}
