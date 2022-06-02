import java.util.Scanner;
class Arr{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			int r,c, sum =0;
			System.out.println("No.of Rows" );
			r =sc.nextInt();
			System.out.println("No. of Cols");
			c = sc.nextInt();
			
			
			
				int x  [][] = new int [r][c];
				System.out.println("Give "+ r*c+   " Nos");
	
			for (int i=0; i<r; i++){
				for(int j=0; j<c; j++) {
					
					x [i][j]= sc.nextInt();
					
				}
			}
			
			for (int i=0; i<r; i++) {
				for (int j=0;j<c; j++){
					System.out.print(" "+x[i][j]);
			 sum=sum+x[i][j];
		 }
		 System.out.println();
		
		}
		System.out.println("*****************************************");
		System.out.println("Sum of " + sum);
				}
			
}