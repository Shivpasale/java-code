//take a 7 digits number find the count of digit

import java.util.*;
class countdigit1
{
	public static void main(String args[])
	{
		int i,n=1234567;
		int count=0;
		for(i=n;i!=0;i=i/10)
		{
			count++;
		}
		System.out.println(count);
	}
}