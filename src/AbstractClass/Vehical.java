package AbstractClass;

public abstract class Vehical {
 
	int reg;
	Vehical(int r)
	{
		this.reg = r;
	}
	void showReg()
	{
		System.out.println("Reg no. : "+reg);
		
	}
	abstract void breaking();
	abstract void stering();
}

  class Car extends Vehical
{

	
	public Car(int r) {
	super(r);
		// TODO Auto-generated constructor stub
	}
	@Override
	void breaking() {

		System.out.println("Car breaking fasility ");
	}

	@Override
	void stering() {

		System.out.println("Car stering ");
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
		System.out.println("truck breaking fasility ");
	
	}
	
}