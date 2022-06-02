import java.util.Scanner;
class Vowelchk
{
	public static void main (String args[])
	{
		Scanner so = new Scanner (System.in);
		char ch;
		
		System.out.println("Enter any alphabet:");
		ch = so.next().charAt(0);
		
		if (ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
		System.out.println("It is a vowel ");
		}
		else
		{
			System.out.println("It is not a Vowel");
		}
	}
	
}