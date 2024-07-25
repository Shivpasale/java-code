import java.util.*;
class Pasale
{
	public static void main(String args[])
	{
		int a,b,x,y;
		a=10, b=20;
		x=100,y=200;
		System.out.printf("The value of A="+a);
		System.out.println("The Value of B="+b);
		System.out.println("The value of X="+x);
		System.out.println("The Value Of Y="+y);
	}
}