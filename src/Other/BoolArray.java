package Other;

public class BoolArray 
{
    boolean [] b = new boolean[3];
    int count = 0;

    void set(boolean [] x, int i) 
    {
        x[i] = true;
        ++count;
    }

    public static void main(String [] args) 
    {
    	String a = "newspaper";
    	a = a.substring(5,7);
    	char b = a.charAt(1);
    	a = a + b;
    	System.out.println(a);
    	
        BoolArray ba = new BoolArray();
        ba.set(ba.b, 0);
        ba.set(ba.b, 2);
        ba.test();
    }

    void test() 
    {
    	System.out.println(count);
        
        if ( b[0] && b[1] | b[2] )
            count++;
        System.out.println(count);
      
        if ( b[1] && b[(++count - 2)] )
            count += 7;
        System.out.println("count = " + count);
    }
}