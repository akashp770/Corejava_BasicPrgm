import java.util.Scanner;
class Tab
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, upto;
		System.out.println("Enter the No. for its table:");
		n = sc.nextInt();
		
		System.out.println("Enter upto");
		upto = sc.nextInt();
	
		// WHILE LOOP
		/*int x =1;
		
		while(x<=upto) {
			System.out.println(n*x);
			
			x++;
		}
		*/
		
		
		//  DO WHILE LOOP
		/*int x =1;
		do{
			System.out.println(n*x);
			x++;
			
		}while(x <= upto);*/
	
		//FOR  LOOP
	
	for(int x = 1; x <= upto; x++){
		
		System.out.println(n*x);
		
	}
	
	
	}
	
}




















