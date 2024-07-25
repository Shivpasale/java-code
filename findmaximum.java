//program to find maximum between two numbers.
import java.util.*;
class findmaximum
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		System.out.println("Enter Maximum Number=");
		int a,b;
		a=sp.nextInt();
		System.out.println("A=");
		b=sp.nextInt();
		System.out.println("B=");
		if(a>b)
		{
			System.out.println("Maximum Value Is A="+a);
		}
		if(a<b)
		{
			System.out.println("Maximum Value Is B="+b);
		}

	}
}