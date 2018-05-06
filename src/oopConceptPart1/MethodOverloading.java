package oopConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
MethodOverloading obj= new MethodOverloading();

obj.sum();
obj.sum(10);
obj.sum(10,5);
	}
	
	public static void main(int p) {
		//main method can be overloaded
	}
	//you cant create a method inside a method
	//method overloading-->when the method name is same with different arguments or input parametrs within the same class
	// duplicate methods- i.e same method with same no of arguments are not allowed
	
	public void sum()  //0 imput parametrs
	{
	System.out.println("sum method-zero param");
	}
	
	public void sum(double d)
	{
		
	}
	public void sum(int i)
	{
		System.out.println("sum method");
	}
	public void sum(int k, int l) // 2 input params
	{
		System.out.println("sum method");
		System.out.println(k+l);
	}
	
	

}
