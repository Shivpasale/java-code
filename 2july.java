/*
! = Not logical Operator(&&, ||, !)

Inverter Operator: ! T=F
		     ! F=T

*/

/*
import java.util.*;
class demo

{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		int A=56,B=78,C=98;
		System.out.println("check Grater one=");
		A=sp.nextInt();
		B=sp.nextInt();
		C=sp.nextInt();
		if(!(A>B) && !(A>C))
		{
			System.out.println("A is Greator");
		}
		else
		{
			System.out.println("Not Greator");
		}
	}
}

*/

/*
else if(ladder of if):It starts form if (cond), inside if condition is true then execute the statement, if the condition under if becomes false then it goes else if(cond) becomes false then it goes to next else and so on. If none of the condition match it executes else part.

if(cond)
statement
else if(cond)
statement
else if(cond)
statement
else if(cond)
statement
else 
statement

*/

/*
import java.util.*;
class demo

{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		int n=1;
		System.out.println("Enter Day=");
		n=sp.nextInt();
		if(n==1)
		System.out.println("Monday");
		else if(n==2)
		System.out.println("Tuesday");
		else if(n==3)
		System.out.println("Thursday");
		else if(n==4)
		System.out.println("Wednesday");
		else if(n==5)
		System.out.println("Friday");
		else if(n==6)
		System.out.println("Saturday");
		else if(n==7)
		System.out.println("Sunday");
		else
		System.out.println("!wrong Choice.");

	}
}
*/

import java.util.*;
class demo

{
	public static void main(System args[])
	{
		Scanner sp=new Scanner(System.in);
		int n=1;
		System.out.println("Enter A Day=");
		n=sp.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("Thur");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("!Wrong Choice");
		}
		
	}
}