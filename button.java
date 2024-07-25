import java.util.*;
class button
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		System.out.println("Enter Button Number=");
		int button=sp.nextInt();
		
		if (button==1)
		{
			System.out.println("Hello");
		}
		else if(button==2)
		{
			System.out.println("Namaste");

		}
		else if(button==3)
		{
			System.out.println("Ram Ram");

		}
		else
		{
			System.out.println("Invalid Button");
		}
	}
}