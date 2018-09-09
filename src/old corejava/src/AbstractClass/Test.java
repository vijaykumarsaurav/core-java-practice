package AbstractClass;


class Test 
{
	public static void main(String[] args) {
		Car c1 = new Car(1000);
		c1.breaking();
		c1.stering();
		c1.showReg();
		Truck t1 =  new Truck(2000);
		t1.breaking();
		t1.stering();
		t1.showReg();
		Vehical vi =  new Car(555);
		vi.showReg();
		vi.breaking();
		vi.stering();
		vi = new Truck(420);
		vi.showReg();
		vi.breaking();
		vi.stering();
		vi.reg=100;
		vi.showReg();
		Object n = new Object();
	}
}
