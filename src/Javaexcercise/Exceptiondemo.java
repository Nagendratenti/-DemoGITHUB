package Javaexcercise;

public class Exceptiondemo {

	public static void main(String[] args) {
		int i=7;
		int j=0;
		
			try {
			int l=i/j;
			System.out.println(l);
				 int arr[]=new int[5];
				System.out.println(arr[7]);
				
		}
			
		catch(ArithmeticException e)
			{
			System.out.println("raised exception");
			}
			
			catch(IndexOutOfBoundsException et)
			{
				System.out.println("realted to array error");
			}
			finally
			{
				System.out.println("failed");
			}
		}
		
}

	


