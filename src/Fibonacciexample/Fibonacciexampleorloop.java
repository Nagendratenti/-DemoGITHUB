package Fibonacciexample;

public class Fibonacciexampleorloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =15, n1=0, n2=1;
		
		System.out.print("Fibonacci series of "+count+" numbers:");
		
		for(int i=1;i<=count;i++)
		{
			System.out.print(n1+" ");
			int sumoftwo=n1+n2;
			n1=n2;
			n2=sumoftwo;
					
		}
	}

}
