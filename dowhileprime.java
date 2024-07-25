/*
import java.util.*;
class dowhileprime
{
	public static void main(String args[])
	{
		int i=10;
		do
		{
			System.out.println(i+"");
			i--;		
		}
		while(i>=1);
		{
			System.out.println("This Is Prime Number");
					
		}

	}
}
*/

import java.util.*;
class dowhileprime
{
	public static void main(String args[])
	{
		int i=2; 
		int n=21;
		do
		{
			if(n%i==0)
			break;
			i++;		
		}
		while(i<=n);
		{
			if(n==i)
			System.out.println("This Is Prime Number");			
		
		else
			System.out.println("This Is NotPrime Number");
		}
	}
}
