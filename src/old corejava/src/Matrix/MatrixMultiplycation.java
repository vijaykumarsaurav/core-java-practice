package Test;

import java.util.Scanner;

public class MatrixMultiplycation {

	public static void main(String[] args) 
	{
		int r=3,c=3;
		int mat1[][] = new int[r][c];
		int mat2[][] = new int[r][c];
		int mat3[][] = new int[r][c];
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication of 3 * 3 Matrix : Enter elements ");
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print("Enter the "+(i+1)+"th row "+(j+1)+ "th column :");
				mat1[i][j] = sc.nextInt();
				
			}
			
		}
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print("Enter the "+(i+1)+"th row "+(j+1)+ "th column :");
				mat2[i][j] = sc.nextInt();
				
			}
			
		}
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print( "\t"+ mat1[i][j]);
			}
			System.out.println();
		}
		System.out.println('\n');
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print( "\t"+ mat2[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				for(int k=0; k<r ; k++)
				{
					mat3[i][j] = mat3[i][j] + mat1[i][k] * mat2[k][j];
				}
			}
		}
		System.out.println("Multiplication ot these matrix :");
		for(int i=0; i<r ; i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print( "\t"+ mat3[i][j]);
			}
			System.out.println();
		}
	}

}
