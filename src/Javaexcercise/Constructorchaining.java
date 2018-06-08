package Javaexcercise;

public class Constructorchaining {

	 Constructorchaining()
	{
		System.out.println("this is first");
	}
	 Constructorchaining(int a,String s)
	{
		s="prasad";
			 a=10;	 
			System.out.println(s + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructorchaining(10,"prasad");
		
	}

}
