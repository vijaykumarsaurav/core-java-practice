package Other;

public class AsertTest {

	static int no=5;
	static int assertMethod()
	{
		return no--;
		
	}
	public static void main(String[] args) {

		int n;
		for (int i = 0; i < 10 ; i++) 
		{
			n = assertMethod();	
			assert n>0 : " vijay asert program is tested oks ";
			System.out.println("N is : "+n);
		}
	}

}
