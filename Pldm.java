import java.util.Scanner;
class Pldm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n,r,rev=0;
		
		System.out.println("Enter the No.:");
		n = sc.nextInt();
		int x = n ;
		while (n!=0) 
						//121
			r=n%10;			// 1 > 2>>last digit of given value willbe output
			rev =(rev*10)+r;  // 1 >12 > 
			n =n/10;		// 12 > 1
		}
		System.out.println("Reverse of the No. is : " + rev);
		
		if (x==rev){
			System.out.println("It is Palindrome No. ");
		}
		else {
			System.out.println("It is not Palindrome No..");
		}
		
	}

}