import java.util.*;
class FactorsPrinter 
{
    	public static void main(String[] args) 
	{
        	Scanner sp = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int n = sp.nextInt();
		int x=1;
        	System.out.print("Factors of " + n + ": ");
        	do 
		{
		 	if (n % x== 0) 
			{
                		System.out.print(x+ " ");
            		}
            		x++;
        	} 
		while (x<=n);
		System.out.println();     
	}
}
