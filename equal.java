import java.util.*;
class equal
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		System.out.println("Enter Any Number=");
		int a=sp.nextInt();
		int b=sp.nextInt();
		
		if(a==b)
		{
			System.out.println("Equal.");

		}
		else if(a>b)
		{
			System.out.println("A is Grator.");

		}
		else
		{
			System.out.println("A is Less.");
		}
		
	}
}