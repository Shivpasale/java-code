import java.util.*;
class Palindromeforloop
{
	public static void main(String args[])
	{
		
		int n=22,i,rev=0,rem;
		i=n;
		for(i=n;i!=0;i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;
			
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

