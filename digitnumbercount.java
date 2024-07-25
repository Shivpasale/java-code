/*
//digit Number Count.
import java.util.*;
class digit
{
	public static void main(String args[])
	{
		int i,n=23456,c=0;
		i=n;
		while(i!=0)
		{
			c++;
			i=i/10;
		}
		System.out.println("Number Of Digit="+c);
	}
}

*/

import java.util.*;
class digit
{
	public static void main(String args[])
	{
		long i,n=2345679537867457L,c=0;
		i=n;
		while(i!=0)
		{
			c++;
			i=i/10;
		}
		System.out.println("Number Of Digit="+c);
	}
}

