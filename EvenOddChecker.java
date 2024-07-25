import java.util.*;
class EvenOddChecker 
{
	public static void main(String[] args) 
	{
        	Scanner sp = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int A = sp.nextInt();	
		if (A % 2 == 0) 
	{
            	System.out.println(A + " is even.");
        } 
	else 
	{
            System.out.println(A + " is odd.");
        }
    }
}