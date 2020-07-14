package StringPractice;

public class MutationPractice {

	public static void main(String[] args) {
		
	//Mutation--you can not see it from codes what variables are mutable 
	// and which one is immutable.  The only way you can tell is by looking at the stack and heap 
	//memories.
	
	String x = "test";
	x = "test1";
	
	String [] y = {};
	
	System.out.println(y);///print out will show the location of memory.
	
	//for mutable object the change will be at the Same memory location, but for immutable object
	//will be at different location in the memory.  Mutable object will use less of the memory compare to 
	//immutable object.  String itself is an immutable object.  Array [] has a fixed size
	//therefore it is immutable.
	
	//String builder (sb) and String Buffer--these are mutable object of a string--it happens
	//at the same memory location.
	
	String st = "test";
	StringBuffer sb = new StringBuffer("test");
	
	
	
	for (int i = 0; i < 10; i++) {
		st = st.replace('t', 'T');  //since st is a string and it is immutable it has to refer to the new location
		//that is why we set it equal, but we don't have to set string builder (sb), which is mutable and 
		//we don't need it to sit to equal as below.
		sb.replace(0,1,"T");
		
		
		
		
		st += i+1;
		sb.append(i + 1);
		
		System.out.print("st " + st + "\t\t\t\t");
		System.out.println("sb " + sb);
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
