package Abstraction;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("bMW--START");
		
	}

	@Override
	public void stop() {
		System.out.println("bMW--Stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("bMW--refuel");
		
	}
	
	public void theftSafety()
	{
		
	}
	
	

}
