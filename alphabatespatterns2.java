import java.util.*;
class alphabatespatterns2
{
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		int i,k=64,j;
		
		for(i=1;i<=6;i++)
		{
			for(j=6;j>=i;j--)
			{
				
				System.out.print((char)(k+j)+" ");
			}
			System.out.println("");
		}
	}
}