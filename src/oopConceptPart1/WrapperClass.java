package oopConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
		
		String   x= "100";
		System.out.println(x+20);
		
		//data conversation :string to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//integer ,double, Character, Boolean
		
		String y="12.33";
		double d= Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String conversation
		int j=200;
		System.out.println(j+200);
		String s=String.valueOf(j);
		System.out.println(s+20);
		
		String u="100A";
		//hhjnmhInteger.parseInt(u);//java.lang.NumberFormatException:
		
		
		

	}

}
