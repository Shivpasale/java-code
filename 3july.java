//Switch Case :-

import java.util.*;
class demo
{
	public static void main(System args[])
	{
		Scanner sp=new Scanner(System.in);
		int n=1;
		System.out.println("Enter A Day=");
		n=sp.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("Thur");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("!Wrong Choice");
		}
		
	}
}