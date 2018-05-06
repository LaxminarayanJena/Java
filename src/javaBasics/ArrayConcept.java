package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		//array :to store similar data type values in a array variable
		//dis-1)size is fixed-static array to overcome this problem  we use collection-arraylist,hashtable
		//2)stores only similar data types - to overcome this problem we use object array
		
		
		
		int i[]= new int[4];
		
		i[0]= 10;
		i[1]=20;
		
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
	//	System.out.println(i[4]); ArrayIndexOutOfBoundsException
		System.out.println(i.length);
		
		//print all the values of array :use for loop
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2.Double array
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		System.out.println(d[2]);
		//3.char array
		char c[]= new char[3];
		c[0]='q';
		c[1]=2;
		c[2]='$';
		
		//4.boolean array
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String array
		String s[]= new String[3];
		s[0]= "test";
		s[1]="hello";
		s[2]="world";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		
		//6.object array(object is class)
				
		
		Object ob[]= new Object[7];
		ob[0]="Tom";
		Integer i1 = new Integer(25);
		Double d1= new Double(12.33);
		Character c1= new Character('M');
		ob[1]=i1;
		ob[2]=d1;
		ob[3]="1/1/1990";
		ob[4]=c1;
		ob[5]="AMERICA";
		ob[6]=8; //compiler version should be more than 1.5 eclipse oxygen
		
		System.out.println(ob[4]);
		System.out.println(ob.length);
		
		
		
		

	}

}
