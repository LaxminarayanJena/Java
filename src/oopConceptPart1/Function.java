package oopConceptPart1;

public class Function {

	public static void main(String[] args) {
		//main method is void -never returns a value n 
		
		Function obj= new Function();
		//one object will be created ,obj is the reference variable, refering to this object
		//after creating the object , the copy of all non static methods woill be given to this object
		
		obj.test();
		int l=obj.pqr();
		System.out.println(l);
		String s=obj.qa();
		System.out.println(s);
		obj.division(5, 5);
	}
		//non static methods
	//void -doesnot return anything
		
		public void test()  // no input no output
		{
			System.out.println("test method");
		}
		
		//return type-int
		public int pqr()
		{
			System.out.println("pqr method");  //no input some output
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
		}
		
		public String qa()   //no input some output
		{
			System.out.println("qa method");
			String s="selenium";
			
			return s;
		}
		
		//x,y- input parametrs/arguments
		public int division(int x, int y)
		{
			System.out.println("division method");
			int d=x/y;
			System.out.println(d);
			
			return d;
		}
	}


