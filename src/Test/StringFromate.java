package Test;

public class StringFromate {

	public static void main(String[] args) {
		
		String  name = "vijay kumar";
		int age = 23;
		float salary = 34000;
		long mo=204563432;
		char grade = 'A';
		//%s %f..C stile.
		System.out.printf("Name : %s Age :%d  Salary : %f Mobile no. : %d Grde : %c",name,age,salary,mo,grade );
		//String formate method...
		String str =  String.format("Name : %s Age :%d  Salary : %f Mobile no. : %d Grde : %c",name,age,salary,mo,grade);
		System.out.println("\n"+str);	
		
	}
}
