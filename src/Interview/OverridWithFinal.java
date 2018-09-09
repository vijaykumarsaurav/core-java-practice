package Interview;

class One
{
	void add()
	{
		System.out.println("One mehtod");
	}
}
class Two extends One
{
	
	final void add()
	{
		super.add();
		 System.out.println("Two metho");
	}
}


public class OverridWithFinal {

	public static void main(String[] args) {

		One t =new Two();
		 t.add();
	}

}
