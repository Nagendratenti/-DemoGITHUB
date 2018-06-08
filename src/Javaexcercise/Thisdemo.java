package Javaexcercise;

public class Thisdemo {

	int a=9;
	
	public void getdata() 
	{
		int a=8;
		System.out.println(a);
		System.out.println(this.a);
		int b=a*this.a;
		System.out.println(b);
		
	}
	public static void main(String[] args) {

           Thisdemo ti=new Thisdemo();
           ti.getdata();
           

	}

}
