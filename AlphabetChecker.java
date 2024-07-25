import java.util.*;
class AlphabetChecker 
{
 	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a character: ");
        	char ch = scanner.next().charAt(0);
        	scanner.close();
		if (isAlphabet(ch)) 
		{
            		System.out.println(ch + " is an alphabet.");
        	}
		else 
		{
            		System.out.println(ch + " is not an alphabet.");
        	}
    	}
}
