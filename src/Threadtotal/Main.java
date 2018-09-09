package Threadtotal;
class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Connection is establised ");
		AbcThreadAlpha ala = new AbcThreadAlpha();
		AbcThreadBita atb = new AbcThreadBita();
	//	AbcThreadAlpha t3 = new AbcThreadAlpha();
		try {
			atb.thread.join();//using join(); execute all thread till the connection
			ala.thread.join();
		//	t3.thread.join();//not terminted of main().
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Sachine");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Connection is termineted");
	}
}