package array_programs;

public class Addition_of_array {
	
	public static void main(String[] args) {
		
		int a[][] = new int [][] {{1,2,3,4,5},{1,2,3,4,5}};
		int b[][] =new int[][]  {{1,2,3,4,45},{1,4,6,8,9}};
		
		int c[][] = new int [2][5];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				
	            //c[i][j]=a[i][j]-b[i][j];
			    //c[i][j]=a[i][j]*b[i][j];
				//c[i][j]=a[i][j]/b[i][j];
				
				System.out.print(c[i][j]+","+ " ");
			}
			
			System.out.println();
		}
		
	}

}
