package date05262020;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	
		
		Map<Integer, String> data = new HashMap<Integer, String>();
				
				
				System.out.println(data.get(2));
				System.out.println(data.keySet());
				System.out.println(data.values());
				System.out.println(data.size());
				
				System.out.println(data);
				
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
				
				for (String i : hm.get("May2020")) {
					System.out.println(i);
				}
				
				System.out.println("************************");
				for (String outter: hm.keySet()) {
					
					for (String inner : hm.get(outter)) {
						System.out.println(inner);
					}
					
				}
				
				//create a hashmap that takes integer keys, and list of the things you like about java 
			   // add keys 1 - 5,  and add a list of things that you like in that degree about java
				
				
				
				
			}


		Map <Integer, ArrayList<String> > testing= new HashMap<Integer, ArrayList <String>>();
		Map<Integer, String>H= new HashMap<Integer, String>();
		  H.put(1, " i like Loop topic");
		  H.put(2, " i like if statment topic");
		  H.put(3, " i like java basic topic");
		  H.put(4, " i dont like dataStracture");
		  H.put(5, " i dont like Exception concept");
		 
		
		  System.out.println(H);

		  
		  Map <Integer, ArrayList<String> > testing= new HashMap<Integer, ArrayList <String>>(); 
			
		   
			ArrayList <String> feedback1= new ArrayList<String>(); 
			ArrayList <String> feedback2= new ArrayList<String>(); 
			ArrayList <String> feedback3= new ArrayList<String>(); 
			ArrayList <String> feedback4= new ArrayList<String>(); 
			ArrayList <String> feedback5= new ArrayList<String>(); 
			
			feedback1.add("Variable");
			feedback1.add("Class and Objects");
			
			feedback2.add("For Loop"); 
			feedback2.add("Selection"); 
			
			feedback3.add("Collection Framework"); 
			feedback3.add("Abstraction"); 
			
			feedback4.add("Polymorphism"); 
			feedback4.add("Encapsulation"); 
			
			feedback5.add("Inheritance"); 
			
			testing.put(1, feedback1); 
			testing.put(2, feedback2); 
			testing.put(3, feedback3); 
			testing.put(4, feedback4); 
			testing.put(5, feedback5); 
			
			
			System.out.println(testing);
