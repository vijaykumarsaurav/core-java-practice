package factory;

class Emp implements Cloneable
{
	int age =22;
	String name ="vijay";
	static Emp getObject()
	{
		Emp e =new  Emp();
		return e;
	}
	void showDetails()
	{
		System.out.println("Name : "+name +"   Age : "+age);
	}
	public Object myClone() throws CloneNotSupportedException
	{
		
		return super.clone();
	}
}
public class DiffWayCreationObject {

		public static void main(String[] args) {
				
			// 1st way of Creation of object : Normal object creation
			Emp e2 = new Emp();
			e2.age = 31;
			e2.name = "raj";
			e2.showDetails();
			
			// 2nd way of Creation of object : Using Factory Method  
			Emp e1 = Emp.getObject();
			e1.name = "mehul";
			e1.age = 24;
			e1.showDetails();
			
			// 3rd way of Creation of object : useing newInstance() of Class class.
			try {
				Class c=Class.forName("factory.Emp");
				Emp emp = (Emp)c.newInstance();
				emp.age =21;
				emp.name = "Kishor kumar";
				emp.showDetails();
			} catch (ClassNotFoundException e) {
				System.out.println("may be exception");
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// 4th way of Creation of existing object with data: using clone() method of Object class
			Emp empobj = new Emp();
			empobj.age = 25;
			empobj.name ="ravindar";
			empobj.showDetails();
			
			try {
				Emp cemp = (Emp)empobj.myClone();
				cemp.age = 55;
				cemp.name = "dipak";
				cemp.showDetails();
				empobj.showDetails();
				
			} catch (CloneNotSupportedException e) {
				System.out.println("Clonig object creation problem :");
				e.printStackTrace();
			}
			
}	
}
