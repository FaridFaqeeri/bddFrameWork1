package date05122020;

public class FinalModifier {

	public static void main(String[] args) {
	
		//constant--to make a variable that no one can change it -- for that we use the word final
		//after the access modifier. The word final is also called Optional Specifiers.
		
		int x = 10;//this is variable which means its value is changeable as shown below
		
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		
		final int y = 5;//here by using the word final the variable become constant which means its 
		//value is not changeable and it is equal to 5.  Three ways of using the word final as below
		// 1)we can use final variable which will become constant, 2) final method this means the method
		//can not be override, 3) final class--means no one can inherit from this class. 
		System.out.println(y);
		System.out.println(y);
		
		 public final class BankAccount //example final class
		{
			private final String accountOwner;//example of constant
			private int accountBalance;
			
		}
		
		 public final void deposit (int amount) {//example of final method
		 	}
		 //Keyword Static--it only belongs to class level--not to object level variable.
		 //Object variables are Dynamic variables because they can change.
}
