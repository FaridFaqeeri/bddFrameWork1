package date05262020;

import java.util.HashMap;
import java.util.Map;

public class InClassAssignment {

	public static void main(String[] args) {
		
		//Name: Farid Faqeeri
		//create a hashmap that takes integer keys, and list of the things you like about java 
		// add keys 1 - 5,  and add a list of things that you like in that degree about java

		Map <Integer, String> Tasla = new HashMap<Integer, String>();
	
		Tasla.put(1, "palindrome");
		Tasla.put(2, "polymorphism");
		Tasla.put(3, "forEachLoop");
		Tasla.put(4, "whileLoop");
		Tasla.put(5, "encapsulation");
		
		System.out.println(Tasla);
	}

}
