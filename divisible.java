//print the list of numbers which is completely divisibal by 5 and 11 between 2 to 300.

class Divisible 
{
	public static void main(String[] args) 
	{
        	for (int i = 2; i<= 300; i++) 
		{
                	if (i%5==0 && i%11==0) 
			{
                		System.out.println(i);
            		}
        	}
    	}
}
