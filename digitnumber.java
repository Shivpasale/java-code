import java.util.*;
class digitnumber
{
	public static void main(String args[])
	{
		int i,n=123456;
		int count=0;
		for(i=n;i!=0;i=i/10)
		{
			count++;
		}
		System.out.println(count);
	}
}