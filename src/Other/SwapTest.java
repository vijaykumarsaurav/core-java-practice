package Other;

public class SwapTest 
{
		int a=10,b=20;
		
		public static void main(String[] args) {
			SwapTest st = new SwapTest();
			st.go();
		}
		
		public void go()
		{
			System.out.println("before a = "+a+"  \t b ="+b);
			tt ab= new tt();
			ab.swap(this);
			System.out.println("after a = "+a+"  \t b ="+b+"hashcode :"+this.hashCode());
		}

}

class tt
{


	public void swap(SwapTest swapTest) {
		
		swapTest.a = swapTest.b+swapTest.a;
		swapTest.b= swapTest.a - swapTest.b;
		swapTest.a= swapTest.a - swapTest.b;
		System.out.println("2nd ref :"+swapTest.hashCode());
	}

}
