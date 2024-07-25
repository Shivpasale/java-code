import java.util.*;
class Fibonacciseries
{
	public static void main(String args[])
	{
		int i,n=10,a=0,b=1,sum=0;
		System.out.println(a +"\n"+b);
		for(i=0;i<n;i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
				

		}
		
		
	}
} 