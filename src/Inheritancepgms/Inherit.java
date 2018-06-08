package Inheritancepgms;

public class Inherit extends Child {

	public void dntknw()
	{
		super.dntknw();
		System.out.println("im child");
	}
	
	public static void main(String[] args) {
	       
		Inherit i=new Inherit();
		i.dntknw();
		
	}

}
