import java.util.*;
class Ar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int r,c,sum=0;
		System.out.println("Enter the no.of Rows");
		r = sc.nextInt();
		System.out.println("Enter the No.of Cols");
		c = sc.nextInt();
		
	int x [][] =new int [r][c];
	System.out.println("Enter " + (r*c) + " values");
	 
	 
	 for(int i=0;i<r;i++)  
	 {
		 for(int j=0;j<c;j++)
		 {
			 x[i][j]=sc.nextInt();
		 }
		 
	 }
		
		for (int i=0;i<r;i++){
				
		 for (int j=0;j<c;j++){
			 System.out.print(" "+x[i][j]);
			 sum=sum+x[i][j];
		 }
		 System.out.println();
		
		}
		System.out.println("*****************************************");
		System.out.println("Sum of " + sum);
	}
}	
