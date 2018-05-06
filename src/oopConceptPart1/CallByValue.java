package oopConceptPart1;

public class CallByValue {

	public static void main(String[] args) {
		
		CallByValue  obj = new CallByValue ();
		int x=10;
		int y=30;
		obj.testSum(x, y); //call by value or pass by value
		
		//no change in x,y value as we are passing copy
	}
	
	public int testSum(int a , int b)
	{
		//a=30;
		//b=40;
		int c=a+b;
		return c;
	}

}
