package Other;

public class SingleLoopSorting {

	public static void main(String[] args) {
		
		int x[] = {10,20,12,15,13};
		boolean again=false;
		
		for (int i : x) {
			System.out.println(i);
		}
		
		for ( int i = 0; i < 5; i++ ) 
		{ 

			if ( x[ i ] < x[ i + 1 ] ) 
			{ 

			int temp = x[ i ]; 
			x[ i ] = x[ i + 1 ]; 
			x[ i + 1 ] = temp; 

			} 

			i = -1; 

		} 

		
		
		for (int i : x) {
			System.out.println(i);
		}
	}
	
}
