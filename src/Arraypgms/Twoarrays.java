package Arraypgms;

public class Twoarrays {

	public static void main(String[] args) {
	
		// one dimensional array
	
		System.out.println("one dimensional array"); 
			int a[]={1,2,3,4,5,6};
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			//two Dimensional array
			System.out.println("two dimensional array");
			int b[][]={{1,2,3,},{2,5,8}};
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(b[i][j]);
				}
			}
	}

}
