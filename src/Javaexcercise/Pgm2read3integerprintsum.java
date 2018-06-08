package Javaexcercise;

import java.util.Scanner;

public class Pgm2read3integerprintsum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("enter second number");
		int num2 = scan.nextInt();
		
		System.out.println("enter third number");
		int num3 = scan.nextInt();
		
		scan.close();
		
		int sum=num1+num2-num3;
		System.out.println("output:"+ sum);
		
		if (sum<0)
		{
			System.out.println("sum is negative");
		}
		
		else
		{
			System.out.println("sum is positive");
		}
		/*if(sum==0)
		{
			System.out.println("you r zero");
		}*/
		
	}

}
