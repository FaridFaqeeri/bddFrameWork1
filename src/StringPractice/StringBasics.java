package StringPractice;

public class StringBasics {

	public static void main(String[] args) {
	
	//Two ways of initializing String:
	//Any thing that goes inside the double quote is called Literal Value
	//String st2 will create new object in the Heep Memory, but String st1 will go to String pool of the heep memory without creating a new object.
	String st1 = "test  ";
	String st2 = new String("test2");
	
	// == double equals checking the reference values in the Stack Memory
	// .equal (dot equal) checking the value on the Heep Memory
	
	//Method Length():
	//Method length() will return the size of the string/number of characters
	System.out.println(st1.length());
	
	//charAt() method: will return a character at the specified index
	System.out.println(st1.charAt(2));
	
	//indexOf() method: will return the index number of the first occurrence of the character
	System.out.println(st1.indexOf('e'));
	System.out.println(st1.indexOf('e', 2));
	System.out.println(st1.indexOf("es", 0));
	
	//substring method(): will return a specified section of the string
	System.out.println(st1.substring(1));
	System.out.println(st1.substring(0, 3));
	//So I want you to return "es" from string st1 without any hard coded value except "es"
	System.out.println(st1.substring(1, 3));  //this is hard coded value of string "es"
	System.out.println(st1.charAt(1));
	String st3 = "Elephante";
	//so I want you to return "ant" from string st3 without any hard coded value
	//except "ant"
	System.out.println(st3.substring(st3.indexOf("ant"), st3.indexOf("ant") + "ant".length()));
	System.out.println(st3.substring(5, 8));
	System.out.println(st3.indexOf("ant"));// This will give index of 5
	System.out.println("ant".length());  //This will give you number of character = 3
	
	//toLowercase() method: change the whole characters of string to lower case
	System.out.println(st3.toLowerCase());
	//toUpperCase() method: change the whole characters of string to Upper case 
	System.out.println(st3.toUpperCase());
	
	System.out.println(st3.substring(st3.indexOf("ant"), st3.indexOf("ant") + "ant".length()).toUpperCase());
	
	//equals() method: compare two strings while considering the case of characters
	System.out.println(st1.equals(st2));
	
	//equalsIgnoreCase() method:compare two strings while Not considering the case of characters
	System.out.println(st1.equalsIgnoreCase(st2));
	
	//startsWith() method: will check to see if the string is starting with the specified prefix 
	
	System.out.println(st3.startsWith("E"));
	
	//endsWith() method: will check to see if the string is ending with the specified suffix 
	System.out.println(st3.endsWith("e"));
	
	//contains() method:  check to see if a string has a specified substring or char
	System.out.println(st3.contains("ant"));
	
	//replace() method:  will take a char or a String and if it finds it in the actual String,
	//then it will replace it to the specified String 
	System.out.println(st3.replace('E', 'A'));
	
	//method chaining(): performing two or more methods back to back
	System.out.println(st3.substring(st3.indexOf("ant"), st3.indexOf("ant") + "ant".length()).toUpperCase());
	
	//trim removes the spaces before and after the string
	System.out.println(st1);
	
	System.out.println(st1.trim());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
