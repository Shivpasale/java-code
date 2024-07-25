//Print all Palindrome numbers form 1 to 200.
import java.util.*;
class Palindromefor
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		System.out.println("Palindrome Number=");
		int i,j;
		for(i=1;i<=200;i++)
		{
			int rev=0,rem=0;
			for(j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(i==rev)
			System.out.println(i+"");
		}
		System.out.println("===== Code Execution Successful =====");
	}
	
}