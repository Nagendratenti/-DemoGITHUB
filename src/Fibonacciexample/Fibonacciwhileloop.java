package Fibonacciexample;

public class Fibonacciwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count=8, a=0, b=1,c ;
     System.out.print("Fibanacci series of "+count+" numbers:");
     
     int i=1;
     while(i<=8)
     {
    	 System.out.print(a+" ");
    	 c=a+b;
    	 a=b;
    	 b=c;
    	 i++;
     }
	}

}
