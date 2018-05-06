package oopConceptPart2;

public interface USBank {
	
	int min_Bal=100;
	public void credit();
	public void debit();
	public void transferMoney();
	//only method declaration
	//no methodBody- only method Prototype
	//in interface we can declare the variables, vars are by default static
	//vars value will not be changed..its final/constant in nature
	//no static method in interface
	//no main method
	//interface are abstract in nature. we cannot create object of interface
	

}
