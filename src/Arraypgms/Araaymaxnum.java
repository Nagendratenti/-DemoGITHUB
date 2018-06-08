package Arraypgms;

public class Araaymaxnum {

	public static void main(String[] args) {
		/* 2 4 3  
		 *  5 1 6
		 *  4 9 0
		  find out max number*/
		 
		 int g[][]={{2,4,3},{5,1,6},{4,9,0}};
		 int max=g[0][0];
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(g[i][j]>max)
				 {
					 max=g[i][j];
				 }
			 }
		 }
		System.out.println(max); 

	}

}
