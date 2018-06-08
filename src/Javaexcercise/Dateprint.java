package Javaexcercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Date d=new Date();
			System.out.println(d.toString()); 
			//to print obj to string we have to use obj.toString();
	
	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
	System.out.println(sdf.format(d));
	/*to get date we need use date class object "d" here ,but to print in a format we need to use 
	 simpledateformat object "sdf" also to combined both we have method 
	 obj.format(obj)*/
	}

}
