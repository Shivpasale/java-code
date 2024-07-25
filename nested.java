/*
Nested if = one if work inside another if, in this condition both the if , must be true

Syntax:-
*/
/*
import java.util.*;
class shiv
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		int a=100,b=200,c=300;
	
	if(a>b)
	{
		if(a<c)
		System.out.println("A is Grator");
	}
	if(b>a)
	{
		if(b>c)
		System.out.println("B is Grator");
	}
	if (c>a)
	{
		if(c<b)
		System.out.println("c is Grator");
	}

	}	
}
*/

import java.util.*;
class shiv
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		int a,b,c,d,e,f;
		a=sp.nextInt();
		b=sp.nextInt();
		c=sp.nextInt();
		d=sp.nextInt();
		e=sp.nextInt();
		f=sp.nextInt();

		if(a<b)
	{
		if(a>c)
		System.out.println("A is Grator");
	}
	if(b<a)
	{
		if(b>c)
		System.out.println("B is Grator");
	}
	if (c<a)
	{
		if(c>b)
		System.out.println("c is Grator");
	}

	
	
	}
}