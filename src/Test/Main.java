package Test;

public class Main {
 
	int add(int j,int ... is   )
	{
		int sum=0;
		int l =is.length;
		System.out.println(l);
		for (int i : is) {
			sum +=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int res = new Main().add(1,2,3,4,5,2,3,4,5,1,70);
		
		System.out.println("Sum of ver arument :"+res);
	}
	

}
