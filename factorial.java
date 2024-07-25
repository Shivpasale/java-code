//Factorial Number
//!5=5*4*3*2*1

import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		int fact,i;
		fact=1;
		i=5;
		while(i>=1) 
		{
			fact=fact*i;
			i--;		
		}
		System.out.println(fact);
	}
}
