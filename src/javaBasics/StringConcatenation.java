package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		//+ concatenation operator
		//println is used to print on the console on next line
		String x="Hello";
		String y="World";
		System.out.println(a+b);
		System.out.println(x+y);//HelloWorld
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		System.out.println(a+b+x+y+a+x+b+y);//300HelloWorld100Hello200World
		System.out.println(a+b+x+y+a+b);//300HelloWorld100200
		
		
		double c=12.33;
		double d=10.33;
		
		System.out.println(x+y+c+d);//HelloWorld12.3310.33
		System.out.println("hello world");
		System.out.println("the value of a  is " +a);
		System.out.println("the value of b  is " +b);
		System.out.println("the value of a+b  is " +(a+b));
		System.out.print("hello selenium");
		System.out.println("hello testing");

	}

}
