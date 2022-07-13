import java.util.*;

class Pldm2{
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n,r,rev=0;
		
		System.out.println("Enter the value :");
		n=sc.nextInt();
		
		int x=n;
		
		while(n!=0) {
			r=n%10;
			rev= (rev*10)+r;
			
			n=n/10;
			
		}
		System.out.println("Reverse no.of the given no. is "+rev);

			if(x==rev){
				System.out.println("It is Palindrome No. ");
			}
			else {
				System.out.println("It is not Palindrome No.");
			}
	}
}
