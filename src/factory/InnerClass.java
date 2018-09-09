package factory;

public class InnerClass {

	int bal =100;
 	void outerShow()
	{
		this.bal =200;
		Inner in = new Inner();
		in.show();
	}
	
	private class Inner
	{
		String name="bihar";
		void show()
		{
			InnerClass ic=new InnerClass();
			
			bal =500;
			System.out.println(bal+name);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		InnerClass ic=new InnerClass();
		ic.outerShow();
		Inner or =ic.new Inner();
		or.name = "Bangalor";
		or.show();
	}

}
