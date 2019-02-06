import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
	
		if((a>=b)&&(a>=c))
		{
        System.out.println(a);
		}
        else if ((b>=a)&&(b>=c))  
        {
    		System.out.println(b);
        }
        else
        {
            System.out.println(c);
		}
		
	}
}
