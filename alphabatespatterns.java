//Alphabates Patterns:-
/*
import java.util.*;
class alphabatespatterns
{
	public static void main(String args[])
	{
		int i=65;
		for(i=65;i<=90;i++)
		{
			System.out.print((char)i+" ");
		}
	}
}

import java.util.*;
class alphabatespatterns
{
	public static void main(String args[])
	{
		int i, j;
		
		for(i=5;i>=1;i--)
		{
			char ch='A';
			for(j=1;j<=i;j++)
			{
				System.out.print(ch +" ");
				ch++;
			}	
						
			System.out.println();
		}
		
	}
}
*/
import java.util.*;
class alphabatespatterns
{
	public static void main(String args[])
	{
		int i, j;
		
		for(i=5;i>=1;i--)
		{
			for(j=5-i;j>=1;j--)
			System.out.print(" ");

			char ch='A';
			for(j=1;j<=i;j++)
			{
				System.out.print(ch +" ");
				ch++;
			}	
						
			System.out.println();
		}
		
	}
}
