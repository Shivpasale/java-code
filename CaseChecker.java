import java.util.Scanner;

class CaseChecker 
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a character: ");
        	char ch = scanner.next().charAt(0);
		if (isUpperCase(ch)) 
		{
            		System.out.println(ch + " is an uppercase alphabet.");
        	} 
		else if (isLowerCase(ch)) 
		{
            		System.out.println(ch + " is a lowercase alphabet.");
        	} 
		else 
		{
            		System.out.println(ch + " is not an alphabet.");
        	}
    	}
    	public static boolean isUpperCase(char ch) 
	{
        	return ch >= 'A' && ch <= 'Z';
    	}
	public static boolean isLowerCase(char ch) 
	{
        	return ch >= 'a' && ch <= 'z';
    	}
}