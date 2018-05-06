package Abstraction;

public abstract class Bank {
	
	int amt=100;
	final int rate=10;
	static int loanRate=5;
	//one method should be there which is abstract in nature
	//partial abstraction
	//hiding the implementation logic-abstraction
	//abstract class can have abs method and non abs method
	//abstarct class are faster because of traversing point of view
	
	public abstract void loan();//abstract method- no method body

		public void credit()
		{
			System.out.println("bank-credit");
		}
		
		public void debit() // non abstract method
		{
			System.out.println("bank-debit");
		}
	}


