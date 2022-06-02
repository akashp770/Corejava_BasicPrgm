import  java.util.*;

class Arm2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n,r,c, sum =0;
		System.out.println("enter the NO.:");
		n=sc.nextInt();
		
		int x=n;
		while(n!=0) {
			
			r=n%10;
			c=r*r*r;
			sum=sum+c;
			n =n/10;
		
			
		}
		
		if (x == sum) {
			System.out.println("Given number is ArmStrong Number ");
		}
		else {
			System.out.println("Given no. is Not Armstrong Number");
		}
	}
}