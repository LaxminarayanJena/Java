package Abstraction;

public class TestBank {
	
	public static void main(String[] args)
	{
		HDFCBank hb= new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan(); //-overrriden method
		hb.funds();
		
		Bank b= new HDFCBank();
		b.loan();
		b.debit();
		b.credit();
		//b.funds();-error
		
		
		//Bank b1= new Bank();- cannot create object of abstract class
		
	}

}
