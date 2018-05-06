package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
ArrayList ar= new ArrayList();
ar.add(100); //0
ar.add(200);//1
ar.add(300);//2

System.out.println(ar.size());

ar.add("TOM");//3
ar.add(12.33);
ar.add('M');
System.out.println(ar.size());
ar.remove(5);
System.out.println(ar.size());
System.out.println(ar.get(4));

//to print all the values of arraylist

for(int i=0; i<ar.size();i++)
{
	System.out.println(ar.get(i));
}

ArrayList<Integer> ar1= new ArrayList<Integer>();
ar1.add(100);
//ar1.add("TOM"); -ERROR

ArrayList<String> ar2= new ArrayList<String>();
//ar2.add(100);-error

	}

}
