import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner so = new Scanner (System.in);
		int x,y,z;
		System.out.println("Enter the 1st no.:");
		x = so.nextInt();
		System.out.println("Enter the 2nd no.:");
		y = so.nextInt();
		System.out.println("Enter the 3rd no.:");
		z = so.nextInt();
		 
		if (x>y && x>z ){
		 System.out.println(x +" is the Greatest number");
		 
		}
		else if (x<y && y>z)
		{
			 System.out.println(y + " is the Greatest number");
		}
		else if (z>x && z>y)
		{
			 System.out.println(z + " is the Greatest number");
		}
		
	}
}