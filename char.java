/*
import java.util.*;
class chara
{
	public static void main(String args[])
	{
        	Scanner x= new Scanner(System.in);
           	System.out.println("Enter any character:");
          	char ch=x.next().charAt(0);
          	System.out.println("char="+ch);
           	if(ch>='a')
           	{
             		if(ch<='z')
              		System.out.print("it is character");
                }
            	if(ch>='A')
           	{
             		if(ch<='Z')
              		System.out.print("it is character");
          	}
                else
		{
               	System.out.print("it is not character");
		}
	}
}

*/
import java.util.*;

class shiv 
{
    public static void main(String[] args) 
	{
        	Scanner sp = new Scanner(System.in);
        	System.out.print("Enter a number:");
        	int number = sp.nextInt();
        	if (number % 6 == 0) 
	{
            	if (number % 9 == 0) {
                System.out.println(number + " is divisible by both 6 and 9.");
	} 
	else 
	{
                System.out.println(number + " is divisible by 6 but not by 9.");
	}
        } 
	else 
	{
            System.out.println(number + " is not divisible by 6, hence cannot be divisible by both 6 and 9.");
        }
        }
}

/*
import java.util.*;
class state
{
  public static void main(String [] args)
  {	
    int a,b,c,d,e;
    Scanner p=new Scanner(System.in);
    System.out.print("enter a=");
    a=p.nextInt();
     System.out.print("enter b=");
    b=p.nextInt();
      System.out.print("enter c=");
    c=p.nextInt();
       System.out.print("enter d=");
    d=p.nextInt();
      System.out.print("enter e=");
    e=p.nextInt();
    if(a<b)
     {
         if(a<c)
        { 
          
         if(a<d)
	{
          
         if(a<e)
	{

          System.out.print("a is smaller.");
        }
    }
  }
}
     if(b<a)
     {
         if(b<c)
        { 
          
         if(b<d)
	{
          
         if(b<e)
	{

          System.out.print("b is smaller.");
        }
     }

   }
}


     if(c<a)
     {
         if(c<b)
        { 
          
         if(c<d)
	{
          
         if(c<e)
	{

          System.out.print("c is smaller.");
        }

      }

   }
}

     if(d<a)
     {
         if(d<b)
        { 
          
         if(d<c)
	{
          
         if(d<e)
	{

          System.out.print("d is smaller.");
        }
     }

   }
}


       if(e<a)
     {
         if(e<b)
        { 
          
         if(e<c)
	{
          
         if(e<d)
	{

          System.out.print("e is smaller.");
        }

     }

   }
 }

}

}
*/