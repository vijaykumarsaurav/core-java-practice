package demo;

public class techgigTest {

	public static void main(String[] args) {

	 System.out.println(ConvertingTheCandiesShape(3));	
	}

	
    public static int ConvertingTheCandiesShape (int input1)
    {
        int move=0;
        if(input1%2==1)
        {
            for(int i=0;i<=input1 ;i+=2)
            move += i;
            
        }
        return move;
    }

}

