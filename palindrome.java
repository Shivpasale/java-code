/*
if(rev==n)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
*/

import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		
		int n=22,i,rev=0,rem;
		i=n;
		while(i!=0)
		{
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		System.out.println("Revers Number="+rev);
		if(rev==n)
		{	
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}

