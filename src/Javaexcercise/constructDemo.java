package Javaexcercise;

public class  constructDemo {
	
	// Parameterized constructor 
	 public constructDemo(int a, int b, String s)

	 {

	 System.out.println(" I am in the parameterized constructor"); 

	int c=a+b; 
	

	System.out.println(c + s);

	 }
		public static void main(String[] args) {
		 // TODO Auto-generated method stub 
		new constructDemo(4,5,"prasad");
		
		
	// compiler will call implict constructor if you have not defined constructor block

		 //when ever you create an object constructor is called 

		//block of code when ever an object is created 
		}

		}