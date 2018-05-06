package oopConceptPart1;

public class LocalVsGlobal {

	// Global variable or class variable
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {

		int i = 10; //local var
		System.out.println(i);
		
		LocalVsGlobal obj = new LocalVsGlobal();
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		int a=obj.sum();
		System.out.println(a);
		
		
	}

	public int sum()

	{
		
		int i=15; //local var for sum method
		int p=20;
		int age=25;
       return p;
	}
}
