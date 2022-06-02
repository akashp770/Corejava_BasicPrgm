import java.util.Scanner;
class Fib {
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner (System.in);
		int upto;
		System.out.println("Enter number upto you need Fibonaccie Series");
		upto = sc.nextInt();
		int n1 =0, n2 = 1, n3;
		System.out.println(n1);
		System.out.println(n2);
		 
		/* for (int c =1;c <=upto-2; c++){
			 n3=n1+n2;
			 System.out.println(n3);
			 n1 =n2;
			 n2 =n3;
			 
		 }*/
		 
		  //   WHILE LOOP
		  
		 /* int c =1;
		  while(c <=upto-2) {
			  n3 =n1+n2;
			  System.out.println(n3);
			  n1=n2;
			  n2=n3;
			  c++;
		  } */
	
	
			//DO WHILE LOOP
			
			int c =1;
			do{
				n3 =n1+n2;
				System.out.println(n3);
				n1 = n2;
				n2 = n3;
				c++;
			}while(c <=upto-2);
	
	
	}
	
}