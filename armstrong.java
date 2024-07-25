// Armstrong Number

import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		int n=1534,i=0,c=0,rem;
		int sum=0;
		while(i!=0)
		{
			c++;
			i=i/10;
		}
		System.out.println("Number of Digit.");
	
		while(i!=0)
		{
			rem=i%10;
			sum=sum+(int)Math.pow(rem,c);
			i=i/10;
		}
		if (sum==n)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("NOArmstrong Number");

		}
	}
}