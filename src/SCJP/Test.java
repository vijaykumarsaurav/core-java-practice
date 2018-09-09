package SCJP;


class Test extends STest {
	
	public final void m1() { System.out.println(" sub"); }
	public static void main(String [] args) {
		new Test().m1();
	}
}


 class STest {
	private final void m1() { System.out.println("super");}
}
