package Matrix;

public class JaggedArray {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][];
		arr[0] =  new int[3];
		arr[1] =  new int[4];
		arr[2] =  new int[5];
		arr[0][0] = 3;
		arr[0][1] = 3;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 4;
		arr[1][2] = 4;
		arr[1][3] = 4;
		arr[2][0] = 5;
		arr[2][1] = 5;
		arr[2][2] = 5;
		arr[2][3] = 5;
		arr[2][4] = 5;
		
	for(int j=0; j < arr.length; j++)
	{
		for(int i=0; i<arr[j].length;i++)
		{
			//arr[j][i] =100;  //automatic intialize
			System.out.print("\t"+arr[j][i] );
		}
		System.out.println();
	}
	//useing instance 
	System.out.println();
	for(int s : arr[0])
		{
			System.out.print("\t"+s);
		}
		
	
		
	}
}
