package oopConceptPart1;

public class Constructor {
	
	public Constructor()
	{
		System.out.println("default constructer");
	}
	
	public Constructor(int i)
	{
		System.out.println("single param constroctor");
		System.out.println("the value of i-" + i);
	}
	
	public Constructor(int i , int j)
	{
		System.out.println("two param constroctor");
		System.out.println("the value of i-" + i);
		System.out.println("the value of j-" + j);
	}
	 

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		Constructor obj2 = new Constructor(10,20);
		
		
	}

}
