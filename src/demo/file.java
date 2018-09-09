package demo;



import java.io.FileWriter;

public class file 
{
	public static void main(String args[]){
	try{
	FileWriter ob=new FileWriter("C:/Users/Desktop/t.txt");
	ob.write("vijay kumar asutosh kumar ");
	ob.close();
}catch (Exception e) {
		// TODO: handle exception
e.printStackTrace();
}
}
}
