package Abstraction;

public interface Car {
	
	//only final and static vars
	
	int wheels=4;
	
	//always define only abstract methods
	//no method body
	//only method declaration
	// we achieve 100% abstraction
	//cannot create object of abstract class
	public void start();
	public void stop();
	public void refuel();
	


}
