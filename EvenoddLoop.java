/*
// Even
import java.util.*;
class remender
{
	public static void main(String args[])
	{
		
		int n=543678,i,rem;
		i=n;
		while(i!=0)
		{
			rem=i%10;
			if(rem%2==0)
			{
				System.out.println(rem+"");
				
			}
			i=i/10;
		}
	}
}

*/
//Odd
import java.util.*;
class remender
{
	public static void main(String args[])
	{
		
		int n=543678,i,rem;
		i=n;
		int sum=0;
		while(i!=0)
		{
			rem=i%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
				System.out.println(rem+"");
					
				
			}
			i=i/10;
		}
		System.out.println("Sum="+sum);

	}
}

