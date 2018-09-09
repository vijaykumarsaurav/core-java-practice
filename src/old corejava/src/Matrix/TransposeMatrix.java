package Test;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Matrix row and column are same   \n Enter the Row Size :");
		int r = sc.nextInt();
		System.out.print("Enter the column size :");
		int c = sc.nextInt();
		int mat[][] = new int[r][c];
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print("Enter the "+(i+1)+"th row "+(j+1)+ "th column :");
				mat[i][j] = sc.nextInt();
				
			}
			
		}
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print( "\t"+ mat[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<c ; i++)
		{
			for (int j=0;j<r;j++)
			{
				System.out.print( "\t"+ mat[j][i]);
			}
			System.out.println();
		}
			
		
			
		
	}
}
