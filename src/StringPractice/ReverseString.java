package StringPractice;

public class ReverseString {

	public static void main(String[] args) {
	
		String testData = "The Brown Fox jumped on the desk";
		
		StringBuilder sB = new StringBuilder(testData);
		
		System.out.println(sB);
		
		sB.append(" or maybe not");
		
		System.out.println(sB.reverse());
		System.out.println(sB.reverse());
		
		
		
		
	}

}
