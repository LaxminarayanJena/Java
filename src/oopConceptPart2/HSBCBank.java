package oopConceptPart2;

public class HSBCBank implements USBank,BrazilBank{ //we are achieving multiple inheritance
	//is a relationship
 
	// if a class is implementing any interface then its mandatory to define /override all the methods of Interface
	
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc -credit");
	}

	
	public void debit() {
		System.out.println("hsbc -debit");
		
	}


	public void transferMoney() {
		System.out.println("hsbc -transferMoney");
		
	}
	
	public void educationloan()
	{
		System.out.println("hsbc -educationloan");
	}
	
	public void carLoan()
	{
		System.out.println("hsbc -carLoan");
	}


	//overriding from BrazilBank
	public void MutualFund() {
		System.out.println("hsbc -mutualfund");
		
	}

}
