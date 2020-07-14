package date05262020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice2 {

	public static void main(String[] args) {
		
		Map<Integer, String> data = new HashMap<Integer, String>();

		data.put(1, "Jack");
		data.put(2, "Ben");
		
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.keySet());
		System.out.println(data.values());
		System.out.println(data.size());
		
		System.out.println(data);
		
		String [] x = {"b","a"};
		System.out.println(x);//this print the reference number to the location in the memory.
		
		Map<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		ArrayList<String> m2020 = new ArrayList<String>();
		m2020.add("Jack");
		m2020.add("Ben");
		m2020.add("Kevin");
		
		
		hm.put("Feb2020", new ArrayList<String>());
		hm.put("May2020", m2020);
		
		hm.get("Feb2020").add("first Student");
		hm.get("Feb2020").add("second Student");
		
		System.out.println(hm);
		
		System.out.println(hm.get("Feb2020"));
		System.out.println(hm.get("May2020"));
		
		//creating for each loop
		for (String i : hm.get("May2020")) {
			System.out.println(i);
		}
		
		
	}
	

}
