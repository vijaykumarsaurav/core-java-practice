package Polymorphism;

public class Vehical {
 
	int reg;
	Vehical(int r)
	{
		this.reg = r;
	}
	void showReg()
	{
		System.out.println("Reg no. : "+reg);
		
	}
	 void breaking()
	 {
		 System.out.println("vehical breking" );
			
	 }
	 void stering()
	 {
		 System.out.println("vehical stearing ");
			
	 }

}

class Car extends Vehical
{

	
	public Car(int r) {
	super(r);
		// TODO Auto-generated constructor stub
	}
	
	void breaking() {

		System.out.println("Car breaking fasility ");
	}

	@Override
	void stering() {

		System.out.println("Car stering ");
	}

	public void carMsg() {
		System.out.println("car specitfic mmss");
		// TODO Auto-generated method stub
		
	}
	
	
}
class Truck extends Vehical
{

	
	Truck(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	void breaking() {
		System.out.println("truck breaking fasility ");

	}

	@Override
	void stering() {
		System.out.println("truck steaing fasility ");
	
	}
	void carMsg()
	{
		System.out.println("car specifiec massg");
	}
	
}