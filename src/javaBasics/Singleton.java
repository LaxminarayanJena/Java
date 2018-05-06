package javaBasics;

public class Singleton {

		
//in oop a singleton class is a class that can have only single object (instance of a class)
		//at a time
		/*1)make constructor as private
		 * write a public static method that has return type of object of this singleton class(lazy initialisation)
		 * for normal class- we use constructor whereas for singleton clas we use getInstance() method for instantiation
		 */
		
		private static Singleton singleton_instance=null;		
	    public String str;
	    
	    private Singleton()
	    {
	    	str= "Hey i am using singleton class pattern";
	    }
	    
	    public static Singleton getInstance()
	    {
	    	if(singleton_instance==null)
	    		singleton_instance = new Singleton();
			return singleton_instance;
	    	
	    	
	    }
		
	    public static void main(String [] args)
	    {
	    	Singleton x=Singleton.getInstance();
	    	Singleton y=Singleton.getInstance();
	    	Singleton z=Singleton.getInstance();
	    	x.str=(x.str).toUpperCase();
	    	System.out.println(x.str);	    		    	
	    	System.out.println((y.str));
	    	System.out.println((z.str));
	    	
	    	z.str=(z.str).toLowerCase();
	    	System.out.println(x.str);	    		    	
	    	System.out.println((y.str));
	    	System.out.println((z.str));
	    	
	    }
		
	}

