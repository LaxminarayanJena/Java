package oopConceptPart1;

public class CallByRef {

	int p;
	int q;
	public static void main(String[] args) {
		
		CallByRef  obj = new CallByRef ();
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public void swap(CallByRef t)
	{
		int temp;
		temp=t.p;  //temp=50;
		t.p=t.q;  //t.p=60
		t.q=temp;//t.q=50;
		
		
	}

}
