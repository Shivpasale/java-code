import java.util.*;
class dowhilesum
{
	public static void main(String args[])
	{
		int sum=0;
		int i,rem;
		int n=8766;
		i=n;
		do
		{
			rem=i%10;
			System.out.println(rem);
			sum=sum+rem;
			i=i/10;
		}
		while(i!=0);
		System.out.println("Sum="+sum);
	}
}