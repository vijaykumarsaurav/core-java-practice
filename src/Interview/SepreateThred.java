package Interview;

public class SepreateThred  implements  Runnable
{
	public SepreateThred()
	{
		new Thread().start();
	}

	public void run() 
	{
		for(int i=1;i<=100;i++)
		{
			if (i%2==0)
				System.out.println("This is odd no. : "+i);

		}
	}


	public static void main(String[] args) {
		System.out.println("start thred");
		new OddWithSeprateThred();
		System.out.println("end thred");
	}

}
