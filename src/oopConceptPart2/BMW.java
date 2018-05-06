package oopConceptPart2;

public class BMW extends Car { //has a relationship
	
	//when same method is present in parent class as well as child 
	//class with the same name and same arguments..it is called method overriding
	public void start() //overriden method
	{
		System.out.println("bmw--start");
	}
	
	public void theftSafety()
	{
		System.out.println("bmw safety");
	}

}
