package Matrix;

public class JaggedArray3D {

	public static void main(String[] args) {
		
		int arr[][][] = new int[2][][];
		arr[0] = new int[2][];
		arr[1] = new int[3][];
		arr[0][0] = new int[2];
		arr[0][1] = new int[3];
		arr[1][0] = new int[2];
		arr[1][1] = new int[2];
		arr[1][2] = new int[2];
		
		arr[0][0][0] = 2;
		arr[0][0][1] = 2;
		arr[0][1][0] = 3;
		arr[0][1][1] = 3;
		arr[0][1][2] = 3;
		arr[1][0][0] = 10;
		arr[1][0][1] = 10;
		arr[1][1][0] = 20;
		arr[1][1][1] = 20;
		arr[1][2][0] = 30;
		arr[1][2][1] = 30;
		
		
	for(int k=0 ; k < arr.length ; k++)
	{
		for(int j=0; j < arr[k].length; j++)
		{
			for(int i=0; i<arr[k][j].length;i++)
			{
				//arr[j][i] =100;  //automatic intialize
				System.out.print("\t" + arr[k][j][i] );
			}
			System.out.println();
		}
	}
	//useing instance 
	System.out.println();
		for(int s : arr[0][0])
		{
			System.out.print("\t"+s);
		}
		
	

	}
}
