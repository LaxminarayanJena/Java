package oopConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
BMW b= new BMW();
b.start();//child is given priority
b.stop();
b.refuel();
b.theftSafety(); //compile time polyperphism
b.engine();


System.out.println("------------------");

Car c= new Car();
c.start();
c.stop();
c.refuel();
//c.theftSafety(); //error

System.out.println("------------------");
//top casting
Car c1=new BMW(); //child class object can be 
//reffered by parent class reference variable- dynamic polymerphism or runtime polyphermism
c1.start();
c1.stop();
c1.refuel();
//c1.theftSafety();//error

//down casting

//BMW b1= new Car();
//BMW b1= (BMW)new Car();//error-class cast exception
	}

}
