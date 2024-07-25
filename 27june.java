/*
Ola has instroduce the insurance policy for Drivers. If the driver is married insurance will be given.If the driver is unmarried then ask age, gender, if Driver is male and age>32 then insurance will be given. if Driver is Female and age>26 then insurance will be given.
--------------------------------------------------------------------------------------------------------------------------------------------------------------
MaritalStatus :- ms='M'
gen male=m, female=f
int age
*/


import java.util.*;
class insurance
{
	public static void main(String args[])
	{
		Scanner sp = new Scanner(System.in);
		char ms,gen;
		int age;
		System.out.println("Enter MaritalStatus of an Driver M for married or U for Unmarried");
		ms=sp.next().charAt(0);
		if (ms=='M')
              	System.out.println(" Insurance has been given");
          	else 
                {
                	System.out.println(" Enter gender  of an Driver Male for m  female for f ");
                  	gen=sp.next().charAt(0);
                  	System.out.println(" Enter age of  Driver  ");
                  	age=sp.nextInt();
			if (gen=='m')
                        {
				if(age>32)
                       		System.out.println(" Insurance has been given");
                      		else
                 		System.out.println(" Insurance has not been given");
                       	}//if close First Cod for Male
			if (gen=='f')
			{
				if(age>26)
                           	System.out.println("Insurance has been given");
                         	else	
                             	System.out.println("Insurance has not been given");
                       	}//if close First Cod for Female
		}//else 


	}//main
}//class