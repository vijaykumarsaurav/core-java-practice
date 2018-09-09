package Other;

public class TrialInterface 
{
	public static void main(String[] args) {
		Aarraylist al=new Aarraylist();
		car c=al.speed();
		c.hasNextr();
		
	}
}

interface vehicle   //Iterable
{
	car speed();
}

interface car       //Iterator
{
	
	boolean hasNextr();
	boolean hasRemover();
}

/*class B implements car			
{

	
	
}
*/
class Aarraylist implements vehicle,car			// Arraylist
{

	@Override
	public car speed() {
		// TODO Auto-generated method stub
	//	car c=new B();
		Aarraylist t= new Aarraylist();
		return t;
	}
	
	@Override
	public boolean hasNextr() {
		System.out.println("from class B's hasNextr impl.");
		return false;
	}

	@Override
	public boolean hasRemover() {
		System.out.println("from class B's hasRemover impl.");
		return false;
	}
	
	
}