package oopConceptPart1;

public class Car {

	//Class Variable or global variables
	int mod;
	int wheel;
	public static void main(String[] args) {
	
     
     
     //a- object reference variable
     //new Car()- object is crerated.. this is object of car class
		//new keyword is used to crete the object
     Car a = new Car();
     Car b = new Car();
     Car c = new Car();
     
     a.mod=2015;
     a.wheel=4;
     
     b.mod=2014;
     b.wheel=3;
     
     c.mod=2013;
     c.wheel=7 ;
     
     System.out.println("before assigning the reference");
     System.out.println(a.mod);
     System.out.println(a.wheel);
     
     System.out.println("after assigning the reference");
     a=b;
     b=c;
     c=a;
     
     a.mod=10;
     System.out.println(a.mod);//10
     
     c.mod=20;
     System.out.println(a.mod);//20
     System.out.println(c.mod);//20
     
	}

}
