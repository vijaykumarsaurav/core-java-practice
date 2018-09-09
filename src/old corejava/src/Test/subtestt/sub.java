package Test.subtestt;

import Test.PrivateClass;

public class sub extends PrivateClass {

    public static void main( String s[])
    {
       PrivateClass pt = new PrivateClass();
    		//setName(" vijay kumar ");
       String sname = getName();
        System.out.println(pt.name);
        System.out.println(sname);
    }
}
