import java.util.*;
class demo11
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		System.out.println("Enter Age=");
		int age=sp.nextInt();
		if (age>18)
		{
			System.out.println("Age Is Required");
		}
		else
		{
			System.out.println("Age is Not Required");
		}
	}
}