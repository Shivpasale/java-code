import java.util.*;
class evenodd
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		System.out.println("Enter Even OR Odd Number");
		int x=sp.nextInt();
		if (x%2==0)
		{
		System.out.println("Number Is Even.");
		}
		else
		{
		System.out.println("Number Is Odd.");
		}   
	}
}
