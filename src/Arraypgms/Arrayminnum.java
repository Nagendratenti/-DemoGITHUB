package Arraypgms;

public class Arrayminnum {

	public static void main(String[] args) {
		/* 2 4 3  
		 *  5 1 6
		 *  4 9 0
		  find out small number*/
		 
		 int g[][]={{2,4,3},{5,1,6},{4,9,0}};
		 int min=g[0][0];
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(g[i][j]<min)
				 {
					 min=g[i][j];
				 }
			 }
		 }
		System.out.println(min); 
	}

}
