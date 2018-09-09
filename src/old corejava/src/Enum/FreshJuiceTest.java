package Enum;

class FreshJuice 
{
	
} 
public class FreshJuiceTest
{ 
	enum FreshJuiceSize{ SMALL, MEDUIM, LARGE } 
//	FreshJuiceSize size; 

	public static void main(String args[])
	{
		FreshJuiceSize size; 

		size = FreshJuiceSize.LARGE ;
		System.out.println(size);
	}
}