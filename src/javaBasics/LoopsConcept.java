package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
	
		//1.while loop
		
		int i=1; //initialization
		while(i<=10)
		{
			System.out.println(i);
			i=i+1;//incremental/decremental
		}
		
		System.out.println("*********for loop**********");
		//2.for loop
		for(int j=1 ;j<=10;j++) //initialisation,conditional and increment part
		{
			System.out.println(j);
		}
		
System.out.println("*********for loopprint 10 to 1**********");
		
		for (int k=10; k>=-10;k--)
		{
			System.out.println(k);
		}
	}
	//while loop -- infinite loop is poosible where as in for loops its not possible

}
