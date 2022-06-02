import java.util.*;
class Fib2{
		
		public static void main(String args[])  {
			Scanner sc =new Scanner (System.in);
			int upto;
			
			
			System.out.println("Enter the no. upto you need Fibo:" );
			upto =sc.nextInt();
			
			int n1=0, n2=1, n3 ;
			
			System.out.println(n1);
			System.out.println(n2);
			
			for (int i=1; i<=upto-2;i++) {
				
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}

}