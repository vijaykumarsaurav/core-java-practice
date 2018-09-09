package corejava;

public class BitwiseTest {

	public static void main(String[] args) {
		  System.out.println("Hi, Bitwise Operator ");
	    
	    	System.out.println("(10 & 12) And & :" + (10 & 12));
	    	System.out.println(" (80 & 20) And & :" + (80 & 20));
	        System.out.println("(10 | 12) Or | :" + (10 | 12));
	        System.out.println("(80 | 20) Or | :" + (80 | 20));
	        System.out.println("(10 ^ 11) XOR ^ :" + (10 ^ 11));
	        System.out.println("(80 ^ 20) XOR ^ :" + (80 ^ 20));
	 
	    	System.out.println("_________________"); 
			boolean a=true,b=false;	 
			// and & operator
	        System.out.println("Output (a & b ) :"+(a & b ));//false
	        System.out.println("Output (a & a ):"+(a & a ));//true
	        System.out.println("Output (b & a ):"+(b & a ));//false
	        System.out.println("Output (b & b ):"+(b & b ));//false
	        

	        System.out.println("Output (a && "
	        		+ "b ) :"+(a && b ));//false
	        System.out.println("Output (a && a ):"+(a && a ));//true
	        System.out.println("Output (b && a ):"+(b && a ));//false
	        System.out.println("Output (b && b ):"+(b && b ));//false
	         //or | operator
	        System.out.println("Output (a | a ):"+(a | a ));//true
	        System.out.println("Output (a | b ):"+(a | a ));//true
	        System.out.println("Output (b | a ):"+(b | a ));//true
	        System.out.println("Output (b | b ):"+(b | b ));//false
	        //not ! oprator
	        
	        System.out.println("Output (!a):"+(!a ));//false
	        System.out.println("Output (!b):"+(!b ));//true
	        
	        
	        System.out.println("(10 << 1) :" + (10 << 1));
	        System.out.println("(10 << 2) :" + (10 << 2));
	        System.out.println("(10 << 3) :" + (10 << 3));
	        System.out.println("(10 << 69) :" + (10 << 69));
	        System.out.println("(80 << 26) :" + (80 << 26));
	        System.out.println("(12 << 2) :" + (12 << 2));
	        System.out.println("(10 >> 1) :" + (10 >> 1));
	        System.out.println("(10 >> 2) :" + (10 >> 2));
	        System.out.println("(10 >> 3) :" + (10 >> 3));
	        System.out.println("(10 >> 4) :" + (10 >> 4));
	        System.out.println("(10 >> 5) :" + (10 >> 5));
	        System.out.println("(10 >> 6) :" + (10 >> 6));
	        System.out.println("(10 >> 32) :" + (10 >> 32));
	        System.out.println("(10 >>> 1) :" + (10 >>> 1));
	        System.out.println("(10 >>> 2) :" + (10 >>> 2));
	        System.out.println("(10 >>> 32) :" + (10 >>> 32));
	        System.out.println("(-10 >>> 1) :" + (-10 >>> 1 ));
	        System.out.println("(-10 >>> 1) :" + (-10 >>> 2));
	        System.out.println("(-10 >>> 3) :" + (-10 >>> 3));
	            
	        int arr[][]={{1,0,2},{1,2,0},{2,2,0}};
	         
	      out1 :   for (int i=0;i<arr.length;i++)
	        { 
	    	   System.out.println();
	  	     
	    	   out2 :  for(int j=0;j < arr.length;j++)
	        	{
	        		if(arr[i][j]==0)
	        		{
	        		//	break out1;
	        			continue out2;
	        		
	        		}
	        		else 
	        			System.out.print("\t "+arr[i][j]);
	        	}
	        }
	}
}
