package Fibonacciexample;

import java.util.Scanner;

public class Fibonacciusernput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count, n1 = 0, n2 = 1;
        System.out.println("How may numbers you want in the sequence:");
       
        Scanner scanner=new Scanner(System.in);
       
        count=scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");
        
        int i=1;
        while(i<=count)
        {
        	System.out.print(n1+" ");
			int sumoftwo=n1+n2;
			n1=n2;
			n2=sumoftwo;
			i++;
        }
	}
	
}
