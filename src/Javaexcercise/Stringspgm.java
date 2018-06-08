package Javaexcercise;

public class Stringspgm {

	public static void main(String[] args) {
		
		String name="madam";
		String output="";
		for(int i=name.length()-1;i>=0;i--)
		{
			output=output+name.charAt(i);
			
		}
	System.out.println(output);
/*	if(name==output)
		{
		System.out.println("it is palindrome");	
	}
	else
	{
		System.out.println("it is not palindrome");
	}*/
	
	
	}
	}



