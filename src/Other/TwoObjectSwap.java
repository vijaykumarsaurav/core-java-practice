package Other;
class Emp
{
	
	int id;
	Emp(int id)
	{
		this.id = id;
	}
	void swap(Emp o1,Emp o2)
	{

		Emp t = new Emp(0);
		t.id = o1.id;
		o1.id = o2.id;
		o2.id =t.id;
		
		System.out.println(o1.hashCode()+"\t "+o2.hashCode());
		
	}
}


public class TwoObjectSwap {

	public static void main(String[] args) 
	{
		Emp e1 = new Emp(10);		
		Emp e2 = new Emp(20);
		System.out.println("before "+e1.id +"\t"+e1.hashCode()+"\t " +e2.id+e2.hashCode());
		e1.swap(e1, e2);
		System.out.println("after "+e1.id+"\t " +e2.id);
		//System.out.println("after addereess "+e1.id +"\t"+e1.hashCode()+"\t " +e2.id+e2.hashCode());
		
	}

}
