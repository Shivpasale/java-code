import java.util.*;
class nested1
{
	public static void main(String args[])
	{
		int i,j;
		i=1;
		while(i<=5)
		{
			j=1;
			while(j<=5)
			{
				System.out.print(i+"x"+j+", ");
				j++;
			}
			System.out.println("");
			i++;
		}

	}
}