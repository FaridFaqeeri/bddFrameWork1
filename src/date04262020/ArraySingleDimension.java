package date04262020;

public class ArraySingleDimension {

	public static void main(String[] args) {
		
		//declare an array
		int numbers[];
		
		//initialization of the array
		//the size of the array starts from 1
		numbers = new int[5];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		int indexNumber = 0;
		
		System.out.println(numbers[indexNumber++]);  //0
		System.out.println(numbers[indexNumber++]);  //1
		System.out.println(numbers[indexNumber++]);  //2
		System.out.println(numbers[indexNumber++]);  //3
		System.out.println(numbers[indexNumber]); //4
		
		System.out.println("the index number "+ indexNumber);
		
		System.out.println("printing the array using a loop _________________");
		System.out.println("size of the array using length " + numbers.length);
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			
		
		}
	//__________________________________________________________________
		
		System.out.println("___________________ using special initialization ____________________");
		
		int [] set2 = { 10, 15, 20, 30 };
		System.out.println("size of the array set2 = " + set2.length);
		System.out.println("elements of array set2: " + set2.length);
		for (int i = 0; i< set2.length; i++) {
			System.out.println((i +1) + ". " + set2[i]);}
			
		
		
		    System.out.println("_______________creating an array of objects______________");
		    
		    
		    String [] names = {"Jack", "Kim", "Ash", "Mash", "Pash", "Dash"};
		    
		    System.out.println("size of the array names = " + names.length);
		    System.out.println("elements of array names: ");
		    for (int i = 0; i<names.length; i++) {
		    	System.out.println((i+1) + "." + names[i]);
		    }
		}
	
	
		

	private static char[] numbers(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
