package Other;

import java.io.FileWriter;

public class writeFile 
{
	public static void main(String args[]){
	try{
	FileWriter ob=new FileWriter("C:/Users/Vijay/Desktop/t.txt");
	ob.write("siddu");
}catch (Exception e) {
		// TODO: handle exception
e.printStackTrace();
}
}
}
