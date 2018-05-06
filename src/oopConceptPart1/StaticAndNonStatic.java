package oopConceptPart1;

public class StaticAndNonStatic {

	
	String name="Tom";//non static global variable
	static int age =25;//static global variable
	public static void main(String[] args) {
		
		//call static method and vars  by directly or using class name
		//static method and vars not part of object
		sum();
		StaticAndNonStatic.sum();
		System.out.println(age);

		System.out.println(StaticAndNonStatic.age);
		
		//call non static method and vars through object
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		
		
		//accessing static methods by using object references
		
		obj.sum();
		
	}
	
	public void sendMail()//non static method
	{
		System.out.println("send mail method");
	}
	
	public static void sum()// static Method
	{
		System.out.println("sum method");
	}

}
