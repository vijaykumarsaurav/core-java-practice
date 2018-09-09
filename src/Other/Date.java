package Other;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date d=new java.util.Date();
		 
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
        String dat = sdf.format(d);
        System.out.println(dat);
        //t2.setText(dat);
		

	}

}
